
public class Project1Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 12, 16, 58, 888, 45, 54, 1001, 00005, 9, 197 };
		int max1 = 0;
		int max2 = 0;

		for (int a = 0; a < numbers.length; a++) {
			if(max1<numbers[a]) {
				max2 = max1;
				max1=numbers[a];
			}if (max2<numbers[a] && numbers[a]<max1) {
				max2=numbers[a];
			}
				

		} System.out.println("The second largest number in the array is: " +max2);
	}

}
