public class OneOfEachStats {

	public static void main(String[] args) {

		int t = Integer.parseInt(args[0]);

		int x,y;

		int numberOf = 1;

		int twoChild = 0;
		
		int threeChild = 0;

		int fourMore = 0;

		double sum = 0;

		for (int i = 0 ; i < t ; i++) {

	    do {

	        x = (int)((Math.random())* 2);

	    	y = (int)((Math.random())* 2);

			sum++;

	        numberOf++;

	        } while (x == y); 

			if (numberOf == 2) {

				twoChild++;

			}  else if (numberOf == 3) {

				threeChild++;

			} else {
				
				fourMore++;
			}
	    }

			sum = sum + (2 * t);

			double average = sum / t;

			int max = Math.max(twoChild, Math.max(threeChild,fourMore));

			System.out.println("Average: " + average + " children to get at least one of each gender.");

			System.out.println("Number of families with 2 children: " + twoChild);

			System.out.println("Number of families with 3 children: " + threeChild);

			System.out.println("Number of families with 4 or more children: " + fourMore);

			System.out.println("The most common number of children is " + max);
	} 
	
}


		
     






