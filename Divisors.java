/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);

		int x = 1;

		for (int i = 0 ; i < num ; i++) {

			if (num % x == 0) {

				System.out.println(x);
			}
			x++;
		}
	}
}

	
