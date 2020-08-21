import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	System.out.println(Math.random());
		
		Random rand = new Random();
		System.out.println(rand.nextDouble());*/
		
		String rand_numeric = RandomStringUtils.randomNumeric(10);
		System.out.println(rand_numeric);
		
		String rand_string = RandomStringUtils.randomAlphabetic(10);
		System.out.println(rand_string);
	}

}
