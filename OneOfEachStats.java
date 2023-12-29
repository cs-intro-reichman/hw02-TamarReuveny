import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {

	public static void main (String[] args) {
		// Gets the two command-line arguments
		///int T = Integer.parseInt(args[0]);
		
		///int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        ///Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		int T = Integer.parseInt(args[0]);

		int seed = Integer.parseInt(args[1]);

		Random generator = new Random(seed);

		int x;

		int numberOf = 1;

		int twoChild = 0;
		
		int threeChild = 0;

		int fourMore = 0;

		double sum = 0;

		for (int i = 0 ; i < T ; i++) {

			do {

	    	   x =(int)((generator.nextDouble()*2 + 1));

	    	   sum++;

	           numberOf++;

	           } while (x == seed);

			if (numberOf == 2) {

				twoChild++;

			}  else if (numberOf == 3) {

				threeChild++;

			} else {
				
				fourMore++;
			}

			numberOf = 1;
	    }

			sum = sum + T;

			double average = sum / T;

			int max = Math.max(twoChild, Math.max(threeChild,fourMore));

			System.out.println("Average: " + average + " children to get at least one of each gender.");

			System.out.println("Number of families with 2 children: " + twoChild);

			System.out.println("Number of families with 3 children: " + threeChild);

			System.out.println("Number of families with 4 or more children: " + fourMore);

			if (max == fourMore) {

				System.out.println("The most common number of children is 4 or more.");

			} else {

			System.out.println("The most common number of children is " + max + ".");
			}
	} 
}
		    
	

