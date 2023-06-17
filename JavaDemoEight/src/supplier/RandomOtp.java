package supplier;
import java.util.function.*;

public class RandomOtp {

	public static void main(String[] args) {
	
		Supplier<String> s = () -> {
			String otp = "";
			for(int i=1;i<7;i++) {
				otp = otp+(int)(Math.random()*(10));
			}
			return otp;
		};
		
		
		System.out.println(s.get());

	}

}
