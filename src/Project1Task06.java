
public class Project1Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int a = 50;
			int b = 12;

			System.out.println("Number a is " + a + " and number b is " + b);

			a = a + b; //-> a=50+12 (62)
			b = a - b; // b=(a+b)-b -> b=62-12 (50)
			a = a - b; // a=(a+b)-a -> a=62-50 (12)

			System.out.println("If we swap a and b, the a is " + a + " and b is " + b);
	}

}
