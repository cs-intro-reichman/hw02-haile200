/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
    int experiments= Integer.parseInt(args[0]);
    String ansForMore = ".";	
	String ans= "";
	int conter2 = 0;     
	int conter3 = 0;
	int conter4 = 0;
    int colcoltion = 0;
	char boy = 'b';
	char girl = 'g';
    int r = 0;
    for (; r < experiments; ++r) {
        ans="";
    	boolean helper = true;
        while (helper){
				double rand = Math.random(); 
		   		ans+= (rand<0.5) ? boy : girl;
				 		colcoltion++;                                                  
        		for (int i = 0; i < ans.length()-1; i++) {
            		if(ans.length()>1){
                   		if (ans.charAt(i) != ans.charAt(i+1)){
    	                		helper=false;
                	}                                         
            	}
                  
        }
		if(ans.length()==2 )
		      conter2++;
		if(ans.length()==3 )
			  conter3++;
		if(ans.length()>=4)
		      conter4++;
	}
  double Average=((double)colcoltion/(double)experiments);    
  int chack = Math.max(conter3, conter2);
  int max = Math.max(chack,conter4); 
  if(max==conter4 ){
         ansForMore = " or more.";
            max = 4;
        }else if 
        (max==conter2)  
            max = 2;
        else
            max = 3;
        if(r==experiments){     
    			System.out.println("Average : "+Average+" children to get at least one of each gender."+"\n"+
                        "Number of families with 2 children : "+conter2+"\n"+
                        "Number of families with 3 children : "+conter3+"\n"+
                        "Number of families with 4 or more children: "+conter4+"\n"+                           
                        "The most common number of children is "+max+ansForMore);
		}
	}
}
}