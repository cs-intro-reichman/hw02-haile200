/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int lines= Integer.parseInt(args[0]);
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < lines; j++) {
				System.out.print(" * ");
			}		
			System.out.println("  ");
			if(i%2==0){   /// עוזר לעשות רווח בין השורות 
			System.out.print(" "); 
			}	
		}

	}
}
