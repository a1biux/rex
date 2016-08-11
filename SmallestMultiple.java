import java.util.ArrayList;
import java.util.List;

public class SmallestMultiple {

	public static void main(String[] args) {
		int i=0;
		boolean isDivisible=true;
		
		List<Integer> ints = new ArrayList<Integer>();
		for(i=1;i<=20;i++){
			ints.add(i);
		}
		
		bucle1:
			for(i=1;;i++){
				bucle2:
				for(Integer integ: ints){
					isDivisible = isMultiple(i, integ.intValue());
					if(!isDivisible){
						break bucle2;
					}
				}
				if(isDivisible){
					System.out.println("The smallest multiple is: " + i);
					break bucle1;
				}
			}
	}

	public static boolean isMultiple(int a, int b){
		if(a % b==0){
			return true;
		}else{
			return false;
		}
	}
}
