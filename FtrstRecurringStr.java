package p1;

import java.util.HashMap;
import java.util.Map;

public class FtrstRecurringStr {
	final HashMap<Character, Integer> memo = new HashMap<Character, Integer>();

	public void _init(String st) {
		st=st.toUpperCase();
		if (st.length() != 0) {
			for (int i = 0; i < st.length(); i++) {
				memo.put(st.charAt(i), -1);
			}
		} else
			System.out.println("INVALID IP");
	}

	public char findRec(String st) {
		// ABCAB
		st=st.toUpperCase();
		if (st.length() != 0) {
			for (int i = 0; i < st.length(); i++) {
				memo.put(st.charAt(i), memo.get(st.charAt(i)) + 1);
				if (memo.get(st.charAt(i)) > 0)
					return st.charAt(i);

			}

		}

		return ' ';

	}

	public static void main(String[] args) {
		String st = "ABCbAB";
		FtrstRecurringStr ft = new FtrstRecurringStr();
		ft._init(st);
		System.out.println("Here: " + ft.findRec(st));

	}

}
