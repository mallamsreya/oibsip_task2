
package onlinequiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
    JLabel heading=new JLabel("Welcome " +name+ " to the Online quiz");
    heading.setBounds(30,20,490,45);
    heading.setFont(new Font("consolas",Font.BOLD,28));
    heading.setForeground(new Color(30,144,254));
    add(heading);
    
     JLabel rules=new JLabel();
    rules.setBounds(30,85,300,200);
    rules.setFont(new Font("Times News Roman",Font.PLAIN,16));
    rules.setText(
            "<html>"+
                    "1. You are allowed to submit only once"+"<br><br>"+
                    "2. Malpractice is prohibited"+"<br><br>"+
                    "3. Submit before time"+"<br><br>"+
            "<html>"  
    );
    add(rules);
    
   back=new JButton("Back");
   back.setBounds(100,310,100,25);
   back.setBackground(new Color(30,144,254));
   back.setForeground(Color.WHITE);
   back.addActionListener(this);
   add(back);
   
   start=new JButton("Start");
   start.setBounds(280,310,100,25);
   start.setBackground(new Color(30,144,254));
   start.setForeground(Color.WHITE);
   start.addActionListener(this);
   add(start);
   
   
    setSize(600,600);
    setLocation(350,100);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
             setVisible(false);
            new Quiz(name);
            
        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String [] args){
        new Rules("User");
    }
    
}



