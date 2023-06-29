
package quize;

//import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name,int score){
       
        setBounds( 600,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon il =new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 =il.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300, 250);
        add(image);
        
        JLabel heading=new JLabel("Thank You "+ name + " for playing Simle Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        
        JLabel lscore=new JLabel(" Your Score is "+ score );
        lscore.setBounds(350,200,300,30);
        lscore.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(lscore);
        
         JButton submit=new JButton("play Again");
        submit.setBounds(380, 270, 120, 30);
//        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.white);
//        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
}
    public static void main(String[] args) {
        new Score("user",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
}
