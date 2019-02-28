package p1;

import java.util.Scanner;

public class JugglingAlgoArrRotation {
	
	public static int[] rotateArr(int arr[], int d){
		int n= arr.length;
		int k, temp;
		System.out.println(gcd(n,d));
		for(int i=0; i< gcd(n,d); i++){
			
		temp=arr[i];
		int j = i;
		while(true){ 
		k= j+d; // to start from the first value from the next set
		if(k>=n) k=k-n; 
		if(k==i) break; // when its the last rotation
		arr[j]= arr[k]; // value at first of next set assigned to the first value of preceding set
		j=k;	//start from the next set 
		}
		arr[j]= temp;
		
		}
		
		return arr;
	}
	
	public static int gcd(int a, int b){
		if(b==0) return a;
		else{
			 return gcd(b, a%b);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Enter size of array");
		int n= s.nextInt();
		System.out.println("Enter rotations: ");
		int d= s.nextInt();

		int arr[]= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]= s.nextInt();
		}
		
		int result[]= rotateArr(arr,d);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i] + "  , ");
		}
		
		
	}


}
