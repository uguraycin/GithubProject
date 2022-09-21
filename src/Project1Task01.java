import java.util.Scanner;

public class Project1Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        
		System.out.println("How many numbers would you like to enter?");
		int input=scan.nextInt();
				int numbers[] = new int[input];
				int sum = 0;

				for (int i = 0; i < numbers.length; i++) {
					int order=i+1;
					System.out.println("Please enter number " +order);
					numbers[i] = scan.nextInt();
					sum += numbers[i];
				}
				System.out.println("Sum of entered numbers is: " + sum);

	}

}
