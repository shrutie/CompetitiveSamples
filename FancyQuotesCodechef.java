package p1;

import java.util.Scanner;

public class FancyQuotesCodechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tc;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter test cases");
		tc= sc.nextInt();
		//tc= 1;
		int flag=-1;
		while(tc!=0){
			Scanner sc1= new Scanner(System.in);
			StringBuffer st=new StringBuffer();
			st.append(sc1.nextLine());
			String str= st.toString();
			String[] stArr= str.split("\\s+");
			for (int i = 0; i < stArr.length; i++) {
				//System.out.println(stArr[i]);
				if(! (stArr[i]).toLowerCase().equals(stArr[i]) ) return;
				if((stArr[i]).equals("not")){
					//System.out.println("found not");
					flag=1;
					break;
				}
				else flag=0;
			}
			if(flag==1) 
				System.out.println("Real fancy");
			else if(flag==0)
				System.out.println("regular fancy");
			
			tc--;
		}

	}

}
