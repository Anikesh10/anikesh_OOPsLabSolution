import java.util.Scanner;

import com.model.*;
import com.services.*;

public class Main {
 public static void main(String[] args) {
	 
	 int departmentOption; 
	 String department;
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("**** Welcome to credential generator ****");
	 
	 System.out.println("Please enter your first name");
	 String firstName = scan.nextLine();
	 
	 System.out.println("Please enter your last name");
	 String lastName = scan.nextLine();
	 
	 Employee emp = new Employee(firstName, lastName);
	 
	 do {
		 System.out.println("Please Enter the Department from the following : ");
	     System.out.println("1. Technical");
	     System.out.println("2. Admin");
	     System.out.println("3. Human Resource");
	     System.out.println("4. Legal");
	    
	     departmentOption = scan.nextInt();
	     
	     switch (departmentOption) {
	     case 1:
	    	 emp.setDepartment("tech");
	         break;
	     case 2:
	    	 emp.setDepartment("admin");
	         break;
	     case 3:
	    	 emp.setDepartment("hr");
	         break;
	     case 4:
	    	 emp.setDepartment("legal");
	         break;
	     default: 
	    	 System.out.println("In correct option selected, Please select your department again !!");
	    	 break;
	     }
	     
	 } while(departmentOption == 0 || departmentOption > 4);
	 
	 String emailId = CredentialService.generateEmail(emp.getFirstName(), emp.getLastName(), emp.getDepartment());
     emp.setEmailId(emailId);
     
     String password = CredentialService.generatePassword(8);
     emp.setPassword(password);
     
     CredentialService.displayCreds(emp);
	 scan.close();
 }
}
