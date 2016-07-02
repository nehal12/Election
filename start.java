import java.util.*;
public class start {
	public static void main(String[] args)
	{
		Scanner ac = new Scanner(System.in);
		Scanner bc = new Scanner(System.in);
		int i;
		i = ac.nextInt();
		ac.nextLine();
		voter[] voters = new voter[i];
		for(int j=0;j<i;j++)
		{
			String a[];
			a=ac.nextLine().split(" ");
			voters[j] = new voter(a[0],a[1],a[2]); 
		}
		i = bc.nextInt();
		bc.nextLine();
		candidate[] cand = new candidate[i];
		for(int k=0;k<i;k++)
		{
			String b[];
			b=bc.nextLine().split(" ");
			cand[k] = new candidate(b[0],b[1],b[2]);
		}
		
						
	}

}
