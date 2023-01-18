package Exercise3;

import java.util.Scanner;

public class ColorTest {

	public static void main(String[] args) {
//User input		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your color : ");
		char color = scanner.next().charAt(0);
		
		switch(color) {
        case 'b' :
           System.out.println(" Your color is Blue Color.");
           break;
        case 'r' :
           System.out.println("Your color is Red Color.");
           break;
        case 'g' :
           System.out.println("Your color is Green Color.");
           break;
        default :
        System.out.println("Your color is another color.");
     }

	}

}
