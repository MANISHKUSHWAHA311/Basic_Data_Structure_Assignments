package basicDataStructureAssignment;

import java.util.Scanner;

class TaxAmount{
	public double calculateTaxAmount(int ctc) {
		if(ctc > 0 && ctc <=180000) {
			return 0;
		}
		else if (ctc >180001 && ctc <=300000) {
			return ctc * 0.1;
		}
		else if (ctc > 300001 && ctc <=500000) {
			return ctc * .2;
		}
		else {
			return ctc * .3;
		}
	}
}

public class Assignment1Q5 {
	public static void main(String[] args) {
		TaxAmount tax = new TaxAmount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ctc : ");
		int ctc = sc.nextInt();
		
		System.out.println(tax.calculateTaxAmount(ctc));
		
		
	}

}
