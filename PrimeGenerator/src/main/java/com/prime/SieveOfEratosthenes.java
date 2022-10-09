package com.prime;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

	public static List<Integer> sieveOfEratosthenes(int lowerLimit, int upperLimit) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = lowerLimit + 1; i < upperLimit; i++) {

			if (isPrime3(i)) {
				list.add(i);
			}
		}

		return list;
	}

	public static boolean isPrime3(int number) {

		if (number < 2) {
			return false;
		} else {
			for (int j = 2; j <= Math.sqrt(number); j++) {
				if (number % j == 0) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		
		SieveOfEratosthenes s1 = new SieveOfEratosthenes();
		List<Integer> list = s1.sieveOfEratosthenes(1000, 1050);

		System.out.println(list);
	}

}
