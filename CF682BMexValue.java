package p1;

import java.util.Arrays;

public class CF682BMexValue {

	public static void main(String[] args) {
		int x=1;
		int arr[]= {2,1};
		// Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			
		/*	if(arr[i]== x) x++;
			else if(arr[i] > x){
				arr[i]=x;
				x++;
			}*/
			if(x <= arr[i]){++x;}
		}
			System.out.println(x);
	}

}
