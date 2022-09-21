
public class Project1Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstTenNumbers = 10;
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci Series of " + firstTenNumbers + " numbers are: ");

		for (int i = 1; i <= firstTenNumbers; ++i) {
			System.out.print(previousNumber + " ");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}

}
