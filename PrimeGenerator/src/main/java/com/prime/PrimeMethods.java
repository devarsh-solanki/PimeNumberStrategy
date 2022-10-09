package com.prime;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Scanner;

public class PrimeMethods {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Timestamp time= Timestamp.from(Instant.now());
		boolean flag = true;
		
		while(flag) {
			
			try {
			
				System.out.println("|| Welcome to PrimeGenerator (Console based application) ||\n");
				
				System.out.println("Enter LowerBound : ");
				int n1 = input.nextInt();
				
				System.out.println("Enter UpperBound : ");
				int n2 = input.nextInt();
				
				System.out.println("\n-----------------------------------------------------------------------------------------\n");
				
				System.out.println("|| Choose prime method || \n");
				System.out.println("PRESS 1 : NativePrime1 ");
				System.out.println("PRESS 2 : NativePrime2 ");
				System.out.println("PRESS 3 : SieveOfEratosthenes ");
				System.out.println("PRESS 4 : SieveBooleanPrimeMethod ");
				System.out.println("PRESS 5 : Exit");
				System.out.println("\n-----------------------------------------------------------------------------------------\n");
					
				int choice = input.nextInt();
				System.out.println();
				
				switch(choice) {
				
					case 1:
						long start1 = System.currentTimeMillis();
						List<Integer> list1 = NativePrime1.nativePrime1(n1,n2);
						long end1 = System.currentTimeMillis();
						
						System.out.println("PrimeGenerator Method : NativePrime1");
						System.out.println("LowerBound : "+n1);
						System.out.println("UpperBound : "+n2);
						System.out.println("Prime number list : "+list1);
						System.out.println("Elapsed Time in milli seconds: "+(end1 - start1)+" ms");
						System.out.println("Date & Time : "+time);
						System.out.println("\n-----------------------------------------------------------------------------------------\n");
						break;
					case 2:
						long start2 = System.currentTimeMillis();
						List<Integer> list2 = NativePrime2.nativePrime2(n1,n2);
						long end2 = System.currentTimeMillis();
						
						System.out.println("PrimeGenerator Method : NativePrime2");
						System.out.println("LowerBound : "+n1);
						System.out.println("UpperBound : "+n2);
						System.out.println("Prime number list : "+list2);
						System.out.println("Elapsed Time in milli seconds: "+(end2 - start2)+" ms");
						System.out.println("Date & Time : "+time);
						System.out.println("\n-----------------------------------------------------------------------------------------\n");
						break;
					case 3:
						long start3 = System.currentTimeMillis();
						List<Integer> list3 = SieveOfEratosthenes.sieveOfEratosthenes(n1,n2);
						long end3 = System.currentTimeMillis();
						
						System.out.println("PrimeGenerator Method : SieveOfEratosthenes");
						System.out.println("LowerBound : "+n1);
						System.out.println("UpperBound : "+n2);
						System.out.println("Prime number list : "+list3);
						System.out.println("Elapsed Time in milli seconds: "+(end3 - start3)+" ms");
						System.out.println("Date & Time : "+time);
						System.out.println("\n-----------------------------------------------------------------------------------------\n");
						break;
					case 4:
						long start4 = System.currentTimeMillis();
						List<Integer> list4 = SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(n1,n2);
						long end4 = System.currentTimeMillis();
						
						System.out.println("PrimeGenerator Method : SieveBooleanPrimeMethod");
						System.out.println("LowerBound : "+n1);
						System.out.println("UpperBound : "+n2);
						System.out.println("Prime number list : "+list4);
						System.out.println("Elapsed Time in milli seconds: "+(end4 - start4)+" ms");
						System.out.println("Date & Time : "+time);
						System.out.println("\n-----------------------------------------------------------------------------------------\n");
						break;
					case 5:
						flag = false;
						System.out.println("-----------------------------------------------------------------------------------------\n");
						break;
					default:
						System.out.println("Invalid input !!!");
						break;
				}
				
			} catch (Exception e) {
				flag = false;
				System.out.println("Exception : "+e.getMessage());
			}
			
		}
		
		System.out.println("Thank You for use this application");
		System.out.println("See you soon !!!");

	}

}
