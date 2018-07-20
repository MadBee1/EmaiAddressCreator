package EMailApp;

import java.util.*;

public class Email {
 private String firstName;
 private String lastName;
 private String password;
 private String alterEmail;
 private String department;
 private String email;
 private String companyName = "mycompany.com";
 private int mailCapacity = 250;
 
 //Constructor to receive the first and the last name
 public Email(String firstName, String lastName) {
	 this.firstName = firstName;
	 this.lastName = lastName;
	// System.out.println("Email created for:" + this.firstName + " " + this.lastName);
	 
	 // Call a method asking for a department, return departnment
 this.department = setDepartment();
 //System.out.println("Department: " + this.department);
 
 //Generate the email
 email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companyName;
 //System.out.println("Your email: " + email);
 
 //Call a method that creates a random password
 this.password = randomPass(10);
 System.out.println("Password: " + this.password);
 }
 
 // Ask department
 private String setDepartment() {
	 System.out.print(firstName + ", enter the code of your department: "
	 		+ "\n1 for Sales"
			+ "\n2 for Deveopment"
	 		+ "\n3 for Accounting"
			+ "\n0 for none");
	 Scanner sc = new Scanner(System.in);
	 int depCode = sc.nextInt();
	 sc.close();
	 if (depCode == 1 ) {
		 return "sales.";
	 } else if(depCode == 2) {
		 return "dev.";
	 }else if(depCode == 3) {
		 return "acct.";
	 }else {
		 return "";
	 }
	 
 }
 // Generate random password
  private String randomPass(int length) {
	  String passChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefjhijklmnopqrstuvwxyz0123456789!@#$%^&*()_";
	  char[] password = new char [length];
	  for (int i = 0; i < length; i++) {
		int random = (int)  (Math.random() * passChar.length()); //created a random number out of the amount of characters in String password
	 password[i] = passChar.charAt(random);
	  }
  return new String(password);
  }
 // Set mailbox capacity{
  public void setMailCap(int capacity) {
	  this.mailCapacity = capacity;
  }
 // Set alternate email
 public void setAltMail(String alterMail) {
	 this.alterEmail = alterMail;
 }
 // Change the password
 public void changePass(String pass) {
	 this.password = pass;
 }
 // Get mailbox capacity
 public int getMailCap(){
	 return mailCapacity;
 }
 // Get alternate email
 public String getAltMail(){
	 return alterEmail;
 }
 // Ger new password 
 public String getPassword() {
	 return password;
 }
 
 public String showInfo() {
	 return "Name: " + firstName + " " + lastName +
			 "\nCompany E-Mail: " + email + 
			 "\nE-Mail Capacity: " + mailCapacity;
 }
}

