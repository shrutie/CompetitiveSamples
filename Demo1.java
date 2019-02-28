package p1;

public class Demo1 {
	
	public static int get_val(char ch){
		if(ch>='0' && ch<= '9') return  (int)ch-'0';
		else
			return (int)ch-'A'+10;
		
	}
	public static char ret_val(int num){
		return 0;
		
	}
	
	static int toDeci(String st, int base){
		
		int num=0;
		int power=1;
		for(int i= st.length()-1;i>=0;i--){
			num+= get_val(st.charAt(i))*power;
			power= power*base;
		}
		
		
		return num;
	}
	
	static int fromDecitoDeci(int num, int base){
		// reverse number
		//for each remainder multiply it with power (starts with base to the power-> 0 , ends at num length)
		int len_num= String.valueOf(num).length();
		int value=0;
		int power=0;
		for(int i=0;i<len_num;i++){
			int rem=num%10;
			System.out.println((base^power)+ "rem" + num%10);
			value+= (Math.pow(base, power))* rem;
			num= num/10;
			power++;
		}
		System.out.println(value);
		
		return value;
		
	}
	
	
	// Driver code 
	public static void main (String[] args)  
	{ 
	    String str = "11A"; 
	    int base = 16; 
	   System.out.println("Decimal equivalent of "+  
	                        str + " in base "+ base +  
	                                     " is "+ " "+  
	                              toDeci(str, base)); 
		
		 int inputNum = 104;
		 int base1 = 10; 
		   
		    System.out.println(" " + fromDecitoDeci(inputNum, base1)); 
	} 
	} 
	
	/*public static void main(String args[]){
		
		System.out.println(main(""));
	}
	
	public static int main(String args){
		
		try{
			char a='0';
		
		System.out.println((int)a - '0');
			System.out.println("try: " + args);
			for(char ch= 'A'; ch<='z'; ch++){
				System.out.println((int)ch - 'A' + 10);
			}
			
			return 1;
		}
		catch(Exception e){
			System.out.println("Exce");
			return 2;
		}
		finally{
			//System.out.println("final");
			return 3;
		}
	}*/


