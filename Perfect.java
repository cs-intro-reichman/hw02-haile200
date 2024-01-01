/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		String helper ="";
		String ans = "";
		int counter=0;
		int TheNumIsPerfect = Integer.parseInt(args[0]);
		for (int i = 1; i < TheNumIsPerfect ; i++) {
			if (TheNumIsPerfect%i==0) {
				counter+=i;
				helper+=" "+i+" +";
			}
		}
		for (int j = 0; j < helper.length()-2; j++) {  
				ans+=helper.charAt(j);	
		}
		if (counter==TheNumIsPerfect) {
			System.out.println(+TheNumIsPerfect+" is a perfect number since "+TheNumIsPerfect+" ="+ans);
		}
		else{
			System.out.println(+TheNumIsPerfect+" is not a perfect number");
		}


	}
}
