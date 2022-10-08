package com.prime;

import java.util.ArrayList;
import java.util.List;

public class NativePrime1 {

	public static String nativePrime1(int lowerLimit, int upperLimit) {

		List<String> list = new ArrayList<String>();

		for (int i = lowerLimit + 1; i < upperLimit; i++) {

			if (isPrime1(i)) {
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
		
		String str = np.nativePrime1(0, 20);
		System.out.println(str);
	}

}
