package Exercise4;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
//input value for multiplication		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scanner.nextInt();
//loop for 1 to 10		
		for(int i = 1; i<= 10; i++)
		{
//output of multiplication
			System.out.println(num + "*" + i + "=" + (num*i));
		}

	}

}
