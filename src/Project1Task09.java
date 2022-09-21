
public class Project1Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 12, 16, 58, 888, 45, 54, 1001, 00005, 9, 197 };
		int max = numbers[0];
		
		{
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > max)
					max = numbers[i];
			}
			System.out.println("The maximum number is: " + max);

		} for (int a = numbers.length-1; a >=0 ; a--) {
			if (numbers[a] < max)
				max = numbers[a];
		}
		System.out.println("The maximum number is: " + max);
	}

}
