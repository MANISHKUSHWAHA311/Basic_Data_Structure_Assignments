package basicDataStructureAssignment;

import java.util.Scanner;
import java.util.*;

class SiCi{
	public double simpleInterest(double principalAmount,int time,double interestRate) {
		return (principalAmount* interestRate * time)/100;
	}
	
	public double compoundInterest(double principalAmount,int time,double interestRate) {
	 double ans =1;
	 for(int i=0;i<time;i++) {
		ans=principalAmount*(1+ (interestRate/100));
	}	 
		return (principalAmount * ans)-principalAmount;		
}
}

public class Assignment1Q3 {

	public static void main(String[] args) {
		SiCi s=new SiCi();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a PrincipalAmount : ");
		double P= sc.nextDouble();
		
		System.out.print("Enter a InterestRate : ");
		double r=sc.nextDouble();
		
		System.out.print("Enter a time : ");
		int n= sc.nextInt();
		
		System.out.println("Simple Interest of a number = " + s.simpleInterest(P, n, r));
		System.out.println("Compound Interest of a number = " + s.compoundInterest(P, n, r));	

	}
}
