/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int lines = Integer.parseInt(args[0]);
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines*2; j++) {
                System.out.print((i + j) % 2 == 0 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
	
