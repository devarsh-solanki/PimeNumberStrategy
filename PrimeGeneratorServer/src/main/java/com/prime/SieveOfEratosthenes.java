package com.prime;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
	
	public static String sieveOfEratosthenes(int lowerLimit, int upperLimit) {

		List<String> list = new ArrayList<String>();

		for (int i = lowerLimit + 1; i < upperLimit; i++) {

			if (isPrime3(i)) {
				list.add(String.valueOf(i));
			}
		}

		String arr[] = new String[list.size()];

		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}

		StringBuilder sb = new StringBuilder();

		for (String s : arr) {
			sb.append(s + ", ");
		}

		return sb.toString();
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
		String str = s1.sieveOfEratosthenes(80, 147);

		System.out.println(str);
	}

}
