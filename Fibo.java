package p1;

public class Fibo {

	public final int  max=100;
	int memo[]= new int[max];
	public void init(){
		for (int i=0;i<max;i++){
			memo[i]=-1;
		}
	}
	public int fib(int n){
		if(n==0 || n==1){
			memo[n]=n;
		}
		else{
			memo[n]= fib(n-1)+fib(n-2);
			}
		
		return memo[n];
		}
	
	public static void main(String[] args) {
		Fibo obj= new Fibo();
		obj.init();
		System.out.println(obj.fib(9));

	}

}
