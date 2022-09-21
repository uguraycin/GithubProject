import java.util.Scanner;
public class Project1Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many countries would you like to enter?");
		int length=scan.nextInt();
		String countries[] = new String[length];
		String capitals[] = new String [length];
		
		for (int i = 0; i < length; i++) {
			System.out.println("Please enter the country " +(i+1));
			countries[i] = scan.next();
			System.out.println("Please enter the capital " +(i+1));
			capitals[i] = scan.next();
		} System.out.println("Countries and Capitals:");
		for (int i=0; i<length; i++) {
			System.out.println(" Capital city of " +(countries[i] +" is " +(capitals[i])));
			
		}
	}

}
