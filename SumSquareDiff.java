import java.util.ArrayList;
import java.util.List;

public class SumSquareDiff {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		int top = 100, i;
		int diff=0;
		for (i = 1; i <= top; i++) {
			numbers.add(i);
		}
		diff = squareOfTheSum(numbers) - sumOfTheSquares(numbers);
		System.out.println(diff);
	}

	public static int sumOfTheSquares(List<Integer> numbers) {
		int sum = 0;
		for(Integer n: numbers){
			sum = (int) (sum + Math.pow(n.intValue(), 2));
		}
		return sum;
	}

	public static int squareOfTheSum(List<Integer> numbers) {
		int sum = 0;
		for(Integer n: numbers){
			sum = sum + n.intValue();
		}
		sum = (int) Math.pow(sum, 2);
		return sum;
	}
}
