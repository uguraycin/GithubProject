	import java.util.Scanner;
public class Project1Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();
		boolean value = false;

		

			for (int i = 2; i <= number/2; i++) //condition for nonprime 
				{if (number % i == 0) {
					value = true;
					break;
				}
			}
			if (!value) {
				System.out.println("Entered number " + number + " is a Prime Number");
			} else {
				System.out.println("Entered number " + number + " is NOT a Prime Number");
			}
	}

}
