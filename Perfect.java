public class Perfect {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);

		int x = 0;

		for ( int i = 1 ; i < n ; i ++) {

			if (n % i == 0) {

				x = x + i;
			}
		}

			if (n == x) {

				System.out.print(n + " is a perfect number since " + n + " = 1 ");

				for ( int i = 2 ; i < n ; i ++) {

			         if (n % i == 0) {

			         	System.out.print(" + "+ i);

			         	
			         }
			     }
			 } else {

			 	System.out.println(n + " is not a perfect number");
			 }
	   
    }
}
