package com.JUnit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.prime.NativePrime1;
import com.prime.NativePrime2;
import com.prime.SieveBooleanPrimeMethod;
import com.prime.SieveOfEratosthenes;

public class PrimeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	// PrimeGenerator Strategy --> NativePrime1
	// ---------------------------------------------------------------------------------------------------------

	@Test
	public void testForNativePrime1() {

		List<Integer> list1 = Arrays.asList(2, 3, 5, 7);
		List<Integer> list2 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43);

		System.out.println("test case find Primes");
		assertEquals(list1, NativePrime1.nativePrime1(0, 10));
		assertEquals(list2, NativePrime1.nativePrime1(0, 47));
	}

	// PrimeGenerator Strategy --> NativePrime2
	// ---------------------------------------------------------------------------------------------------------

	@Test
	public void testForNativePrime2() {

		List<Integer> list3 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
		List<Integer> list4 = Arrays.asList(11, 13, 17, 19, 23, 29, 31, 37, 41, 43);

		System.out.println("test case find Primes");
		assertEquals(list3, NativePrime2.nativePrime2(-100, 20));
		assertEquals(list4, NativePrime2.nativePrime2(10, 47));
	}

	// PrimeGenerator Strategy --> SieveBooleanPrimeMethod
	// ---------------------------------------------------------------------------------------------------------

	@Test
	public void testForSieveBooleanPrimeMethod() {

		List<Integer> list5 = Arrays.asList(2);
		List<Integer> list6 = Arrays.asList();
		List<Integer> list7 = Arrays.asList(2, 3);
		List<Integer> list8 = Arrays.asList(101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
				179, 181, 191, 193, 197, 199);

		System.out.println("test case find Primes");
		assertEquals(list5, SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(0, 3));
		assertEquals(list6, SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(0, 0));
		assertEquals(list7, SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(-10, 5));
		assertEquals(list8, SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(100, 200));
	}

	// PrimeGenerator Strategy --> SieveOfEratosthenes
	// ---------------------------------------------------------------------------------------------------------

	@Test
	public void testForSieveOfEratosthenes() {

		List<Integer> list9 = Arrays.asList();
		List<Integer> list10 = Arrays.asList(17, 19, 23, 29, 31, 37, 41, 43);
		List<Integer> list11 = Arrays.asList(1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049);
		List<Integer> list12 = Arrays.asList();
		List<Integer> list13 = Arrays.asList(2);

		System.out.println("test case find Primes");
		assertEquals(list9, SieveOfEratosthenes.sieveOfEratosthenes(1000, 200));
		assertEquals(list10, SieveOfEratosthenes.sieveOfEratosthenes(13, 47));
		assertEquals(list11, SieveOfEratosthenes.sieveOfEratosthenes(1000, 1050));
		assertEquals(list12, SieveOfEratosthenes.sieveOfEratosthenes(0, 0));
		assertEquals(list13, SieveOfEratosthenes.sieveOfEratosthenes(0, 3));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

}