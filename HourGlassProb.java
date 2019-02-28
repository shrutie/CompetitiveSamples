package p1;

public class HourGlassProb {
	
	public static int hourglass(int arr[][]){
		if(arr[0].length < 3 || arr.length< 3) return -1;
		int maxNum= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				
				if(!(i >= arr.length-2 || j >= arr.length-2)){
					
					int temp =  arr[i][j] + arr[i][j+1]+ arr[i][j+2]+
								arr[i+1][j+1]+
								arr[i+2][j] +arr[i+2][j+1] + arr[i+2][j+2];
					//System.out.println("Temp calclualted: " + temp +" \nSUm of Hourglass: " +  arr[i][j] + arr[i][j+1]+ arr[i][j+2] +" second: " +arr[i+1][j+1]+ "Third: " + arr[i+2][j] +arr[i+2][j+1] + arr[i+2][j+2]);
					if(maxNum < temp) maxNum=temp;
					//System.out.println("Maximum now is: " + maxNum);
				}
				}
			}
					
		return maxNum;
	}

	public static void main(String[] args) {
		 int [][]mat = 
			 //{{-1},{-3},{2}};
			 {{1, 1, 1, 0, 0, 0}, 
                 {0, 1, 0, 0, 0, 0}, 
                 {1, 1, 1, 0, 0, 0}, 
                 {0, 0, 2, 4, 4, 0}, 
                 {0, 0, 0, 2, 0, 0},
                 {0, 0, 1, 2, 4, 0}};
		 /*
		  *1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0 */
		  
  int res = hourglass(mat); 
  if (res == -1) 
      System.out.println("No hourglasses"); 
  else
      System.out.println("Max sum of hourglass: "
                          + res);

	}

}
