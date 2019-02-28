package p1;

public class SpiralArr {

	public static void printInSpiralOrder(final int[][] arr, int m, int n) {
	// initially
		int top= 0;
		int bottom= n-1;
		int left=0;
		int right= arr[0].length-1;
		int dir=1;
		while(top<= bottom && left<= right ){
			//top
			if(dir==1){
				for(int i= left;i<=right;i++){
					System.out.print(" " + arr[top][i]);
				}
				++top;
				dir=2;
			}
			//right
			else if(dir==2){
				for(int i=top;i<=bottom;i++){
					System.out.print(" " + arr[i][right]);
					
				}
				--right;
				dir=3;
			}
			//bottom
			else if(dir==3){
				for(int i=right;i>= left;i--){
					System.out.print(" " + arr[bottom][i]);
				}
				--bottom;
				dir=4;
			}
			//left
			else if(dir==4){
				for(int i=bottom;i>= top;i--){
					System.out.print(" " + arr[i][left]);
				}
				++left;
				dir=1;
				//System.out.println("Dir now: " + dir);
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		
		int a[][] = { {1,  2,  3,  4,  5,  6}, 
		        {7,  8,  9,  10, 11, 12}, 
		        {13, 14, 15, 16, 17, 18} 
		    };
		printInSpiralOrder(a,6,3);

	}

}
