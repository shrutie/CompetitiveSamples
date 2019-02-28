package p1;

public class QuickSort {

	
	public static int partitionAlgo(int[] arr,int start, int n){
		//System.out.println("starts--"+n);
		int piv=arr[n-1];
		int j=;
		//System.out.println(" " + arr[n-1]);
		for(int i=start;i<n;i++){
			//System.out.print(" --In loop: "+arr[i] + " J:" + j);
			
			if(arr[i] < piv){
				j++;
				//swap two elements
				int temp=arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
						
				//System.out.println("J is: "+ j);
			}
		}
		//now swap arr[j] and pivot element
		//System.out.println("J now after for loop: " + j);
		int tmp2=arr[j+1];
		arr[j+1]=arr[n-1];
		arr[n-1] = tmp2;
		
		return j+1;
	}
	public static void QSort(int[] arr, int start, int end){
		if(start<end){
			
			int pivot= partitionAlgo(arr,start, end);
			System.out.println(""+pivot);
			QSort(arr,start,pivot-1);	//elements before array
			QSort(arr, pivot+1, end);	//elements after array

			//System.out.println("||");
		}	
	}
	public static void main(String[] args) {
		int []arr= {10,80,30,90,40,50,70};
		QSort(arr, 0, arr.length-1);
		
		for(int i=0;i<arr.length-1;i++) 
			System.out.print("-->"+ arr[i]);
	}

}
