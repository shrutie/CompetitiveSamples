package p1;

public class CF801BValuedKeys {
	
	// inp: s1, s2 (equal length)
	// output: s3 (same length) such that f(s1, s3) =  s2
	/*Algo:
	 	compare the string{
	 	 if same alphabets, append char+1 or highest char value;
	 	 else if ip<res append min of the two chars
	 	 Invalid then ret -1: 
	 	 	if s3 equals s1 or s2 
	 	 	if length is unequal
	 	 	null strings
	 
	 */
	
	public static String calcFn(String s1, String s2){
		String ret_st="";
		//corner cases
		if(s1.length() != s2.length()) return "-1";
		if(s1== null || s2== null) return "-1";
		
		char[] s1Ch= s1.toCharArray();
		char[] s2Ch = s2.toCharArray();
		
		
		for(int i=0;i<s1Ch.length;i++){
			//System.out.println(s1Ch[i] + " and " +s2Ch[i]);
		int char_s1= (int)s1Ch[i];
		int char_s2= (int)s2Ch[i];
		if(char_s1 == char_s2) ret_st+= (char)(char_s2+1);
		else 	ret_st+=(char)char_s2;
		}
		
		if(ret_st.equals(s1) || ret_st.equals(s2)) return "-1";
		return ret_st;
	}
	public static void main(String[] args){
		System.out.println(calcFn("ab","ba"));
		System.out.println(calcFn("nzwzl","niwel"));
		System.out.println(calcFn("ab","aa"));
		System.out.println(calcFn("AB","ab"));
	}
}
