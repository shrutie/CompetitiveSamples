package p1;

public class SelectionS {
	
	public static int selections(int arr[]){
		int n= arr.length;
		int min= Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
			
				if(arr[j]> min){
					min= arr[j];
				}
			}
			arr[i]= min;
		}
		for (int i=0;i<n;i++) {
			System.out.println("i : " + arr[i]);
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr={1,2,4,3,6,7,8};
		selections(arr);

	}

}
