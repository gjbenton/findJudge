public class JudgeDriver{
	public static void main(String[] args){
		Judge nPeople = new Judge();
		int townSize;
		int judge;

//Test case 1 
		int[][]trust1= {{1,2}};
		townSize = 2;

		judge = nPeople.findJudge(townSize, trust1);
		if(judge == -1){
			System.out.println("Judge not found");
		}
		else{
			System.out.println("Judge found at index " + judge);
		}
		System.out.println("Expected output: 2\n");

//Test case 2
		int[][]trust2= {{1,3},
				       {2,3}};
		townSize = 3;

		judge = nPeople.findJudge(townSize, trust2);
		if(judge == -1){
			System.out.println("Judge not found");
		}
		else{
			System.out.println("Judge found at index " + judge);
		}
		System.out.println("Expected output: 3\n");
		
//Test case 3
		int[][]trust3= {{1,3},
				        {2,3},
				   	    {3,1}};
		townSize = 3;

		judge = nPeople.findJudge(townSize, trust3);
		if(judge == -1){
			System.out.println("Judge not found");
		}
		else{
			System.out.println("Judge found at index "+ judge);
		}
		System.out.println("Expected output: -1\n");

//Test case 4
		int[][]trust4= {{1,2},
				       {2,3}};
		townSize = 3;

		judge = nPeople.findJudge(townSize, trust4);
		if(judge == -1){
			System.out.println("Judge not found");
		}
		else{
			System.out.println("Judge found at index "+judge);
		}
		System.out.println("Expected output: -1\n");
//Test case 5
		int[][]trust5= {{1,3},
				        {1,4},
				   	    {2,3},
				   	    {2,4},
				   		{4,3}};
		townSize = 4;

		judge = nPeople.findJudge(townSize, trust5);
		if(judge == -1){
			System.out.println("Judge not found");
		}
		else{
			System.out.println("Judge found at index "+judge);
		}
		System.out.println("Expected output: 3\n");
	}
}