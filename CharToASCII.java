package p1;

import java.util.Iterator;

public class CharToASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Shruti";
		char[] ch= str.toCharArray();
		int sum= 0;
		int n= ch.length;
		for (int i = 0; i < ch.length; i++) {
			sum+= (int)ch[i];
		}
		System.out.println("Average: " +  (sum/n));
				
	}

}
