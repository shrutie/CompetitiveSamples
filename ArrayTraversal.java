package p1;
import java.util.*;

public class ArrayTraversal {
	
	public static void shiftZeroes(int [] arr){
		// to move zeroes at the end
				int count=0;
				int n= arr.length;

				//logic
				for(int i=0;i<n;i++){
					if(arr[i] != 0){
						arr[count]= arr[i];
						count++;
					}
				}
				for(int j=count;j<n;j++){
					arr[j]= 0;
				}
				
	}
	
	public static void evenOdd(int[] arr){
		// for even odd
				// put 2 pointers left and right and when any left_ptr has odd number swap it with right_ptr
				int n= arr.length;
				int left=0, right=n-1;
				while(left<right){
					while(arr[left]%2 == 0 && left<right) left++;
					while(arr[right] %2 ==1 && left< right) right--;
					
					if(left<right){
						
						int temp=0;
						temp=arr[left];
						arr[left]= arr[right];
						arr[right]= temp;
						left++;
						right--;
					}
					
						
				}
				
				for (int i = 0; i < arr.length; i++) {
					System.out.print(" " +arr[i]);
				}
				
	}

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length");
		int n= sc.nextInt();
		int []arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		shiftZeroes(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " +arr[i]);
		}
		int arr1[]={12, 34, 45, 9, 8, 90, 3};
		evenOdd(arr1);
		
		
		
		
		
	}

}
