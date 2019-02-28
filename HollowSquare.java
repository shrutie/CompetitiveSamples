package p1;

import java.util.Scanner;


public class HollowSquare {
	

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();

		// Hollow Square
		System.out.println("---------Square-----------\n");
		for(int i=0;i<n;i++){	//no of rows
			
			for(int j=0;j<n;j++){
				if(i==0 || i== n-1 || j==0 || j== n-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
			
		}
		
		// Hollow Rhombus
		System.out.println("---------Rhombus-----------\n");
		for(int i=0;i<n;i++){	// no of rows
			
			for(int sp=n-i;sp>=0;sp--){	//spaces
				System.out.print(" ");
			}
			for(int j=0;j<n;j++){
				if(j==0 || j== n-1 || i==0 || i== n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		//Inverted Pyramid pattern
		System.out.println("---------Inverted Pyramid-----------\n");
		for(int r=1;r<=n;r++){ // rows
			
		for(int sp=0;sp<r;sp++){ //spaces
			System.out.print(" ");
		}
		for(int i=2*n-r;i>=r;i--){
			System.out.print("*");
		}
		System.out.println("");
		}
	}
		

}
