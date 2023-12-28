public class OneOfEachStats {

	public static void main(String[] args) {

		int t = Integer.parseInt(args[0]);

	    int x = (int)(Math.random());

	    int c = 0;

	    do {

	    	y = (int)(Math.random());

	        c = c + 1;

	    	   System.out.println("b ");

	        } while (x == y);




	    int c = 0;

	    int y = 2;

	    if (x < 0.5) {

	    	System.out.println("b ");

	    	do {

	    	   y = (int)(Math.random());

	    	   c = c + 1;

	    	   System.out.println("b ");

	        } while (x == y);

	           System.out.println("g");

	    } else {

               System.out.println("g ");

	    	do {

	    	   y = (int)(Math.random());

	    	   c = c + 1;

	    	   System.out.println("g ");

	        } while (x == y);

	           System.out.println("b");
	       }

	     }

            System.out.println("You made it... and you now have " + (c + 2) + " children.");
		}

		
     






