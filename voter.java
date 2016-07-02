import java.util.*;
public class voter {
	String ID;
	String cand1;
	String cand2;

	public int getVote()
{
	
		
	Random rand = new Random() ;
	int min = 1;
	int max = 2;
	int votePref= rand.nextInt(max-min+1)+min;
	return id,votePref;
}
} 