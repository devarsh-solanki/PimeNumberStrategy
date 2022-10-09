package com.prime;

import java.util.ArrayList;
import java.util.List;

public class SieveBooleanPrimeMethod {
	
	public static List<Integer> sieveBooleanPrimeMethod(int lowerLimit, int upperLimit){
		
		List<Integer> list = new ArrayList<Integer>();
		
		List<Integer> list1 = isPrime4(upperLimit);

		for (int i = 0; i < list1.size(); i++) {
			
			int x = list1.get(i);
			if(x > lowerLimit) {
				list.add(x);
			}
		}
		
		return list;	
	}

	public static List<Integer> isPrime4(int n) {

		boolean[] isPrime = new boolean[n + 1];
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 2; i < n; i++) {

			if (!isPrime[i]) {
				
				list.add(i);
				for (int j = i; j <= n; j = j + i) {
					isPrime[j] = true;
				}
			}

		}

		return list;
	}

	public static void main(String[] args) {
		SieveBooleanPrimeMethod s1 = new SieveBooleanPrimeMethod();
		
		List<Integer> list = s1.sieveBooleanPrimeMethod(100,200);

		System.out.println(list);
	}
}