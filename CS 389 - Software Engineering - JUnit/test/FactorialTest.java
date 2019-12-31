import junit.framework.TestCase;

public class FactorialTest extends TestCase {

	public FactorialTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testFactorial0() {
		// fail("Not yet implemented");
		try {
			assertEquals(1, Factorial.factorial(0));
		} catch (Exception e) {
			e.printStackTrace();
			fail("failed");
		}
	}

	public void testFactorial4() {
		// fail("Not yet implemented");
		// try{
		assertEquals(24, Factorial.factorial(4));
		// } catch (Exception e){
		// e.printStackTrace();
		// fail("failed");
		// }
	}

	public void testFactorial5() {
		// fail("Not yet implemented");
		try {
			assertEquals(720, Factorial.factorial(6));
		} catch (Exception e) {
			fail("fail");
		}
	}

	public void testFactorialMinus24() {
		try {
			Factorial.factorial(-24);
			fail("XXXXX");
		} catch (Exception e) {
			if (e instanceof IllegalArgumentException) {
				assertTrue(true);
			} else {
				fail("XXXX");
			}
		}
	}
	
	
	public void testFactorial14() {
		try {
			Factorial.factorial(14);
			fail("XXXXX");
		} catch (Exception e) {
			if (e instanceof IllegalArgumentException) {
				assertTrue(true);
			} else {
				fail("XXXX");
			}
		}
	}

}