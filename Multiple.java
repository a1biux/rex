public class Multiple {

	public static void main(String[] args) {
		int top = 1000;
		int n1 = 3;
		int n2 = 5;
		int sum = 0;
		for (int i = 1; i < top; i++) {
			if (isMultiple(i, n1)) {
				System.out.println("i: " + i);
				sum = sum + i;
			} else if (isMultiple(i, n2)) {
				System.out.println("i: " + i);
				sum = sum + i;
			}
		}

		System.out.println("result: " + sum);
	}

	public static boolean isMultiple(int i, int n) {

		if (i % n == 0) {
			return true;
		} else {
			return false;
		}
	}
}
