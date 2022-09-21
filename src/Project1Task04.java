
public class Project1Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = { 
				{ 1, 3, 5, 16, 18 }, 
				{ 11, 105, 203, 4 }, 
				{ 6, 7, 109, 22, 57, 8445 },
				{ 45, 78, 65, 54, 1, 57895 } };

		for (int a = 0; a < numbers.length; a++) { 

			for (int b = 0; b < numbers[a].length; b++) {

				if (numbers[a][b] % 2 == 0) {
					System.out.print(numbers[a][b] + " ");
				}
			}
		}
	}

}
