package basicDataStructureAssignment;

  class ArmstrongOrNot{
	 public boolean armstrongCheck(int num) {
		
		int temp, remainder, result = 0, n = 0 ;
		temp = num;

		while (temp != 0)
		{
		temp /= 10;
		++n;
		}
		temp = num;

		while (temp != 0)
		{
		remainder = temp%10;
		result += Math.pow(remainder, n);
		temp /= 10;
		}
		if(result==num) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Assignment1Q1 {

	public static void main(String[] args) {
		
		ArmstrongOrNot A = new ArmstrongOrNot();
		int n=371;
		if(A.armstrongCheck(n)) {
			System.out.print(true);
		}
		else {
			System.out.println(false);
		}
	}


	

}
