package p1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;


public class NextHighestNumber {

	
	public static void fn1(int a, String st){
		
	}

	public static void fn1(String st, int a){
		
	}

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
/*		String dig= "534976";
		char[]  dig_ch= dig.toCharArray();
		int a=0;
		int idx_a = 0;
		for(int i= dig.length()-1;i>=1;i--){
			if(Integer.parseInt(String.valueOf(dig_ch[i])) > Integer.parseInt(String.valueOf(dig_ch[i-1]))) {
				a = Integer.parseInt(String.valueOf(dig_ch[i]));
				idx_a=i;
				System.out.println(idx_a);
				break;
			}
	
			//System.out.println(a);
			
		}
		String st_temp= dig.substring(idx_a, dig.length());
		System.out.println(st_temp);
		char[] ch= st_temp.toCharArray();
		char [] ch1= ch.clone();
		Arrays.sort(ch1);
		System.out.println(ch1[0]);
		char c= dig_ch[idx_a];
		//a[idx_a]= ch1[0];
*/		
		Stack myst= new Stack();
		myst.push(10);
		myst.push(12);
		myst.push(11);
		myst.push(1);
		
		Stack myst1= new Stack();
		myst1= (Stack) myst.clone();
		//System.out.println(myst.isEmpty());
		while(!myst.isEmpty()){
			myst1.push(myst.pop());
		}
		//System.out.println("myst1: " + myst1.peek());
		myst.push(99);
		System.out.println(myst1.isEmpty());
		while(!myst1.isEmpty()){
			myst.push(myst1.pop());
		
		
		}
		
		System.out.println(myst.peek());
		
	
		
		}

}
