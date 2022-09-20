package com.geatlearning.app;

import com.geatlearning.model.Employee;
import com.geatlearning.service.CredService;

public class DriverClass {

	public static void main(String[] args) {
		Employee e1=new Employee();   //DC
		Employee e2=new Employee("Rohit","Sharma");//PC
				
		CredService cs=new CredService();
	    String generateEmail="";
		char[] genPwd=null;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println ("Please Choose your department");
		System.out.println ("1. Tech");
		System.out.println ("2. Admin");
		System.out.println ("3.  HR");
		System.out.println ("4. Legal");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			   generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Tech");
			   genPwd=cs.generatePassword();
			   break;
		case 2:
			   generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(), "Admin");
			   genPwd=cs.generatePassword();
			   break;
		case 3:
			   generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"HR");
			   genPwd=cs.generatePassword();
			   break;
		case 4:
			   generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(), "Legal");
			   genPwd=cs.generatePassword();
			   break; 
		case 5: 
			   System.exit(0);
			   
		default:
			System.out.println("Please enter valid choice");
		}
		cs.displayEmpDetails(e1.getFirstName(),e1.getLastName(),generateEmail,genPwd);
		//tem.out.println("Email ID :" +generateEmail);
		//stem.out.println("Password :" +genPwd); 
		while(true);

}

}
