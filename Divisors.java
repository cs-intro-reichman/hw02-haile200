/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
	 int n =  Integer.parseInt(args[0]);
	 for (int i = 1; i <= n; i++) {
		if (n%i==0) {  // אם השארית חלוקה היא 0 אז המספר מתחלק 
			System.out.println(i);
		}
	 }
	}
}
//done 
