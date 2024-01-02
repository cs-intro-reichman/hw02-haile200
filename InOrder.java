/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	int FirstTry = (int)(Math.random() * (10));	
	int Attempts = 0;
	System.out.print(+FirstTry+" ");
	do{	
		Attempts = (int)(Math.random() * (10));    
		if(Attempts>=FirstTry){	
    		System.out.print(+Attempts+" ");     // A loop enters only when the second is larger than the first  
			FirstTry = Attempts;
		}	
    }while(FirstTry <= Attempts);	

	}
}
//done 
