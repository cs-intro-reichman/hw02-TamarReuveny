/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){

		String w = args[0];

		int i = w.length() - 1;

		while (i >= 0) {

			System.out.print(w.charAt(i));

			i--;
		}

		System.out.println();

		if ((w.length()) % 2 != 0) {

			System.out.println("The middle character is " + w.charAt((w.length()/2)));

		} else {

		System.out.println("The middle character is " + w.charAt((w.length()/2)-1));

		}

	}
}
