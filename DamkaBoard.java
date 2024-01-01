/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int lines=4;// Integer.parseInt(args[0]);
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < lines; j++) {
				if (lines-1==j){
				System.out.print("*"+"\n");
				}else
				System.out.print("* ");
				}
				if(i%2==0){   /// Helps to make space between lines 
					System.out.print(" ");
				}
			}
	}
}
//done 