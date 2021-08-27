package com.aptravels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.applet.Applet;
public class TourApp extends JFrame
{
    Thread th1;
    JPanel1 p1 = new JPanel1();
    JPanel3 p3;
    JPanel2 p2 = new JPanel2();
    JLabel lb;
    JPanel4 p4;
    JLabel l;
    Font f;
    TourApp()
    {
        setFont(f = new Font("Times New Roman",0,26));
        setLayout(new BorderLayout(10,10));
        //add(p4 = new JPanel4(),BorderLayout.LINE_START);
        //add(p1 = new JPanel1(),BorderLayout.CENTER);
        add(p3 = new JPanel3(),BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setForeground(Color.white);
        add(new Header(),BorderLayout.PAGE_END);
        add(new Footer(),BorderLayout.PAGE_START);
        //lb.setBackground(Color.black);
        //l.setBackground(Color.black);
        p1.r1.setSelected(true);
        p1.r2.setSelected(false);
        p1.r3.setSelected(false);
        p2.c1.setSelected(true);
        p2.c2.setSelected(true);
        p2.c3.setSelected(true);
        p2.c7.setEnabled(false);
        p2.c8.setEnabled(false);
        p2.c9.setEnabled(false);
        p2.c4.setEnabled(false);
        p2.c5.setEnabled(false);
        p2.c6.setEnabled(false);
        p1.l.setText("2,00,000");
        setVisible(true);
        setSize(1200,800);
        setResizable(false);
        p2.c = true;

    }
    public static void main(String args[]) 
    {
        new TourApp();    
    }
        class JPanel1 extends JPanel implements ItemListener
        {
        JRadioButton r1,r2,r3;
        ButtonGroup group;
        JLabel l;
        public JPanel1()
        {
            GridLayout gl;
            setFont(f = new Font("Times New Roman",Font.PLAIN,26));
            group= new ButtonGroup();
            setLayout(gl = new GridLayout(4,1,20,20));
            add(r1 = new JRadioButton("Package1",true));
            add(r2 = new JRadioButton("Package2",false));
            add(r3 = new JRadioButton("Package3",false));
            r1.setFont(f);
            r2.setFont(f);
            r3.setFont(f);
            group.add(r1);
            group.add(r2);
            group.add(r3);
            gl.setVgap(40);
            add(l = new JLabel());
            l.setFont(f);
            r1.addItemListener(this);
            r2.addItemListener(this);
            r3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource().equals(p1.r1))
        {
            /*p1.setBackground(Color.white);
            p2.setBackground(Color.white);
            r1.setBackground(Color.white);
            r2.setBackground(Color.white);
            r3.setBackground(Color.white); */

            p2.c1.setSelected(true);
            p2.c2.setSelected(true);
            p2.c3.setSelected(true);
            p2.c7.setSelected(false);
            p2.c8.setSelected(false);
            p2.c9.setSelected(false);
            p2.c4.setSelected(false);
            p2.c5.setSelected(false);
            p2.c6.setSelected(false);

            p2.c1.setEnabled(true);
            p2.c2.setEnabled(true);
            p2.c3.setEnabled(true);
            p2.c7.setEnabled(false);
            p2.c8.setEnabled(false);
            p2.c9.setEnabled(false);
            p2.c4.setEnabled(false);
            p2.c5.setEnabled(false);
            p2.c6.setEnabled(false);
            l.setText("2,00,000");
        }
        if(e.getSource().equals(p1.r2))
        {
            /*p1.setBackground(Color.blue);
            p2.setBackground(Color.blue);
            r1.setBackground(Color.blue);
            r2.setBackground(Color.blue);
            r3.setBackground(Color.blue); */
            p2.c4.setSelected(true);
            p2.c5.setSelected(true);
            p2.c6.setSelected(true);
            p2.c1.setSelected(false);
            p2.c2.setSelected(false);
            p2.c3.setSelected(false);
            p2.c7.setSelected(false);
            p2.c8.setSelected(false);
            p2.c9.setSelected(false);
            p2.c4.setEnabled(true);
            p2.c5.setEnabled(true);
            p2.c6.setEnabled(true);
            p2.c1.setEnabled(false);
            p2.c2.setEnabled(false);
            p2.c3.setEnabled(false);

            p2.c7.setEnabled(false);
            p2.c8.setEnabled(false);
            p2.c9.setEnabled(false);
            l.setText("2,00,000");
        }
        if(e.getSource().equals(p1.r3))
        {
            /*p1.setBackground(Color.yellow);
            p2.setBackground(Color.yellow);
            r1.setBackground(Color.yellow);
            r2.setBackground(Color.yellow);
            r3.setBackground(Color.yellow); */
            p2.c7.setSelected(true);
            p2.c8.setSelected(true);
            p2.c9.setSelected(true);
            p2.c1.setSelected(false);
            p2.c2.setSelected(false);
            p2.c3.setSelected(false);
            p2.c4.setSelected(false);
            p2.c5.setSelected(false);
            p2.c6.setSelected(false);
            p2.c7.setEnabled(true);
            p2.c8.setEnabled(true);
            p2.c9.setEnabled(true);
            p2.c1.setEnabled(false);
            p2.c2.setEnabled(false);
            p2.c3.setEnabled(false);
            p2.c4.setEnabled(false);
            p2.c5.setEnabled(false);
            p2.c6.setEnabled(false);
            l.setText("2,00,000");
        }
        }
    };

