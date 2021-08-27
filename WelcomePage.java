package com.aptravels;
import javax.swing.*;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Insets;
//import java.awt.BoxLayout;
import java.awt.event.*;
class WelcomePage
{
    JFrame jf;
        
    WelcomePage()
    {
        jf = new JFrame("Tours and Travels");
        jf.setLayout(new BorderLayout()); 
        jf.add(new Header("Welcome to APTravels"), BorderLayout.NORTH);
        jf.add(new Footer(), BorderLayout.SOUTH);
        jf.add(new CenterPage(),BorderLayout.CENTER);
        jf.setVisible(true);
        jf.setSize(800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }   
         
    public static void main(String args[]) 
    {
        new WelcomePage();
    }

    

    public void proceed()
    {
        jf.dispose();
        new DetailPage();
    }
    class CenterPage extends JPanel implements ActionListener 
    {
        ImageIcon image;
        JLabel name,imageLabel1,imageLabel2,imageLabel3;
        JTextField jt1,jt2;
        JButton b;
        Font f;
        GridBagLayout grid;
        CenterPage()
        {
            f = new Font("Times New Roman",Font.ITALIC,26);
            setLayout(grid = new GridBagLayout());  
            GridBagConstraints gbc = new GridBagConstraints();  
            setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
            imageLabel1= new JLabel(image = new ImageIcon("uttarakhand.jpg"));
            imageLabel2= new JLabel(image = new ImageIcon("himachalpradesh.jpg"));
            imageLabel3= new JLabel(image = new ImageIcon("rajasthan.jpg"));
            gbc.fill = GridBagConstraints.HORIZONTAL;  
            int top = 30;
            int left = 10;
            int bottom = 5;
            int right = 10;
            gbc.insets = new Insets(top, left, bottom, right);
            gbc.gridx = 1;  
            gbc.gridy = 0; 
            gbc.gridwidth=3;
            add(name= new JLabel("Get Memerized in the lap of Nature"),gbc);
            name.setFont(f);

            gbc.gridwidth=1;
            gbc.fill = GridBagConstraints.NONE;
            //gbc.weightx=0.5;
            gbc.gridx = 0;  
            gbc.gridy = 1; 
            //gbc.ipady = 20;  
            add(imageLabel1, gbc);
            gbc.gridx = 1; 
            gbc.gridy = 1;
            //gbc.ipady = 20; 
            add(imageLabel2,gbc);
            gbc.gridx = 2;
            gbc.gridy=1;
            //add(imageLabel3);
            add(imageLabel3,gbc);
            //this.add(jt1= new JTextField(36), gbc);   
            gbc.gridx = 1;  
            gbc.gridy = 2;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            add(b= new JButton("Next"), gbc);
            b.addActionListener(this);
            //setLayout(new GridLayout(1,3,20,0));
            
        }
        public void actionPerformed(ActionEvent e)
        {
            //u.setName(jt1.getText());
            //u.setEmail(jt2.getText());
            proceed();
        }
    } 
 
 }
 