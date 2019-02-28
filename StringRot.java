package p1;
import java.util.Scanner;


public class StringRot {

	public static void main(String[] args){
		
		System.out.println("Enter String");
		Scanner sc= new Scanner(System.in);
		String str =  sc.next();
		
		System.out.println("Rotatate by?");
		Scanner sc1= new Scanner(System.in);
		int rot_index= sc1.nextInt();
		
		char[] ch= str.toCharArray();
	
		for(int i=0;i<str.length();i++){
			int idx= (i+ rot_index)%(str.length());
			//System.out.println(idx + ": " + str.charAt(i));
			ch[idx]=str.charAt(i);
			
		}
		for(char c: ch) System.out.print(c);
		//System.out.println((int)'a');
		//Given a string S, and two numbers N, M - arrange the characters of string in between the 
		//indexes N and M (both inclusive) in descending order. (Indexing starts from 0).
/*		System.out.print("Enter N and M indexes to sort string in between");
		Scanner sc11= new Scanner(System.in);
		int N = sc11.nextInt();
		int M= sc11.nextInt();
		char ch1[]=  str.toCharArray();
		if(N<0 || M >= str.length()) return;
		for(int i=N;i<M;i++){
			if(ch1[N]< )
		}
	}
}*/
}
}
