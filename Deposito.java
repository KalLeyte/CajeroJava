package examen;
import java.awt.Color;
import java.awt.Font;
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

public class Deposito extends JFrame implements ActionListener{
    Color colorfra;
    JTextField t1;
    JButton b6, b7,b8,b9,b10,b11,atras, salir, continuar, terminar;
    JFrame retiro;
    JLabel l4,eti;
    JPanel p2;
    Double saldo=3500.00,monto,reti;
    JFrame jfTicket;
    JLabel logoServ, nomServ;
    JTextArea areaTicket;
    
    public void funcionesDep(){
    setUndecorated(true);
    setSize(700,650);
    setLocationRelativeTo(null);
    
    colorfra=new Color(179,230,255);
    
    eti=new JLabel("Deposito");
    eti.setFont(new Font("Serif",Font.ITALIC,50));
    eti.setBounds(300,30,400,60);
    
    l4=new JLabel("Cuanto desea depositar");
    l4.setBounds(255,400,150,50);
    l4.setVisible(false);
    
    t1=new JTextField();
    t1.setBounds(250,470,200,50);
    t1.setVisible(false);
    b11=new JButton("Aceptar");
    b11.setBounds(250,540,200,50);
    b11.addActionListener(this);
    b11.setVisible(false);
    
    b6=new JButton("$100");
    b6.setBounds(50,200,200,70);
    b6.addActionListener(this);
    b7=new JButton("$200");
    b7.setBounds(50,300,200,70);
    b7.addActionListener(this);
    b8=new JButton("$500");
    b8.setBounds(450,200,200,70);
    b8.addActionListener(this);
    b9=new JButton("$1000");
    b9.setBounds(450,280,200,70);
    b9.addActionListener(this);
    b10=new JButton("Otro");
    b10.setBounds(450,370,200,70);
    b10.addActionListener(this);
    
    atras=new JButton(new ImageIcon("src/img/atras.jpg"));
    atras.setBounds(30,10,64,64);
    atras.addActionListener(this);
    
    p2=new JPanel();
    p2.setLayout(null);
    p2.setBounds(0,0,600,400);
    p2.setBackground(colorfra);
    p2.add(eti);
    p2.add(l4);
    p2.add(t1);
    p2.add(b6);
    p2.add(b7);
    p2.add(b8);
    p2.add(b9);
    p2.add(b10);
    p2.add(b11);
    p2.add(atras);
    
    add(p2);
    setVisible(true);
    }
    public void impTicket(){
       jfTicket = new JFrame();
       jfTicket.setUndecorated(true);
       jfTicket.setSize(400,600);
       jfTicket.setLocationRelativeTo(null);
       
       ImageIcon img = new ImageIcon("iconBanco.png");
       logoServ= new JLabel(img);
       logoServ.setBounds(50,45,50,50);
       
       nomServ = new JLabel("Deposito de efectivo");
       nomServ.setBounds(120,50,200,30);
       
       areaTicket= new JTextArea();
       areaTicket.setBounds(50,100,350,400);
       areaTicket.setEditable(false);
       areaTicket.setText("  Cajero: El manco feliz S.A de C.V \n\n"
               +"=======================================================\n\n"
               +"Deposito de efectivo"
               +"\nFolio: 78402\n"
               +"\n \tMonto: $"+monto
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
      public void actionPerformed (ActionEvent presiona){
        if(presiona.getSource()==b6){
            saldo+=100;
            monto=100.00;
            JOptionPane.showMessageDialog(null,"Deposito exitoso, tu saldo es: $"+saldo,"Saldo",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            impTicket();
        }
        if(presiona.getSource()==b7){
           saldo+=200;
           monto=200.00;
           JOptionPane.showMessageDialog(null,"Deposito exitoso, tu saldo es: $"+saldo,"Saldo",JOptionPane.INFORMATION_MESSAGE);
           this.setVisible(false);
           impTicket(); 
        }
        if(presiona.getSource()==b8){
           saldo+=500;
           monto=500.00;
           JOptionPane.showMessageDialog(null,"Deposito exitoso, tu saldo es: $"+saldo,"Saldo",JOptionPane.INFORMATION_MESSAGE);
           this.setVisible(false);
           impTicket(); 
        }
        if(presiona.getSource()==b9){
           saldo+=1000;
           monto=1000.00;
           JOptionPane.showMessageDialog(null,"Deposito exitoso, tu saldo es: $"+saldo,"Saldo",JOptionPane.INFORMATION_MESSAGE);
           this.setVisible(false);
           impTicket(); 
        }
        if(presiona.getSource()==b10){
           l4.setVisible(true);
           t1.setVisible(true);
           b11.setVisible(true);
        }
       if(presiona.getSource()==b11){
           reti=Double.valueOf(t1.getText());
           saldo+=reti;
           monto=reti;
           JOptionPane.showMessageDialog(null,"Deposito exitoso, tu saldo es: $"+saldo,"Saldo",JOptionPane.INFORMATION_MESSAGE);
           this.setVisible(false);
           impTicket();
        }
       if(presiona.getSource()==atras){
          this.setVisible(false);
          Inicio letsGo=new Inicio();
          letsGo.menu();
        }
       if(presiona.getSource()==continuar){
         jfTicket.setVisible(false);
          Inicio ven=new Inicio();
          ven.menu();
        }
       if(presiona.getSource()==terminar){
          jfTicket.setVisible(false);
          codigo ven=new codigo();
        }
}
      
}

