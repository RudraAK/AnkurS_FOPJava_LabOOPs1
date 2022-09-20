package com.geatlearning.service;

import java.util.Random;

import com.geatlearning.model.Employee;

public class CredService {

		public String generateEmailID(String fname, String sname, String dept)
		{
			return fname+sname+"@"+dept+".gl.com";
	    }

		public char[] generatePassword()
		{
		    String capLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    String smallLetters="abcdefghijklmnopqrstuvwxyz";
		    String numbers="0123456789";
		    String splchars="!@#$%^&*<>/+-";
		    String value=capLetters+smallLetters+numbers+splchars;
		    int i;
		    char p[]=new char[8];
		    
		    Random random=new Random();
		    for (i=0;i<8;i++)
		    	
		    {
		    	p[i]=value.charAt(random.nextInt(value.length()));
		    }
			return p;
		}
		
		public void displayEmpDetails(Employee e1)
		{
			
		}

		public void displayEmpDetails(String fname, String sname, String generateEmail, char[] genPwd)
		{
			System.out.println("Emp FirstName is "+fname);
			System.out.println("Emp LastName is "+sname);
			System.out.println("Emp EmailID is "+generateEmail);
			System.out.println("Emp Password is "+genPwd);
			
		}
        
		
}
	
