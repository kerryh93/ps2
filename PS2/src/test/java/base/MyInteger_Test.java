package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	public static MyInteger number;
	public static MyInteger num2;
	public static MyInteger num3;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		number = new MyInteger (5);
		num2 = new MyInteger (10);
		num3= new MyInteger (5);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1()
	{
		assertFalse (number.isEven());
		assertTrue (num2.isEven());
	}
	
	@Test
	public void test2 ()
	{
		assertTrue (number.isOdd());
		assertFalse (num2.isOdd());
	}
	
	@Test
	public void test3 ()
	{
		assertTrue (number.isPrime());
		assertFalse (num2.isPrime());
		
	}
	
	@Test
	public void test4()
	{
		assertTrue (MyInteger.isEven(6));
		assertFalse (MyInteger.isEven(7));
	}
	
	@Test 
	public void test5()
	{
		assertTrue (MyInteger.isOdd(7));
		assertFalse (MyInteger.isOdd(8));
	}
	
	@Test
	public void test6()
	{
		assertTrue (MyInteger.isPrime(5));
		assertFalse (MyInteger.isPrime(8));
	}
	
	@Test
	public void test7()
	{
		assertTrue (MyInteger.isPrime(number));
		assertFalse (MyInteger.isPrime(num2));
		
	}
	
	@Test
	public void test9()
	{
		assertTrue (MyInteger.isEven(num2));
		assertFalse (MyInteger.isEven(number));
	}
	
	@Test
	public void test10()
	{
		assertTrue (MyInteger.isOdd(number));
		assertFalse (MyInteger.isOdd(num2));
	}
	
	@Test
	public void test11()
	{
		assertTrue (number.isEquals(5));
		assertFalse(number.isEquals(2));
	}
	@Test
	public void test12()
	{
		assertTrue(number.isEquals( num3));
		assertFalse(num2.isEquals(num3));
	}
}
