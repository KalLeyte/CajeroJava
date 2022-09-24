package examen;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Servicios extends JFrame implements ActionListener{
   JButton regresar, cfe,izzi, pagar, cancelar, continuar, terminar;
   JLabel nomServ, logoServ, nomReferencia, nomMonto;
   ImageIcon img;
   Color fondoserv;
   JTextField referencia, monto;
   JFrame jfpago, jfTicket;
   JTextArea areaTicket;
   String refer;
   double saldo=5000, montoServicio;
   
   public Servicios(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar programa al finalizarlo
        setUndecorated(true);//quita iconos  de minimizar, maximizar y cerrar
        setSize(1100,600);//tamaño de la ventana
        setLocationRelativeTo(null);//ubicar al centro
        
        ////fondo
        ImageIcon fondo=new ImageIcon("src/img/fondo.jpg");
        JLabel fn=new JLabel(fondo);
        fn.setBounds(0,0,1100,600);
        //regresar
        regresar=new JButton(new ImageIcon("src/img/atras.jpg"));
        regresar.setBounds(30,10,64,64);
        regresar.addActionListener(this);
        
        JLabel mensajeTit=new JLabel(new ImageIcon("src/img/MensajeServicios.jpg"));
        mensajeTit.setBounds(250,50,395,52);
        
        cfe=new JButton(new ImageIcon("src/img/cfe.png"));
        cfe.setBounds(45, 300, 250, 70);
        cfe.addActionListener(this);
        
        izzi=new JButton(new ImageIcon("src/img/izzi.png"));
        izzi.setBounds(800, 300, 250, 70);
        izzi.addActionListener(this);
        
        JPanel ventana=new JPanel();
        ventana.setBounds(0,0,1100,600);
        
        ventana.add(mensajeTit);
        ventana.add(regresar);
        ventana.add(cfe);
        ventana.add(izzi);
        
        
        ventana.add(fn);
        add(ventana);
        setVisible(true);
        
   }
   public void vtnPago(){
     jfpago= new JFrame();
     jfpago.setUndecorated(true);
     jfpago.setSize(600,400);
     jfpago.setLocationRelativeTo(null);
     //contenido
     logoServ=new JLabel();
     logoServ.setBounds(50,50,50,300);
     
     nomServ= new JLabel();
     nomServ.setBounds(150,55,200,30);
     
     nomReferencia=new JLabel("Número de referencia");
     nomReferencia.setBounds(50,120,150,40);
     referencia= new JTextField();
     referencia.setBounds(50,170,200,40);
     
     nomMonto=new JLabel("Monto");
     nomMonto.setBounds(300,120,150,40);
     monto=new JTextField();
     monto.setBounds(300,170,200,40);
     
     pagar=new JButton("Pagar");
     pagar.setBounds(320,280,100,40);
     pagar.addActionListener(this);
     
     cancelar=new JButton("Cancelar");
     cancelar.setBounds(120,280,100,40);
     cancelar.addActionListener(this);
     
     JPanel vPago=new JPanel();
     vPago.setLayout(null);
     vPago.setBounds(0,0,500,300);
     
     vPago.add(nomServ);
     vPago.add(logoServ);
     vPago.add(referencia);
     vPago.add(nomReferencia);
     vPago.add(nomMonto);
     vPago.add(monto);
     vPago.add(pagar);
     vPago.add(cancelar);
     
     jfpago.add(vPago);
     jfpago.setVisible(true);
   }
   public void impTicket(){
       jfTicket = new JFrame();
       jfTicket.setUndecorated(true);
       jfTicket.setSize(400,600);
       jfTicket.setLocationRelativeTo(null);
       
       logoServ= new JLabel();
       logoServ.setBounds(50,50,50,30);
       logoServ.setIcon(img);
       
       nomServ=new JLabel("Pago de servicio");
       nomServ.setBounds(120,50,200,30);
       
       areaTicket= new JTextArea();
       areaTicket.setBounds(50,100,350,400);
       areaTicket.setEditable(false);
       areaTicket.setText("  Cajero: El manco feliz S.A de C.V \n\n"
               +"=======================================================\n\n"
               +"Referencia: "+refer
               +"\nFolio: 78402\n"
               +"\n \tMonto: $"+montoServicio
               +"\n\n"
               +"========================================================\n"
               +"La operación se realizó por bancos El manco feliz\n"
               +"Te atendio: Kal Leyte\n\n"
               +"       *CONSERVE ESTE COMPROBANTE*\n\n"
               +"Muchas gracias por su pago\n\n"
               +"Tel: 01 800 433 2000\n"
               +"=========================================================\n");
        continuar= new JButton("Realizar otra operación");
        continuar.setBounds(50,460,300,30);
        continuar.setBackground(Color.white);
        continuar.addActionListener(this);
        terminar= new JButton("Terminar y salir");
        terminar.setBounds(50,520,300,30);
        terminar.setBackground(Color.white);
        terminar.addActionListener(this);
        
        JPanel PTicket= new JPanel();
        PTicket.setLayout(null);
        PTicket.setBounds(0,0,500,300);
        PTicket.setBackground(Color.white);
        
        PTicket.add(terminar);
        PTicket.add(continuar);
        PTicket.add(areaTicket);
        PTicket.add(nomServ);
        PTicket.add(logoServ);
        
        jfTicket.add(PTicket);
        jfTicket.setVisible(true);
    } 
    public void actionPerformed (ActionEvent accion){
        if(accion.getSource()==regresar){
            this.setVisible(false);
            Inicio inicio= new Inicio();
            inicio.menu();
        }
        
        if(accion.getSource()==cfe){
            this.setVisible(false);
            fondoserv=new Color(204, 255, 204);
            vtnPago();
            img= new ImageIcon("src/img/iconCFE.jpg");
            logoServ.setIcon(img);
            nomServ.setText("Pago de servicio CFE"); 
        }
       
        if(accion.getSource()==izzi){
            this.setVisible(false);
            fondoserv=new Color(255, 179, 128);
            vtnPago();
            img= new ImageIcon("src/img/iconIZZI.jpg");
            logoServ.setIcon(img);
            nomServ.setText("Pago de servicio IZZI"); 
        }
        if(accion.getSource()==cancelar){
            jfpago.setVisible(false);
            JOptionPane.showMessageDialog(null,"Pago Cancelado ","", JOptionPane.ERROR_MESSAGE);
            
            Inicio ven=new Inicio();
            ven.menu();
        }
        if(accion.getSource()==pagar){
          
            refer=referencia.getText();
            montoServicio=Double.valueOf(monto.getText());
            
            if(!"".equals(referencia.getText()) || !"".equals(monto.getText())){
                if(saldo>montoServicio){
                        saldo=saldo-montoServicio;
                        referencia.setText("");
                        monto.setText("");
                        JOptionPane.showMessageDialog(null,"Servicio pagado exitosamente ","Exitoso ", JOptionPane.INFORMATION_MESSAGE);
                        jfpago.setVisible(false);
                        impTicket();

                }else{
                    JOptionPane.showMessageDialog(null,"El saldo es insuficiente "+saldo,"", JOptionPane.ERROR_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Campos Vacios ","", JOptionPane.ERROR_MESSAGE);
            }
                        
        }
        if(accion.getSource()==continuar){
            jfTicket.setVisible(false);
            Inicio ven=new Inicio();
            ven.menu();
        }
        if(accion.getSource()==terminar){
            jfTicket.setVisible(false);
            JOptionPane.showMessageDialog(null,"Gracias por usar el servicio","", JOptionPane.PLAIN_MESSAGE);
            codigo ingresar= new codigo();
        }
        
    }
   }

