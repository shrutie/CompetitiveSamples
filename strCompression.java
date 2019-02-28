package p1;

import java.util.Scanner;

public class strCompression {

	public static void main(String[] args) {
		// ip: aaaabbaa op: a4b2a2
		
		Scanner sc= new Scanner(System.in);
		String ip= sc.next();
		char[] ch = ip.toCharArray();
		int count=0; String st ="";
		for(int i =0;i<ch.length;i++){
			count++;
			//System.out.println(ch[i]+": " +i +" : "+count);
			if(i!= ch.length-1 && ch[i] != ch[i+1]){
				//System.out.println(ch[i]);
				st+= String.valueOf(ch[i])+count;
			count=0;
			}
			if( i == (ip.length()-1)){
				st+= String.valueOf(ch[i])+count;
			}
		}
		System.out.println("Compressed string: " +st);
		
	}

}
