package pkgMain;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgPS2.MyInteger;

public class myIntegerTest {

	@Test
	public void test() {
		MyInteger myInt = new MyInteger(2);
		
		assertTrue(myInt.isEven());
		assertFalse(myInt.isOdd());
		assertTrue(myInt.isPrime());
		
		
		assertFalse(myInt.isEven(3));
		assertTrue(myInt.isOdd(3));
		assertTrue(myInt.isPrime(3));
		
		assertTrue(myInt.isEven(myInt));
		assertFalse(myInt.isOdd(myInt));
		assertTrue(myInt.isPrime(myInt));
		
		assertFalse(myInt.isEquals(3));
		assertTrue(myInt.isEquals(myInt));
	}

}
