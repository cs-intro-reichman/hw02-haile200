import javax.swing.JOptionPane;

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String letter= "abc";//(args[0]);
		int Middle=  letter.length()/2;
		String Reverse =" ";
		for (int i = letter.length()-1; i >= 0; i--) { // לוקח את האות האחרונה ושם אותו ראשונה 
			Reverse+=""+letter.charAt(i)+"";
			}
		System.out.println(Reverse);
		System.out.println(" The middle character is "+letter.charAt( Middle));
	}
}
//done 
