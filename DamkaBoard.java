/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int column = Integer.parseInt(args[0]);
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < column*2; j++) {
                System.out.print((i + j) % 2 == 0 ? "*" : " ");  
            }
            System.out.println();
        }
    }
}
	
