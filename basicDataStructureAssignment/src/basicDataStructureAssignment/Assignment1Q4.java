package basicDataStructureAssignment;

import java.util.Scanner;

class ResultDeclaration{
	public String declareResult(double subject1Marks,
			double subject2Marks,double subject3Marks) {
		
		if((subject1Marks > 60 && subject2Marks < 60 && subject3Marks < 60) ||
		(subject1Marks < 60 && subject2Marks > 60 && subject3Marks < 60) ||
		(subject1Marks < 60 && subject2Marks < 60 && subject3Marks > 60) || (subject1Marks+ subject2Marks+subject3Marks < 60)){
			return "failed";
		}
		else if((subject1Marks>60 || subject2Marks>60 && subject3Marks<60)||(subject1Marks<60 && subject2Marks>60 || subject3Marks>60)||
		(subject1Marks>60 || subject2Marks<60 && subject3Marks>60)) {
			return "promoted";
		}
		else {
			return "passed";
		}
	}
}

public class Assignment1Q4 {

	public static void main(String[] args) {
		ResultDeclaration result = new ResultDeclaration();
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter a subject1Marks : ");
		double a =sc.nextDouble();
		System.out.println("Enter a subject2Marks : ");
		double b =sc.nextDouble();
		System.out.println("Enter a subject3Marks : ");
		double c =sc.nextDouble();
			
		String ans =result.declareResult(a, b, c);
			
		System.out.println(ans);
			
		

	}

}
