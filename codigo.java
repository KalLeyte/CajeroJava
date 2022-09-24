package examen;

//paquetes
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class codigo extends JFrame implements ActionListener{
   JButton salir,ingresar;
   JTextField user,pin;
   JLabel et1,et2;
   
    public  codigo(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar programa al finalizarlo
        setUndecorated(true);//quita iconos  de minimizar, maximizar y cerrar
        setSize(500,600);//tamaño de la ventana
        setLocationRelativeTo(null);//ubicar al centro
        
        ImageIcon fondo=new ImageIcon("src/img/bg_login.jpg");
        JLabel jlFondo=new JLabel(fondo);
        jlFondo.setBounds(0,0,500,600);
        
        ImageIcon logo=new ImageIcon("src/img/logo.png");
        JLabel logoImg=new JLabel(logo);
        logoImg.setBounds(0,0,500,200);
        
        ImageIcon us=new ImageIcon("src/img/usuario.png");
        JLabel jlUser=new JLabel(us);
        jlUser.setBounds(90,220,32,32);
        
        JLabel txtUser= new JLabel("Usuario");
        txtUser.setForeground(Color.white);
        txtUser.setBounds(130,190,50,20);
        user= new JTextField();
        user.setBounds(130,220,270,40);
        
        ImageIcon imgPin=new ImageIcon("src/img/llave.png");
        JLabel jlPin=new JLabel(imgPin);
        jlPin.setBounds(90,325,32,32);
        
        JLabel txtPin= new JLabel("PIN");
        txtPin.setForeground(Color.white);
        txtPin.setBounds(130,290,50,20);
        pin= new JTextField();
        pin.setBounds(130,320,270,40);
        
        //Bien o mal(IMAGEN)
        et1=new JLabel();
        et1.setBounds(410,220,32,32);
        
        et2=new JLabel();
        et2.setBounds(410,325,32,32);
        
        Color verde= new Color(102, 255, 102);
        Color rojo= new Color(255, 102, 102);
        salir= new JButton("Salir");
        salir.setBounds(140,400,100,50);
        salir.addActionListener(this);
        salir.setBackground(rojo);
        
        ingresar= new JButton("Ingresar");
        ingresar.setBounds(280,400,100,50);
        ingresar.addActionListener(this);
        ingresar.setBackground(verde);
        
        JPanel ventana= new JPanel();
        ventana.setLayout(null);
        ventana.setSize(500,600);
        
        ventana.add(et2);
        ventana.add(et1);
        ventana.add(ingresar);
        ventana.add(salir);
        ventana.add(jlPin);
        ventana.add(jlUser);
        ventana.add(txtPin);
        ventana.add(pin);
        ventana.add(txtUser);
        ventana.add(user);
        ventana.add(logoImg);
        ventana.add(jlFondo);
        
        add(ventana);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent accion){
        if(accion.getSource()==salir/*buttton*/){
            System.exit(0);
        }
        if(accion.getSource()==ingresar/*buttton*/){
            String userS,pinS;
            userS=user.getText();
            pinS=pin.getText();
            if("Esteban".equals(userS)){
                ImageIcon user1=new ImageIcon("src/img/bien.png");
                et1.setIcon(user1); 
                if("1234".equals(pinS)){
                   ImageIcon user2=new ImageIcon("src/img/bien.png");
                   et2.setIcon(user2); 
                    setVisible(false);
                    JOptionPane.showMessageDialog(null,"Bienvenido","Mensaje",JOptionPane.INFORMATION_MESSAGE);  
                    Inicio n= new Inicio();
                    n.menu();
                }else{
                   ImageIcon user2=new ImageIcon("src/img/mal.png");
                   et2.setIcon(user2);
                }
            }else{        
                 ImageIcon user1=new ImageIcon("src/img/mal.png");
                 et1.setIcon(user1);
                 
                 if("1234".equals(pinS)){
                   ImageIcon user2=new ImageIcon("src/img/bien.png");
                   et2.setIcon(user2); 
                }else{
                   ImageIcon user2=new ImageIcon("src/img/mal.png");
                   et2.setIcon(user2);
                }
            }
        }
    }
}
