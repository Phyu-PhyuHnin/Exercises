package Exercise1;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the student of marks : ");
		int marks = scanner.nextInt();
		
		if(marks>=80)
        {
            System.out.print("The Result : A");
        }
        else if(marks>=65 && marks<80)
        {
           System.out.print("The Result : B");
        } 
        else if(marks>=50 && marks<65)
        {
            System.out.print("The Result : C");
        }
//The student of mark is lower than 50 
        else
        {
            System.out.print("The Result is Fail");
        }

	}

}
