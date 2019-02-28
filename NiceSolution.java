package p1;
import java.util.*;
public class NiceSolution {

	//Transpose of a matrix
	public static void transposeMat(int arr[][]){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[j][i] + " ");
			}
			System.out.println("");
		}
		
	}
	
	//String remove vowels, not if consecutive vowels come
	public static void removeVowels(String st){
		ArrayList<Character> vow1= new ArrayList<Character>();
		vow1.add('a');vow1.add('e'); vow1.add('i');vow1.add('o'); vow1.add('u');
		vow1.add('A');vow1.add('E'); vow1.add('I');vow1.add('O'); vow1.add('U');
		String new_st="";
		char ip[]= st.toCharArray();
		for(int i=0;i<ip.length;i++){
			if(vow1.contains(ip[i])){
				if(i != (ip.length-1) && vow1.contains(ip[i+1])){
					new_st+=ip[i];
					new_st+=ip[i+1];
				}
			}
			else new_st+=ip[i];
		}
		
		System.out.println("Here: " + new_st);
	}

	
	public static void main(String[] args){
	int [][]arr= new int[3][3];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]= sc.nextInt();
			}
		}
		transposeMat(arr);
		
		removeVowels("CAt");
		
		
	}
}
