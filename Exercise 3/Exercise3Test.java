import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise3Test {

	@Test
	void test() {
		var runner = new Runner();
		assertEquals(1, runner.Compare(2, 4));
		assertEquals(0, runner.Compare(2,2));
		assertEquals(-1, runner.Compare(3,1));
	}

}
