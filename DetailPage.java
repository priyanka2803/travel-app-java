package com.aptravels;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DetailPage
{
        JFrame jf;
        User u;
        String error="";
        DetailPanel details;
        DetailPage()
        {
                jf = new JFrame("Tours and Travels");
                jf.setLayout(new BorderLayout()); 
                jf.add(new Header("Please Enter your Details"), BorderLayout.NORTH);
                jf.add(new Footer(), BorderLayout.SOUTH);
                jf.add(details = new DetailPanel(),BorderLayout.CENTER);
                jf.setVisible(true);
                jf.setSize(800,600);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        }   
         
        public static void main(String args[]) 
        {
            DetailPage d = new DetailPage();
        }

        public boolean validDetails()
        {
            boolean valid=false;
            if(Validate.isValidName(details.name.getText().toLowerCase().trim()))
            {
                if(Validate.isValidEmail(details.email.getText()))
                {
                    if(Validate.isValidPhoneNumber(details.phn_no.getText()))
                    {
                        if(Validate.isValidCCN(Long.parseLong(details.credit.getText())))
                        {
                            valid = true;
                        }
                        else
                        {
                            setErrorMessage("Invalid Credit Card Number");
                        }
                    }
                    else
                    {
                        setErrorMessage("Invalid Phone Number");
                    }
                }
                else
                {
                    setErrorMessage("Invalid Email");
                }
            }   
            else
            {
                setErrorMessage("Invalid Name");
            }
            return valid;
        }
        public boolean filledAllDetails()
        {
            boolean valid=false;
            try 
            {
                if(details.name.getText()!=null)
                {
                    if(details.email.getText()!=null)
                    {
                        if(details.phn_no.getText()!=null)
                        {
                            if(Long.parseLong(details.credit.getText())!=0)
                            {
                                valid = true;
                            }
                            else
                            {
                                setErrorMessage("Invalid/Missing Credit Card Number");
                            }
                        }
                        else
                        {
                            setErrorMessage("Missing Phone Number");
                        }
                    }
                    else
                    {
                        setErrorMessage("Missing Email");
                    }
                }   
                else
                {
                    setErrorMessage("Missing Name");
                }
            }
            catch(NullPointerException e)
            {
                setErrorMessage("Missing Details");
                System.out.println(e);
            }
            catch(Exception e)
            {
                setErrorMessage("Missing/Incorrect Details");
                System.out.println(e);
            }
            
            return valid;
        }
        private void setErrorMessage(String error)
        {
            this.error=error;
        }
        private String getErrorMessage()
        {
            return error;
        }
        private void proceedToTour() {
            
            jf.dispose();
            new TourPage(u);
            
        }
        public User getUser()
        {
            return u;
        }
        public void setUser(String name, String email, long phone, long ccn,int no_p, boolean kids)
        {
            u = new User(name,email,phone,ccn,no_p,kids);
        }
       class DetailPanel extends JPanel        
       {
               //JImageIcon img;
               JTextField name,email,phn_no,kids,credit;
               JSpinner no_p;
               JLabel l1,l2,l3,l4,l5,l6,error;
               JButton b;
               JRadioButton r1,r2;
               ButtonGroup bg;
               Font f;
               DetailPanel()
               {
                       setLayout(new GridLayout(8,2,0,20));
                       
                       setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40)); 
                       bg=new ButtonGroup();
                       f = new Font("Times New Roman",Font.BOLD,18);
                       //1st row
                       add(l1= new JLabel("Name:"));
                       add(name= new JTextField(5));

                       add(l2 = new JLabel("Email:"));
                       add(email= new JTextField(5));
                      
                       add(l3 = new JLabel("Phone Number:"));
                       add(phn_no = new JTextField(5));

                       add(l4 = new JLabel("Number of Person Traveling:"));
                       add(no_p = new JSpinner(new SpinnerNumberModel(1,1,100,1)));
                       
                       add(l5= new JLabel("Credit:"));
                       add(credit = new JTextField(5));
                       
                       add(l6 = new JLabel("Kids on board?"));
                       add(new JLabel(""));
                       
                       l1.setFont(f);
                       l2.setFont(f);
                       l3.setFont(f);
                       l4.setFont(f);
                       l5.setFont(f);
                       l6.setFont(f);

                       add(r1= new JRadioButton("YES",true));
                       add(r2= new JRadioButton("NO"));

                       bg.add(r1);
                       bg.add(r2);

                       add(b= new JButton("Next"));
                       add(error = new JLabel());
                       b.addActionListener(new ActionListener()
                       {
                           public void actionPerformed(ActionEvent e)
                           {
                               if(filledAllDetails())
                               {
                                    if(validDetails())
                                    {
                                        setUser(name.getText(),email.getText(),Long.parseLong(phn_no.getText()),Long.parseLong(credit.getText()),Integer.parseInt(""+no_p.getValue()),r1.isSelected());
                                        proceedToTour();
                                    }
                                    else
                                    {
                                        error.setText(getErrorMessage());
                                    }
                               }
                               else
                               {
                                   error.setText(getErrorMessage());
                               }
                           }
                       });
                }
        } 

}
        
