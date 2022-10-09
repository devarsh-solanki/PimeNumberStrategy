package com.prime;

import java.util.ArrayList;
import java.util.List;

public class NativePrime1 {

	public static List<Integer> nativePrime1(int lowerLimit, int upperLimit) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = lowerLimit + 1; i < upperLimit; i++) {

			if (isPrime1(i)) {
				list.add(i);
			}

		}

		return list;
	}

	public static boolean isPrime1(int number) {
		int val = number / 2;

		if (number < 2) {
			return false;
		} else {
			for (int i = 2; i <= val; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
 
		NativePrime1 np = new NativePrime1();
		
		List<Integer> list = np.nativePrime1(0, 50);
		System.out.println(list);
	}

}
