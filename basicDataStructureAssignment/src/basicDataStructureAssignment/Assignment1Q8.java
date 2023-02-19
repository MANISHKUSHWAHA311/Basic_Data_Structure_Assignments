package basicDataStructureAssignment;

class BubbleSort{
	public void bubbleSort(int arr[]) {
		int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
	void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class Assignment1Q8 {

	public static void main(String[] args) {
		BubbleSort b=new BubbleSort();
		
		int [] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i=0;i<15;i++) {
			System.out.print(arr[i]+" ");
		}
		b.bubbleSort(arr);
		
		System.out.println("\nAfter sorting the array ");
		b.printArray(arr);

	}

}
