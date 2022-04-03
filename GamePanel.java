/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeGamev2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class GamePanel implements ActionListener{
//    static int c=0;
    int c=0;
    String str="",winnerName="";
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    Color color;
    String player1;String player2;
    
    GamePanel(String player1,String player2 ) 
    {
        this.player1=player1;
        this.player2=player2;
        
    }
    
    void openGamePannel()
    {
         
//        try{
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        Creating Frame
        
        jf=new JFrame(player1+" tuns");
        
        
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(3);
       
//        GridLayout gd=new GridLayout(3,3);
        jf.setLayout(new GridLayout(3,3));
//   button creation         
        jb1=new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);
        
       jb2=new JButton();
       jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3=new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
         jb4=new JButton();
         jb4.addActionListener(this);
        jf.add(jb4);
        
         jb5=new JButton();
         jb5.addActionListener(this);
        jf.add(jb5);
        
         jb6=new JButton();
         jb6.addActionListener(this);
        jf.add(jb6);
        
         jb7=new JButton();
         jb7.addActionListener(this);
        jf.add(jb7);
        
         jb8=new JButton();
         jb8.addActionListener(this);
        jf.add(jb8);
        
         jb9=new JButton();
         jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
       
    }
        @Override
    public void actionPerformed(ActionEvent e) {
           c=c+1;
           if(c%2==0){
              color=Color.RED;
               str="X";
               jf.setTitle(player1+ " turns");
           }
           else{
              color=Color.CYAN;
               str="O";
               jf.setTitle(player2+ " turns");
           }
         
           
        
        if(e.getSource()==jb1)
        {
            
            jb1.setText(str);
            Font f=new Font("Arial",1,150);
            jb1.setFont(f);
            jb1.setBackground(color);
            jb1.setEnabled(false);
            
                        
        }
        
        if(e.getSource()==jb2)
        {
            jb2.setText(str);
            Font f=new Font("Arial",1,150);
            jb2.setFont(f);
            jb2.setBackground(color);
            jb2.setEnabled(false);
            
       
        }
        
        if(e.getSource()==jb3)
        {
 
            jb3.setText(str);
            Font f=new Font("Arial",1,150);
            jb3.setFont(f);
            jb3.setBackground(color);
            jb3.setEnabled(false);
            
        }
        
        if(e.getSource()==jb4)
        {
            jb4.setText(str);
            Font f=new Font("Arial",1,150);
            jb4.setFont(f);
            jb4.setBackground(color);
            jb4.setEnabled(false);
        }
        
        if(e.getSource()==jb5)
        {
         
            jb5.setText(str);
            Font f=new Font("Arial",1,150);
            jb5.setFont(f);
            jb5.setBackground(color);
            jb5.setEnabled(false);
        }
        
        if(e.getSource()==jb6)
        {
           
            jb6.setText(str);
            Font f=new Font("Arial",1,150);
            jb6.setFont(f);
            jb6.setBackground(color);
           jb6.setEnabled(false);
        }
        
        if(e.getSource()==jb7)
        {
            jb7.setText(str);
            Font f=new Font("Arial",1,150);
            jb7.setFont(f);           
            jb7.setBackground(color);
            jb7.setEnabled(false);
        }
        
        if(e.getSource()==jb8)
        {
            jb8.setText(str);
            Font f=new Font("Arial",1,150);
            jb8.setFont(f);
            jb8.setBackground(color);
            jb8.setEnabled(false);
           }
        
        if(e.getSource()==jb9)
        {
            jb9.setText(str);
            Font f=new Font("Arial",1,150);
            jb9.setFont(f);
            jb9.setBackground(color);
            jb9.setEnabled(false);
        }
        winCheck();
    }
    
//    for checking the wining
    void winCheck()
    {
//        Horizontal area check
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText()!="")
        {
            winnerName();
            
            restart();
        }
        
        else if(jb4.getText()==jb5.getText() && jb4.getText()==jb6.getText() &&jb4.getText()!="")
        {
            winnerName();
            restart();
        }
        
        else if(jb7.getText()==jb8.getText() && jb7.getText()==jb9.getText()&&jb7.getText()!="")
        {
            winnerName();
            restart();

        }
            //            Vertical area check
        else if(jb1.getText()==jb4.getText() && jb1.getText()==jb7.getText()&&jb1.getText()!="")
        {
            winnerName();
            restart();
        }
        else if(jb2.getText()==jb5.getText() && jb2.getText()==jb8.getText()&&jb2.getText()!="")
        {
            winnerName();
            restart();
        }
        else if(jb3.getText()==jb6.getText() && jb3.getText()==jb9.getText()&&jb3.getText()!="")
        {
            winnerName();
            restart();
        }
        else if(jb1.getText()==jb4.getText() && jb1.getText()==jb7.getText()&&jb1.getText()!="")
        {
            winnerName();
            restart();
        }
//            Diagonal area check
        else if(jb1.getText()==jb5.getText() && jb1.getText()==jb9.getText()&&jb1.getText()!="")
        {
            winnerName();
            restart();
        }
        else if(jb3.getText()==jb5.getText() && jb3.getText()==jb7.getText()&&jb3.getText()!="")
        {
            winnerName();
            restart();
        }
//        Draw
        else if(c==9) 
        {
            
            JOptionPane.showMessageDialog(jf,"GAME OVER");
            restart();
             
        }
            
           
    }
    
    
    void restart()
    {
        int i=JOptionPane.showConfirmDialog(jf,"Do you want to restart the game");
        if(i==0)
        {
            c=0;
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");
            setDefultBtncolor();
            
            buttonEnableing(true);
        }
        else if(i==1)
        {
            System.exit(0);
        }
        else if(i==2)
        {
            buttonEnableing(false);
            
        }
        else if(i==-1)
        {
            JOptionPane.showMessageDialog(jf, "hello");
        }

        
    }
//    for button enable
    void buttonEnableing(boolean  b)
    {
        
            jb1.setEnabled(b);
            jb2.setEnabled(b);
            jb3.setEnabled(b);
            jb4.setEnabled(b);
            jb5.setEnabled(b);
            jb6.setEnabled(b);
            jb7.setEnabled(b);
            jb8.setEnabled(b);
            jb9.setEnabled(b);
    }
    
    void setDefultBtncolor()
    {
        jb1.setBackground(null);
        jb2.setBackground(null);
        jb3.setBackground(null);
        jb4.setBackground(null);
        jb5.setBackground(null);
        jb6.setBackground(null);
        jb7.setBackground(null);
        jb8.setBackground(null);
        jb9.setBackground(null);
        
        
        
        
        
    }
    void winnerName()
    {
        if(str.equals("O"))
        {
            winnerName=player1;
            
        }
        else if(str.equals("X"))
        {
            winnerName=player2;
            
        }
        JOptionPane.showMessageDialog(jf, "Winner is: "+winnerName);
    }
    
   
    }

    
   