    class JPanel2 extends JPanel implements ItemListener, ActionListener
    {
        JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
        JButton b;
        int check;
        boolean check1=false,check2=false,check3=false,c=false;
        MyFrame mf;
        GridLayout gl;
        public JPanel2()
        {
            setFont(f = new Font("Times New Roman",0,26));
            setLayout(gl = new GridLayout(4,1,20,20));
            add(c1 = new JCheckBox("Shimla",false));
            add(c2 = new JCheckBox("Manali",false));
            add(c3 = new JCheckBox("Dharamshala",false));
            add(c4 = new JCheckBox("Mussorie",false));
            add(c5 = new JCheckBox("Nainital",false));
            add(c6 = new JCheckBox("Haridwar",false));
            add(c7 = new JCheckBox("MountAbu",false));
            add(c8 = new JCheckBox("Udaipur",false));
            add(c9 = new JCheckBox("Jaipur",false));
            gl.setVgap(40);
            add( b = new JButton("Confirm"));
            c1.addItemListener(this);
            c1.setFont(f);
            c2.addItemListener(this);
            c2.setFont(f);
            c3.addItemListener(this);
            c3.setFont(f);
            c4.addItemListener(this);
            c4.setFont(f);
            c5.addItemListener(this);
            c5.setFont(f);
            c6.addItemListener(this);
            c6.setFont(f);
            c7.addItemListener(this);
            c7.setFont(f);
            c8.addItemListener(this);
            c8.setFont(f);
            c9.addItemListener(this);
            c9.setFont(f);
            b.addActionListener(this);
            b.setFont(f);
        }
        public void itemStateChanged(ItemEvent e)
        {
            if(e.getSource().equals(c1) || e.getSource().equals(c2) || e.getSource().equals(c3))
            {
                if(c1.isSelected()||c2.isSelected()||c3.isSelected())
                {

                    if( (c1.isSelected()&&c2.isSelected()) || (c2.isSelected()&&c3.isSelected()) || (c1.isSelected()&&c3.isSelected()) )
                    {
                        if(c1.isSelected()&&c2.isSelected()&&c3.isSelected())
                        {
                            p1.l.setText("2,00,000");
                            c=true;
                        }
                        else
                        {
                            p1.l.setText("1,75,000");
                            c = true;
                        }
                    }
                    else
                    {
                        p1.l.setText("1,50,000");
                        c = true;
                    }
                }
                else
                    p1.l.setText("Please Select Atleast One Location");
            }

            if(e.getSource().equals(c4) || e.getSource().equals(c5) || e.getSource().equals(c6))
            {
                if(c4.isSelected()||c5.isSelected()||c6.isSelected())
                {
                    if( (c4.isSelected()&&c6.isSelected()) || (c4.isSelected()&&c5.isSelected()) || (c5.isSelected()&&c6.isSelected()) )
                    {
                        if(c6.isSelected()&&c5.isSelected()&&c4.isSelected())
                        {
                            p1.l.setText("2,00,000");
                            c = true;
                        }
                        else
                        {
                            p1.l.setText("1,75,000");
                            c = true;
                        }
                    }
                    else
                    {
                        p1.l.setText("1,50,000");
                        c = true;
                    }
                }
                else
                    p1.l.setText("Please Select Atleast One Location");
            }
            if(e.getSource().equals(c7) || e.getSource().equals(c8) || e.getSource().equals(c9))
            {
                if(c7.isSelected()||c8.isSelected()||c9.isSelected())
                {
                    if( (c7.isSelected()&&c8.isSelected()) ||(c8.isSelected()&&c9.isSelected()) || (c7.isSelected()&&c9.isSelected()) )
                    {
                        if(c7.isSelected()&&c8.isSelected()&&c9.isSelected())
                        {
                            p1.l.setText("2,00,000");
                            c = true;
                        }
                        else
                        {
                            p1.l.setText("1,75,000");
                            c = true;
                        }
                    }
                    else
                    {
                        p1.l.setText("1,50,000");
                        c = true;
                    }
                }
                else
                    p1.l.setText("Please Select Atleast One Location");
            }
        }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource().equals(b))
            {
                if(p1.r1.isSelected())
                {
                    check = 1;
                    if(c1.isSelected())
                    check1 = true;
                    if(c2.isSelected())
                    check2 = true;
                    if(c3.isSelected())
                    check2 = true;
                }
                else if(p1.r1.isSelected())
                {
                    check = 2;
                    if(c4.isSelected())
                        check1 = true;
                    if(c5.isSelected())
                        check2 = true;
                    if(c6.isSelected())
                        check2 = true;
                }
                else
                {
                    check =3;
                    if(c7.isSelected())
                        check1 = true;
                    if(c8.isSelected())
                        check2 = true;
                    if(c9.isSelected())
                        check2 = true;
                }
                if(c)
                    mf = new MyFrame();

            }
        }
    };

    public class JPanel3 extends JPanel
    {
        public JPanel3()
        {
            setLayout(new GridBagLayout());
            GridBagConstraints gc = new GridBagConstraints();
            gc.fill = GridBagConstraints.HORIZONTAL;
            gc.gridy = 0;
            gc.ipadx = 50;
            gc.ipady = 50;
            gc.gridx = 0;
            gc.gridheight = 2;
            //gc.gridwidth=2;
            add(p1,gc);
            gc.gridx=1;
            add(p2,gc);
        }
    };
    public class JPanel4 extends JPanel
    {
        JLabel l1,l2,l3;
        JTextField t1,t2,t3;
        public JPanel4()
        {
            setLayout(new GridLayout(3,2));
            add(l1 = new JLabel("Full Name : "));
            add(t1 = new JTextField());
            add(l2 = new JLabel("Email Id : "));
            add(t2 = new JTextField());
            add(l3 = new JLabel("Credit Card Number : "));
            add(t3 = new JTextField());
        }
    };
    public class MyFrame extends JFrame
    {
        JPanel5 p5;
        public MyFrame()
        {
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e)
                {
                    dispose();
                }});
            setSize(500,500);
            setVisible(true);
            //l.setBackground(Color.black);
            //l.setForeground(Color.white);
            setLayout(new BorderLayout());

            //add(l,BorderLayout.PAGE_START);
            //l.setBackground(Color.yellow);
            add(p5 = new JPanel5());
        }
        /*public void paint(Graphics g)
        {
            g.setFont(new Font("TimesNewRoman",25,30));
            g.setColor(Color.white);
            setBackground(Color.black);
        }*/
    };
    public class JPanel5 extends JPanel
    {
        JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
        JTextField tf;
        String s;
        public JPanel5()
        {
        setLayout(new GridLayout(5,2));
        add(l1 = new JLabel("Name :"));
        add(l4 = new JLabel(p4.t1.getText()));
        add(l2 = new JLabel("Email :"));
        add(l6 = new JLabel(p4.t2.getText()));
        add(l3 = new JLabel("Credit Card :"));
        add(l5 = new JLabel(p4.t3.getText()));
        add(l7 = new JLabel("Tour :"));
        add(l8 = new JLabel(String.valueOf(p2.check)));
        add(l9 = new JLabel("Places : "));
        add(tf = new JTextField());
        l1.setBackground(Color.black);
        l1.setForeground(Color.white);
        l2.setBackground(Color.black);
        l2.setForeground(Color.white);
        l3.setBackground(Color.black);
        l3.setForeground(Color.white);
        l7.setBackground(Color.black);
        l7.setForeground(Color.white);

        l9.setBackground(Color.black);
        l9.setForeground(Color.white);

        if(p2.check==1)
        {
            if(p2.check1==true&&p2.check2==true&&p2.check3==true)
                s = p2.c1.getLabel() + p2.c2.getLabel() + p2.c3.getLabel();
            else if(p2.c1.isSelected()&&p2.c2.isSelected())
                s = p2.c1.getLabel() + p2.c2.getLabel();
            else if(p2.c1.isSelected()&&p2.c2.isSelected())
                s = p2.c1.getLabel() + p2.c2.getLabel();
            else if(p2.c1.isSelected()&&p2.c2.isSelected())
                s = p2.c1.getLabel() + p2.c2.getLabel();
            else if(p2.c1.isSelected()==true&&p2.c2.isSelected()==false&&p2.c3.isSelected()==false)
                s = p2.c1.getLabel();
            else if(p2.c2.isSelected()==true&&p2.c1.isSelected()==false&&p2.c3.isSelected()==false)
                s = p2.c2.getLabel();
            else if(p2.c3.isSelected()==true&&p2.c1.isSelected()==false&&p2.c2.isSelected()==false)
                s = p2.c3.getLabel();

        }
        else if(p2.check==2)
        {
            if(p2.check1==true&&p2.check2==true&&p2.check3==true)
                s = p2.c4.getLabel() + p2.c5.getLabel() + p2.c6.getLabel();
            else if(p2.c4.isSelected()&&p2.c5.isSelected())
                s =p2.c4.getLabel() + p2.c5.getLabel();
            else if(p2.c5.isSelected()&&p2.c6.isSelected())
                s = p2.c5.getLabel() + p2.c6.getLabel();
            else if(p2.c4.isSelected()&&p2.c6.isSelected())
                s = p2.c4.getLabel() + p2.c6.getLabel();
            else if(p2.c4.isSelected()==true&&p2.c5.isSelected()==false&&p2.c6.isSelected()==false)
                s = p2.c4.getLabel();
            else if(p2.c5.isSelected()==true&&p2.c4.isSelected()==false&&p2.c6.isSelected()==false)
                s = p2.c5.getLabel();
            else if(p2.c6.isSelected()==true&&p2.c5.isSelected()==false&&p2.c4.isSelected()==false)
                s = p2.c6.getLabel();
        }
        else if(p2.check==3)
        {
            if(p2.check1==true&&p2.check2==true&&p2.check3==true)
                s = p2.c7.getLabel() + p2.c8.getLabel() + p2.c9.getLabel();
            else if(p2.c7.isSelected()&&p2.c8.isSelected())
                s = p2.c1.getLabel() + p2.c2.getLabel();
            else if(p2.c8.isSelected()&&p2.c9.isSelected())
                s = p2.c8.getLabel() + p2.c9.getLabel();
            else if(p2.c7.isSelected()&&p2.c9.isSelected())
                s = p2.c7.getLabel() + p2.c9.getLabel();
            else if(p2.c7.isSelected()==true&&p2.c8.isSelected()==false&&p2.c9.isSelected()==false)
                s =p2.c7.getLabel();
            else if(p2.c8.isSelected()==true&&p2.c7.isSelected()==false&&p2.c9.isSelected()==false)
                s = p2.c8.getLabel();
            else if(p2.c9.isSelected()==true&&p2.c7.isSelected()==false&&p2.c8.isSelected()==false)
                s = p2.c9.getLabel();
        }
        tf.setText(s);
        tf.setEditable(false);
        }
    };
}
