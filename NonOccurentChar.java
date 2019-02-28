package p1;

public class NonOccurentChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="teetotaler";
		
		for(int i=0;i<st.length();i++){
			int count=0;
			for(int j=i; j<st.length();j++){
				
				if(st.charAt(i) ==  st.charAt(j) && i != j) count++;
							
			}
			if(count==0){ 
				System.out.println(st.charAt(i));
				return;
			}
			System.out.println("Count of char " + st.charAt(i) + ": "+count);
		}
		
	}

}
