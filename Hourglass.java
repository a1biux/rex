public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// arrays 2D
		int a[][] = new int[6][6];
		int sum = 0;
		int large = 0;
		int count = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
						+ a[i + 2][j + 2];
				if(count ==1){
					large=sum;
				}
				if (count > 1) {
					if (sum > large) {
						System.out.println("sum: " + sum);
						large = sum;
					}
				}
				count ++;
			}
		}
		System.out.println(large);
		in.close();
	}
