package p1;

import java.util.Arrays;

public class KadanesAlgo {

	public static int maxSumSubArray(int[] arr){
		int sum=0;
		int cumSum[] = new int[arr.length];
		cumSum[0] = arr[0];
		for(int i=1;i<arr.length;i++){
			//System.out.println(arr[i-1] + " + " + arr[i]);
			cumSum[i]= cumSum[i-1] + arr[i];	
			//System.out.println(cumSum[i]);
			if(cumSum[i] < 0) cumSum[i] = 0;
		}
	
		if(cumSum[arr.length-1] == 0 ){
			Arrays.sort(arr);
			return arr[arr.length-1];
		}
		return cumSum[arr.length-1];
		
	}
	
	public static int flipArray(int[] arr){
		
		
		return 0;
	}
	
	public static void main(String args[]){
		int[] arr= {-1, -2,-3,-4};
		System.out.println("Answer: "+maxSumSubArray(arr));
	}
}
