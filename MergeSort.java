package p1;

public class MergeSort {
	//NA:
	public static void MergeProcedure(int[] arr, int l, int r, int mid){
		int i=l, j=mid+1, k=0;
		int[] C= new int[r-l+1];
		//System.out.println("size: "+C.length);
		for(int x=0;x<arr.length;x++) System.out.print(arr[x]+" ");
		System.out.println("----");
		
		while(i<=mid && j<=r){
			
			if(arr[i] < arr[j]){
				System.out.println("arr at i: "+arr[i]);
				C[k++] = arr[i++];
			}
			else {
				System.out.println("arr at j: "+arr[j]);
				C[k++] = arr[j++];	
			}
		}
		
		//if elements are still remaining
		while(i<mid) C[k++]= arr[i++];
		while(j<r) C[k++] = arr[j++];
		for(int s=0;s<C.length;s++){
			//System.out.println(arr[s]);
			arr[s]= C[s];
		}
		
		
	}
	
	public static void merge(int[] arr, int l, int r){
		if(l==r) return;
		int mid= (l+r)/2;
		//System.out.println("mid: "+mid);
		merge(arr, 0, mid);
		merge(arr, mid+1,r);
		MergeProcedure(arr, l,r, mid);
		
	}


	public static void main(String[] args) {
			int arr[] =  {1, 20, 6, 4, 5};
			merge(arr,0,arr.length-1);
			/*for(int i=0;i<arr.length;i++){
				System.out.print("  > "+arr[i]);
			}*/
	}

}
