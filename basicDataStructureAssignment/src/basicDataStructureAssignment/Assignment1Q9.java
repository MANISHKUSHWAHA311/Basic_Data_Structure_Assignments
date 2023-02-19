package basicDataStructureAssignment;

import java.util.Scanner;

class Student {
	private int a;
	private int b;
	private int c;
	
	Student(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int sum()
	{
		return (a+b+c);
	}
	
	public int returnNum(char x)
	{
		if(x == 'a')
			return this.a;
		else if(x == 'b')
			return this.b;
		else
			return this.c;
}
	
	
}

public class Assignment1Q9 {

    public static void main(String[] args) {
    	
    	Scanner sc= new Scanner(System.in);
        int student[][]=new int[3][3];

        for(int i=0;i<3;i++){
            System.out.println("mark of Student "+(i+1)+" in subjects A,B,C");
            for(int j=0;j<3;j++){
                student[i][j]=sc.nextInt();
            }
        }
    	
    	Student s1 = new Student(10, 20, 30);
    	Student s2 = new Student(10, 20, 30);
    	Student s3 = new Student(10, 20, 30);
    	
  	
    	System.out.println("Total marks of all students in all subjects = "+(s1.sum()+s2.sum()+s3.sum()));
    	System.out.println("Average marks of all the students in all subjects = "+((s1.sum()+s2.sum()+s3.sum())/3));
    	
    	System.out.println();
    	
    	System.out.println( "Total marks scored by students in subject A = "+(s1.returnNum('a') + s2.returnNum('a') + s3.returnNum('a')));
    	System.out.println( "Average marks scored by students in subject A = "+(s1.returnNum('a') + s2.returnNum('a') + s3.returnNum('a'))/3 );
    	
    	System.out.println();
    	
    	System.out.println( "Total marks scored by students in subject B = "+(s1.returnNum('b') + s2.returnNum('b') + s3.returnNum('b')));
    	System.out.println( "Average marks scored by students in subject B = "+(s1.returnNum('b') + s2.returnNum('b') + s3.returnNum('b'))/3 );
    	
    	System.out.println();
    	
    	System.out.println( "Total marks scored by students in subject C = "+(s1.returnNum('c') + s2.returnNum('c') + s3.returnNum('c')));
    	System.out.println( "Average marks scored by students in subject C = "+(s1.returnNum('c') + s2.returnNum('c') + s3.returnNum('c'))/3 );
    	
    }
}


