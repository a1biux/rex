
public class Fibonacci {

	public static void main(String[] args){
		int top=4000000;
		int n1=1;
		int n2=2;
		int res=n1+n2;
		int sum=0;
		do{
			//sum even values
			if(n2%2==0){
				sum= sum + n2;
				System.out.print(" " + n2);
			}
			n1=n2;
			n2=res;
			res=n1+n2;
			//if the max value doesn't exceed the top
		}while(n2<=top);
		System.out.print(" sum " + sum);
	}
}
