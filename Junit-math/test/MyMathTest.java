import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath=new MyMath();
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
//	
	@After
	public void after() {
		System.out.println("After");
	}
//	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void SumWith1Number() {
//		MyMath myMath = new MyMath();
//		int result = myMath.sum(new int[] {3});
//		assertEquals(3,result);
		System.out.println("Text 1");
		assertEquals(3,myMath.sum(new int[] {3}));
	}
	@Test
	public void sumWith3Numbers() {
//		MyMath myMath = new MyMath();
//		int result = myMath.sum(new int[] {1,2,3});
//		assertEquals(6,result);
		System.out.println("Text 2");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
//		fail("Not yet implemented");
	}

}
