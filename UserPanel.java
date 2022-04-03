/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeGamev2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class UserPanel implements ActionListener,MouseListener{
    JFrame jf1;
    JLabel jl1,jl2;
    JTextField jt1,jt2;
    JButton jb1,jb2;

    public UserPanel () 
    {
        jf1=new JFrame("TicTacToe Game By Mr. Papun");
        jf1.setSize(600, 400);
        jf1.setLayout(null);
        jf1.setDefaultCloseOperation(3);
        
        jl1=new JLabel("Player 1: ");
        jl1.setBounds(100, 30, 150, 30);
        jf1.add(jl1);
        
        
        jl2=new JLabel("Player 2: ");
        jl2.setBounds(100, 60, 150, 30);
        jf1.add(jl2);
        
        jt1=new JTextField();
        jt1.setBounds(160,38 , 110, 20);
        jt1.addMouseListener(this);
        jf1.add(jt1);
        
        jt2=new JTextField();
        jt2.setBounds(160,68 , 110, 20);
        jt2.addMouseListener(this);
        jf1.add(jt2);
        
        jb1=new JButton("Start");
        jb1.setBounds(140, 100, 100, 20);
        jb1.addActionListener(this);
        jb1.addMouseListener(this);
        jf1.add(jb1);
        
          jb2=new JButton("Close");
        jb2.setBounds(250, 100, 100, 20);
        jb2.addActionListener(this);
        jb2.addMouseListener(this);
        jf1.add(jb2);
        
        
        jf1.setVisible(true);
    }
    public static void main(String[] args) {
        new UserPanel();
                
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==jb1)
        {
         String player1=jt1.getText();
         String player2=jt2.getText();
        GamePanel gp=new GamePanel(player1,player2 );
        gp.openGamePannel();
        jf1.setVisible(false);

        }
        if(e.getSource()==jb2)
        {
            System.exit(0);
        }
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==jb1){
            jb1.setBackground(Color.cyan);
        }
        if(e.getSource()==jb2){
            jb2.setBackground(Color.red);
        }
        
        if(e.getSource()==jt1){
            jt1.setBackground(Color.black);
            jt1.setForeground(Color.white);
        }
        if(e.getSource()==jt2){
            jt2.setBackground(Color.black);
            jt2.setForeground(Color.white);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
          if(e.getSource()==jb1){
            jb1.setBackground(null);
        }
        if(e.getSource()==jb2){
            jb2.setBackground(null);
        }
        
        jt1.setBackground(null);
        jt1.setForeground(null);
        jt2.setBackground(null);
        jt2.setForeground(null);
 
    }
    
    }
            
    

