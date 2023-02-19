package basicDataStructureAssignment;

import java.util.Scanner;

 class Login{
    String userId = "Ajay",password = "password";
 
    
    public String loginUser(String user, String pass) {
    	if(user.equals(userId) &&  pass.equals(password)) {
    		return "Welcome Ajay";
    	}
    	else
    	   return "You have entered wrong credentails,please enter the righ credentials";
    }
 }
public class Assignment1Q6 {

    public static void main(String[] args){
    	Login l=new Login();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter userId");
    	String a=sc.next();
    	System.out.println("Enter password");
    	String b=sc.next();
    	
    	System.out.println(l.loginUser(a, b));
    	
    	
 }
		
}

