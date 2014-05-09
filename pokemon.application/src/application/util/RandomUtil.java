package application.util;

import java.util.Random;

public class RandomUtil {

	public static int randomInt(int maxValue){
		
		Random random = new Random();
		return random.nextInt(maxValue);
	}
	
	public static double randomdouble(int maxValue){
		
		Random random = new Random();
		return random.nextDouble();
	}
}
