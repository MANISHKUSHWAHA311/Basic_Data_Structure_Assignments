package basicDataStructureAssignment;


class ArmstrongNumBetweenRange {
	public void armstrongNumberInRange(int min,int max) {
		
		int digit1,digit2,digit3,temp=0;
		int result=0;
		
		for(int number = min; number <= max; number++)
        {
            temp = number;
            digit3=temp%10;
            temp=temp/10;
 
            digit2=temp%10;
            temp=temp/10;
 
            digit1=temp%10;
            result=(digit1 * digit1 * digit1)+( digit2 * digit2 * digit2)+(digit3 * digit3 * digit3);
            
            
            if(number==result){
            	
            	System.out.print(number+" ");
             }
            
        }
         
	}
}

public class Assignment1Q2 {

	public static void main(String[] args) {
		ArmstrongNumBetweenRange arm =new ArmstrongNumBetweenRange();
		
		int min=100;
		int max=999;
		
		System.out.println("All armstrong number between 100 and 999 are :");
		arm.armstrongNumberInRange(min, max);
		

		
		
	}

}


