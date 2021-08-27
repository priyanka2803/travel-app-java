package com.aptravels;
import javax.swing.*;
import java.awt.*;
class User
{
    private String name,email;
    private long phn_no,credit;
    private int no_person;
    private boolean kids;
    User()
    {

    }
    User(String name, String email, long phone, long ccn,int no_p, boolean kids)
    {
        this.name = name;
        this.email = email;
        phn_no = phone;
        credit = ccn;
        no_person = no_p;
        this.kids = kids;
    }
   //name
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    { 
        this.name=name;
    }
    
    //email
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email)
    { 
        this.email=email;
    }   

    //phone number
    public long getPhoneNo() 
    {
        return phn_no;
    }
    public void setPhoneNo(long phn_no)
    { 
        this.phn_no=phn_no;
    }

    //credit card details
    public long getCreditNo() 
    {
        return credit;
    }
    public void setCreditNo(long phn_no)
    { 
        this.credit=credit;
    }
    
    //no of persons traveling
    public int getNoOfPerson() 
    {
        return no_person;
    }
    public void setNoOfPerson(int no_person)
    { 
        this.no_person=no_person;
    }

    //no of kids traveling
    public boolean getKids() 
    {
        return kids;
    }
    public void setKids(boolean kids)
    { 
        this.kids=kids;
    }
}