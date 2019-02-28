package p1;

import java.util.Scanner;

public class Str_quesPallindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to check if the given string is a permutation of a pallindrome
		Scanner sc= new Scanner(System.in);
		String st= sc.next();
		char[] chArr= st.toCharArray();
		java.util.Arrays.sort(chArr);
		for (char c : chArr) {
			System.out.print(c + " ");
		}
		int count=0;
		for(int i =0;i<chArr.length-1;i++){
			
			count++;
			//System.out.println("Initial count for "+ chArr[i] + count);
			if(chArr[i] == chArr[i+1]){
			//System.out.println("char that is same:"  + chArr[i]);
			count--;
			//System.out.println("If its same count should be 0: "+ count);
			i=i+1;
			//System.out.println("index now: " + i);
			}
			//count++;	
		}
		System.out.println("Final Count: " + count);
		if(count != 0 && count!= 1){
			System.out.println("Not a pallindrome");
		}
		else{ System.out.println("Pallindrome");
		}
	}

}
