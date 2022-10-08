package com.prime;

import java.util.ArrayList;
import java.util.List;

public class NativePrime2 {

	public static String nativePrime2(int lowerLimit, int upperLimit) {

		List<String> list = new ArrayList<String>();

		for (int i = lowerLimit + 1; i < upperLimit; i++) {

			if (isPrime2(i)) {
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

		String str = np.nativePrime2(0, 47);
		System.out.println(str);
	}

}
