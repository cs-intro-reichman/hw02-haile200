
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	String fixer = "";	
	String ans = "";
	char boy = 'b';
	char girl = 'g';
	boolean helper = true;
	while (helper){
		double rand = Math.random(); 
        ans+= (rand<0.5) ? boy : girl;                                                                                               
		for (int i = 0; i < ans.length()-1; i++) {  
			if(ans.length()>1){
				if (ans.charAt(i)!=ans.charAt(i+1))
					helper=false;
			}
		}
	}
	int i = 0;
	for (; i <= ans.length()-1; i++) {
		fixer+=" "+ans.charAt(i);
	}
	System.out.print(fixer);
	System.out.println("\n"+" You made it... and you now have " +i);  // Need to work on the organization and visibility
	}
}
//done 
