package examen;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax. swing.JLabel;
import javax. swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame implements ActionListener{
    //variables
    JPanel p1,p12;
    JButton b1,b2,b3,b4,b5;
    JLabel l1,e2,l3,l4,eti;
    ImageIcon img2;
    Color colorfra;
    Double saldo=1000.50;
    
    public void menu(){
     setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar programa al finalizarlo
        setUndecorated(true);//quita iconos  de minimizar, maximizar y cerrar
        setSize(1100,600);//tamaño de la ventana
        setLocationRelativeTo(null);//ubicar al centro   
        ////fondo
        ImageIcon img=new ImageIcon("src/img/fondo.jpg");
        JLabel imgUno=new JLabel(img);
        imgUno.setBounds(0,0,1100,600);
        //Logo
        img2=new ImageIcon("src/img/logo.png");
        e2=new JLabel(img2);
        e2.setBounds(450,15,200,200);
        //texto1
        l3=new JLabel("SELECCIONE SU OPERACIÓN");
        l3.setFont(new Font("Serif white",Font.ITALIC,20));
        l3.setBounds(380,210,400,40);
        //boton saldo
        b1=new JButton(new ImageIcon("src/img/saldo.png"));
        b1.setBounds(45, 300, 250, 70);
        b1.addActionListener(this);
        //boton de retiro
        b2=new JButton(new ImageIcon("src/img/retiro.png"));
        b2.setBounds(45, 400, 250, 70);
        b2.addActionListener(this);
        //boton deposito
        b3=new JButton(new ImageIcon("src/img/deposito.jpg"));
        b3.setBounds(800, 300, 250, 70);
        b3.addActionListener(this);
        //boton de pago de servicio
        b4=new JButton(new ImageIcon("src/img/serv.png"));
        b4.setBounds(700, 400, 350, 70);
        b4.addActionListener(this);
        //boton de salir
        b5=new JButton(new ImageIcon("src/img/salir.png"));
        b5.setBounds(800, 10, 250, 70);
        b5.addActionListener(this);
        ///
        p1=new JPanel();
        p1.setLayout(null);
        p1.add(e2);
        p1.add(l3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(imgUno);
        
        add(p1);
        setVisible(true);
        
    }  
   public void actionPerformed(ActionEvent accion){
      if(accion.getSource()==b1){
           JOptionPane.showMessageDialog(null,"Tu saldo es $"+saldo,"Saldo",JOptionPane.INFORMATION_MESSAGE);
       }
      //if(accion.getSource()==b2){
          // this.setVisible(false);
          // Deposito corre=new Retiro();
           //corre.funciones();
       //}
       if(accion.getSource()==b3){
           this.setVisible(false);
           Deposito corre=new Deposito();
           corre.funcionesDep();
       }
       if(accion.getSource()==b4){
           this.setVisible(false);
           Servicios llamar=new Servicios();
       }
       if(accion.getSource()==b5){
           this.setVisible(false);
           codigo ven=new codigo();
       }
           
   }
    }

