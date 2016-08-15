public class Subarrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int k = i; k < n; k++) {
				System.out.print(" " +  a[k]);
				sum = a[k] + sum;
				if (sum < 0) {//testing negative number
					count++;
				}
			}
			System.out.println("");
		}
		sc.close();
		System.out.println("negatives subarrays: " + count);
	}
}
