import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImp someBusinessImp = new SomeBusinessImp(new DataServiceStub());
		int sum = someBusinessImp.findTheGreatestFromAllData();
		assertEquals(24,sum);
		System.out.println("Hola");
	}

}