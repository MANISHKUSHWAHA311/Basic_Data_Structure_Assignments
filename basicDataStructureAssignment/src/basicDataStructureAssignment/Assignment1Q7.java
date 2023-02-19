package basicDataStructureAssignment;

import java.util.Scanner;

class SearchArray{
	public boolean searchArray(int[] arr ,int valueToCheck) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==valueToCheck) {
				return true;
			}
		}
		return false;
	}
	
}

public class Assignment1Q7 {
	public static void main(String[] args) {
		SearchArray A=new SearchArray();
		Scanner sc=new Scanner(System.in);
		
		int []arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		int valueToCheck=19;
		
		System.out.println(A.searchArray(arr, valueToCheck));

	}

}
