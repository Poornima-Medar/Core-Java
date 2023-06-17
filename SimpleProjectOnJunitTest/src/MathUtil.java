
public class MathUtil {
	public static int factorialOf(int number) {
		int fact = 1;
		if(number<0) {
			System.out.println("The number should be greater than 0)");
		}else {
			for (int i = 1; i<= number; i++) {
				fact = fact * i;
			}
		}
		return fact;	
	}
}
