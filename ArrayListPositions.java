import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPositions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = 0, q, x, y;
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> b = null;
		ArrayList<String> res = null;

		for (int i = 0; i < n; i++) {

			b = new ArrayList<Integer>();
			d = sc.nextInt();
			//b.add(d);
			for (int j = 0; j < d; j++) {
				b.add(sc.nextInt());
			}
			a.add(b);
		}

		q = sc.nextInt();

		res = new ArrayList<String>();

		for (int i = 0; i < q; i++) {
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			try {
				res.add("" + a.get(x).get(y));
			} catch (IndexOutOfBoundsException e) {
				res.add("ERROR!");
			}
		}
		sc.close();
		
		for(String str:res){
			System.out.println(str);
		}
	}
}
