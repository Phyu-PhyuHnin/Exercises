package Exercise5;

public class EvenNumer {

	public static void main(String[] args) {
	    int totalNum = 0;
		System.out.println("List of even numer from 1 to 100 : ");
//loop for 1 to 100 of even number  		
		for(int i = 1; i <= 100; i++)
		{
//check even number
			if(i % 2 == 0) {
				System.out.print(i + " ");
//total sum of even number				
				totalNum += i;
			}
		}
//output of total sum even number
		System.out.println("\nThe total Sum of even number from 1 to 100 is "+ totalNum);

	}

}
