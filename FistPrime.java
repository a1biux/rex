import java.util.ArrayList;

public class FistPrime {

	public static void main(String[] args) {
		int maxcount = 10001;
		int count = 1;
		int num = 2;
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		while (count <= maxcount) {
			if (isPrime(num)) {
				numbers.add(num);
				count++;
			}
			num++;
		}

		for (Integer val : numbers) {
			System.out.println(val + " ");
		}

		System.out.println("The  " + maxcount + " th prime number is: " + numbers.get(numbers.size() - 1));
	}

	public static boolean isPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}

		}
		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}

}
