package com.prime;

import java.util.ArrayList;
import java.util.List;

public class NativePrime2 {

	public static List<Integer> nativePrime2(int lowerLimit, int upperLimit) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = lowerLimit + 1; i < upperLimit; i++) {

			if (isPrime2(i)) {
				list.add(i);
			}
		}

		return list;
	}

	public static boolean isPrime2(int number) {

		if (number < 2) {
			return false;
		} else {
			for (int j = 2; j * j <= number; j++) {
				if (number % j == 0) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

		NativePrime2 np = new NativePrime2();

		List<Integer> list = np.nativePrime2(0, 47);
		System.out.println(list);
	}

	public List<Integer> nativePrime1(int lowerLimit, int upperLimit) {
		// TODO Auto-generated method stub
		return null;
	}

}
