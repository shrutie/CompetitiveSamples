package p1;

public class SwitchFlip {
	
	public static int flipSwitch(int[] arr){
		//if countofflips is even toh state is same as original, if not state is reversed than orginal
		int countOfFlips=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 0) countOfFlips++;
		}		
		return countOfFlips;
	}
	 public int minDistance(String A, String B) {
	        int la=A.length();
	        int lb=B.length();
	        int[][] T;
	        T= new int[lb+1][la+1];
	        
	        for(int i=0; i<=lb; i++){
	            T[i][0]=i;
	        }
	        for(int j=0; j<=la; j++){
	            T[0][j]=j;
	        }
	        
	        for(int i=1; i<=lb; i++){
	            for(int j=1; j<=la; j++){
	                if(B.charAt(i-1)==A.charAt(j-1)){
	                    T[i][j]=T[i-1][j-1];
	                }
	                else{
	                    T[i][j]=1+minimum(T[i-1][j-1],T[i][j-1],T[i-1][j]);
	                }
	            }
	        }
	        return T[lb][la];
	    }
	    public int minimum(int A, int B, int C){
	        if(A<B){
	            return A<C?A:C;
	        }
	        else{
	            return B<C?B:C;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,1};
		System.out.println(flipSwitch(arr));
	}

}
