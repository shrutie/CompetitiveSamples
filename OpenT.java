package p1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class OpenT {

	public static String reverseWord(String st){
		String rev="";
		String[] StArr= st.split("\\.");
		String[] StArr1 = new String[StArr.length];
		int i=StArr.length-1;
		for (String string : StArr) {
		StArr1[i] = string;
		
		i--;
		}
		for (int i1=0;i1<StArr1.length;i1++) {
			rev+=StArr1[i1];
			if(i1 != StArr1.length-1)
				rev+=".";
		}
		
		//System.out.println(rev);
		return rev;
	}
	
	
	//balanced parenthesis
	
	public static boolean helperfunc(char ch1, char ch2){
		//System.out.println(ch1 + " " + ch2);
		if(ch1 == '{' && ch2 =='}')
			return true;
		else if(ch1 == '[' && ch2 ==']')
			return true;
		else if(ch1 == '(' && ch2 ==')')
			return true;
		else if(ch1 == '<' && ch2 =='>')
			return true;
		else
			return false;
	}
	public static boolean isBalanced(String st){
		char[] chSt= st.toCharArray();
		// Use two stacks
		Stack<Character> stOpen= new Stack<Character>();
		for(char ch: chSt){
			//System.out.println("Ch: " + ch);
			if(ch == '{' || ch == '[' ||ch == '(' ||ch == '<')
					stOpen.push(ch);
			if(ch == '}' || ch == ']' ||ch == ')' ||ch == '>'){
				if(stOpen.isEmpty())
					return false;
				else if(!helperfunc( stOpen.pop(),ch)){
					return false;
				}	
					
			}
		}
		if(!stOpen.isEmpty())
			return false;
		else
			return true;
	}
	
	public static void StrReverse(String st){
		if(st == null || st.length()  <=1)
			System.out.print(st);
		else{
			System.out.print(st.charAt(st.length()-1));
			//System.out.println("\n\t"+st);
			//System.out.println("Substr: " + st.substring(0, st.length()-1));
			StrReverse(st.substring(0, st.length()-1));
		}
	}
	
	public static void main(String[] args){
		
		//System.out.println(reverseWord("i.like.this.program.very.much"));
/*		int tc;
		Scanner sc= new Scanner(System.in);
		tc= sc.nextInt();
		while(tc!=0){
			String str= sc.next();
			System.out.println(reverseWord(str));
			tc--;
		}*/
		//System.out.println(isBalanced("[()]{}{[()()]()}"));
		//StrReverse("Hello Dear ");
		//String st= "123gd";
		//System.out.println(st.matches("^\\d+$"));
		CopyOnWriteArrayList<Integer> cpr= new CopyOnWriteArrayList<Integer>();
		
		
	}
	
}
