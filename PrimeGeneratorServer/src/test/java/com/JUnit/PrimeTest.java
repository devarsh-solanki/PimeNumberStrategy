package com.JUnit;

import static org.junit.Assert.assertEquals;

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

		String s1 = "2, 3, 5, 7, ";
		String s2 = "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, ";

		System.out.println("test case find Primes");
		assertEquals(s1, NativePrime1.nativePrime1(0, 10));
		assertEquals(s2, NativePrime1.nativePrime1(0, 47));
	}

	// PrimeGenerator Strategy --> NativePrime2
	// ---------------------------------------------------------------------------------------------------------

	@Test
	public void testForNativePrime2() {

		String s3 = "2, 3, 5, 7, 11, 13, 17, 19, ";
		String s4 = "11, 13, 17, 19, 23, 29, 31, 37, 41, 43, ";

		System.out.println("test case find Primes");
		assertEquals(s3, NativePrime2.nativePrime2(-100, 20));
		assertEquals(s4, NativePrime2.nativePrime2(10, 47));
	}

	// PrimeGenerator Strategy --> SieveBooleanPrimeMethod
	// ---------------------------------------------------------------------------------------------------------

	@Test
	public void testForSieveBooleanPrimeMethod() {

		String s5 = "2, ";
		String s6 = "";
		String s7 = "2, 3, ";
		String s8 = "101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, ";

		System.out.println("test case find Primes");
		assertEquals(s5, SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(0, 3));
		assertEquals(s6, SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(0, 0));
		assertEquals(s7, SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(-10, 5));
		assertEquals(s8, SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(100, 200));
	}

	// PrimeGenerator Strategy --> SieveOfEratosthenes
	// ---------------------------------------------------------------------------------------------------------

	@Test
	public void testForSieveOfEratosthenes() {

		String s9 = "";
		String s10 = "17, 19, 23, 29, 31, 37, 41, 43, ";
		String s11 = "1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049, ";
		String s12 = "";
		String s13 = "2, ";

		System.out.println("test case find Primes");
		assertEquals(s9, SieveOfEratosthenes.sieveOfEratosthenes(1000, 200));
		assertEquals(s10, SieveOfEratosthenes.sieveOfEratosthenes(13, 47));
		assertEquals(s11, SieveOfEratosthenes.sieveOfEratosthenes(1000, 1050));
		assertEquals(s12, SieveOfEratosthenes.sieveOfEratosthenes(0, 0));
		assertEquals(s13, SieveOfEratosthenes.sieveOfEratosthenes(0, 3));
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