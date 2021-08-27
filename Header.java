package com.aptravels;
import javax.swing.*;
import java.awt.*;
class Header extends JPanel
{
        JFrame jf;
        Font f;
        JLabel l1,l2;
        Header()
        {
            f = new Font("Times New Roman",Font.BOLD,18);
            setBackground(Color.BLACK);
            l1 = new JLabel("APTravels",JLabel.CENTER);
            l1.setFont(f);
            l1.setForeground(Color.WHITE);
            add(l1); 
        }
        Header(String s)
        {
            f = new Font("Times New Roman",Font.BOLD,18);
            setBackground(Color.BLACK);
            l1 = new JLabel(s,JLabel.CENTER);
            l1.setFont(f);
            l1.setForeground(Color.WHITE);
            add(l1); 
        }
}
