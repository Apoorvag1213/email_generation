package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String email;
	private String companySuffix="abxcompany.com";
	
	//consturctor gor fname and lname
	
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=setDepartment();
		this.password=randomPassword(8);
		email=firstName.toLowerCase()+"."+lastName+"@"+department+"."+companySuffix;
		System.out.println("Email created"+" "+firstName+" "+lastName);
		System.out.println("Department is"+" "+this.department);
		System.out.println("password is"+" "+this.password);
	}
	
	//ask for department
	private String setDepartment() {
		System.out.println("Department Code\n1 for sales \n2 for development \n3 for accounting \n0 for none\nEnter the department ");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "Dev";}
		else if(depChoice==3) {return "Acc";}
		else {return "";}
		
	}
	
	//generate random password
	
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set mailbox capapcity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	
	//set alternate mail
	
	public void setAlternateMail(String altemail) {
		this.alternateEmail=altemail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	//getters
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {return password;
	}
	
	public String showinfo() 
	{
		return 
		"DISPLAY NAME:" +firstName+" "+lastName+
		"\nCOMPANY EMAIL:"+ email+
		"\nMAILBOX CAPACITY:" + mailboxCapacity+"mb";
		
	}
}
	
	
