import javax.swing.JOptionPane;

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String Letters = (args[0]);
		int Middle =  Letters.length()/2;
		if (Letters.length()%2==0) {
			 Middle =  Letters.length()/2-1;
		}
		String Reverse = " ";
		for (int i = Letters.length()-1; i >= 0; i--) {  
			Reverse+=""+Letters.charAt(i)+"";
			}
		System.out.println(Reverse);
		System.out.println("The middle character is "+Letters.charAt( Middle));
	}
}
//done 
