package javaprogramms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Random Numbers between 0 to 50 ");
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.println(r.nextInt(50));
		}

		// or
		System.out.println("*****************************");
		for (int i = 1; i <= 5; i++) {
			System.out.println((int) (Math.random() * 50));
		}
		// or
		System.out.println("******************************");
		for (int i = 1; i <= 5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(0, 50));
		}
	}

}
