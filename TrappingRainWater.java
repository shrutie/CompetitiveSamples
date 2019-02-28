package p1;

import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;
public class TrappingRainWater {

	public static void main(String[] args) {
		// Similar to highest area in Histogram
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		for(int i=0;i<tc;i++){
			Scanner sizei= new Scanner(System.in);
			int size= sizei.nextInt();
			int[] arr= new int[size];
			for (int i1=0;i1<size;i1++) {
				Scanner s= new Scanner(System.in);
				arr[i1]= s.nextInt();
			}
			System.out.println("Water trapped: " +calcWater(arr));
		}

	}

	private static int calcWater(int[] arr) {
		//calculate left array: Stores value of the max bar to the left than i-th
		int n= arr.length;
		int water=0;
		
		int[] leftArr= new int[n];
		leftArr[0]= arr[0];
		//System.out.println("Arr[0]" + arr[0]);
		for(int i=1;i<n;i++){
			leftArr[i]= java.lang.Math.max(leftArr[i-1], arr[i]);
			//System.out.println("Value in left array at :" + i+ ": "+leftArr[i]);
		}
		
		//calculate right array: Stores the value of the max bar to teh right than i-th
		int[] rightArr= new int[n];
		rightArr[n-1]= arr[n-1];
		for(int i=n-2;i>=0;i--){
			rightArr[i]= java.lang.Math.max(rightArr[i+1], arr[i]);
			//System.out.println("Value in right array at :" + i+": "+ rightArr[i]);
		}
		
		//calculate water. min of left/right subtracted from the current height will be equals to teh amount that can be stored.
		for(int i=0;i<n;i++){
			
			//System.out.println("Water added calculation: " + (java.lang.Math.min(leftArr[i], rightArr[i])- arr[i]));
			water +=  java.lang.Math.min(leftArr[i], rightArr[i])- arr[i];
		}
		
		return water;
		
		
	}

}
