
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		int x = (int)((Math.random()) * 2);

	    int c = 0;

	    int y = 2;

	    if (x == 0) {

	    	System.out.println("b ");

	    	do {

	    	   y = (int)((Math.random()) * 2);

	    	   c = c + 1;

	    	   System.out.println("b ");

	           } while (x == y);

	           System.out.println("g");

	    } else {

            System.out.println("g ");

	    	do {

	    	   y = (int)((Math.random()) * 2);

	    	   c = c + 1;

	    	   System.out.println("g ");

	           } while (x == y);

	           System.out.println("b");
	       }


            System.out.println("You made it... and you now have " + (c + 2) + " children.");
     
	}
}

	

