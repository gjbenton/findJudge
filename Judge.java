import java.util.*;
public class Judge{
	/*
	1.Judge trusts no one
	2.Everybody trusts the judge (N-1) pointers to ONE person
	Only one peron fits both

	*/
	public int findJudge(int N, int[][] trust){
		int[] trustedCount = new int[N+1];

		for(int i=0; i<trust.length; i++){
			int trustPair[]= trust[i];

			int a = trustPair[0];
			int b = trustPair[1];
			
			//increments and decrements trusted 'persons' by index. 
			//so long the value at 'b' never maps to 'a' then it will reach N-1
			trustedCount[a]--;
			trustedCount[b]++;
			
		}
		// Fulfills requirement 2, n-1 people trust one person
		for(int i=1; i<N+1; i++){
			if(trustCount[i]==N-1){
				return i;
			}
		}
		return -1;
	}

}