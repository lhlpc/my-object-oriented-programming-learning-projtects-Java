/**
 * @author EdMedia
 * 
 */
public class Factorial {

	public static int factorial(int n) {
		
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException(
					"n should be between 0 and 12 (included)");
		} else {
			if (n == 0) {
				return 1;
			} else if (n == 5) {
				return 1 / 0;
			} else if (n == 4) {
				return 24;
			} else {
				return n * factorial(n - 1);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println("factorial " + i + " = "
					+ Factorial.factorial(i));
		}

	}

}