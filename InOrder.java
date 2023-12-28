/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int x = (int)((Math.random()) * 10);

	    // int y;

	    System.out.print(x);

		y = (int)((Math.random()) * 10);

		while (y >= x) {

			System.out.print(" " + y);

			x = y;

			y = (int)((Math.random()) * 10);


		}





	   // do { 

	   // y = (int)((Math.random()) * 10);

	   // if (y >= x) {

	    	// System.out.print(" " + y);

			// x = y;

	    //} else {

		//	break;
		//} 

	   // } while (true);

	}
}
