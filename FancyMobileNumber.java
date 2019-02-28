package p1;

import java.util.HashMap;
import java.util.Map;

public class FancyMobileNumber {

	public static void main(String[] args) {
		String st= "901191812";
	
		for(int i= st.length()-2;i>2;i--){
			// 1. Consecutive same digits
			if(Integer.parseInt(String.valueOf(st.charAt(i-1))) == Integer.parseInt(String.valueOf(st.charAt(i+1))) 
					&& Integer.parseInt(String.valueOf(st.charAt(i+1)))== Integer.parseInt(String.valueOf(st.charAt(i)))){
				System.out.println("Fancy from 1");
				return;
			}
			//2. decreasing or inc 3 
			if(((Integer.parseInt(String.valueOf(st.charAt(i-1))) - Integer.parseInt(String.valueOf(st.charAt(i))) == -1)
				|| (Integer.parseInt(String.valueOf(st.charAt(i-1))) - Integer.parseInt(String.valueOf(st.charAt(i))) == 1)
				) &&
				((Integer.parseInt(String.valueOf(st.charAt(i))) - Integer.parseInt(String.valueOf(st.charAt(i+1))) == -1)
						|| (Integer.parseInt(String.valueOf(st.charAt(i))) - Integer.parseInt(String.valueOf(st.charAt(i+1))) == 1))
					){
				System.out.println("Fancy at " +i+" and  " + Integer.parseInt(String.valueOf(st.charAt(i))));
			return;
		}
		}
		
		int[] arr= new int[10];
		
		for(int i=0;i<st.length();i++){
			int digit = Integer.parseInt(String.valueOf(st.charAt(i)));
			arr[digit]++;
			if(arr[digit] >3){
			System.out.println("Invalid");
			return;
			}
		}
		
/*		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i=0;i<st.length();i++){
			mp.put(Integer.parseInt(String.valueOf(st.charAt(i))), 0);
			
		}*/
		

	}

}
