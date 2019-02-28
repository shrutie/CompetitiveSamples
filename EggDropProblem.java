package p1;

public class EggDropProblem {
	
	public static int minTrial(int egg, int floor){
		//int dp[][] = new int[egg+1][floor+1];
		int min_num= Integer.MAX_VALUE;
		if(floor == 1 || floor == 0){
			//dp[0][1]= 1;
			return floor;
		}
		if(egg ==1){
			return floor;
		}
		
		for(int i=1;i<=floor;i++){
			int res= Math.max(minTrial(egg-1, i-1), minTrial(egg, floor-i));
			//System.out.println("Minimum on floor: "+i + "with eggs: "+ egg +"and result: " +res);
			if(min_num > res)
				min_num= res;
		}
		
		return min_num+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(minTrial(2,36));
	}

}
