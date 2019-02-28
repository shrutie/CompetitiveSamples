package p1;

public class Memo1 {

	final int max = 100;
	final int nil = -1;

	int memo[] = new int[max];

	public void initi() {
		for (int i = 0; i < max; i++) {
			// System.out.println(i);
			memo[i] = nil;

		}
	}

	public int fib(int n) {
		if (memo[n] == nil) {
			if (n <= 1)
				memo[n] = n;
			else
				memo[n] = fib(n - 1) + fib(n - 2);
		}
		return memo[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memo1 m1 = new Memo1();
		m1.initi();
		
		System.out.println("Fib of 12 is:" + m1.fib(12));

	}

}
