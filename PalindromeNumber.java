import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n1 = 999;
		int n2 = 999;
		int limit = 100;
		int res = 0;
		String pal = "";
		String pal_rev = "";
		
		List<Integer> palindromes = new ArrayList<Integer>();
		for (int i = n1; i >= limit; i--) {
			for (int j = n2; j >= limit; j--) {
				res = i * j;
				pal = "" + res;
				pal_rev = new StringBuffer(pal).reverse().toString();
				if (pal.equals(pal_rev)) {
					palindromes.add(new Integer(pal));
				}
			}
		}
		
		Collections.sort(palindromes);
		
		System.out.println("pal:" + palindromes.get(palindromes.size() - 1));
		
	}
}
