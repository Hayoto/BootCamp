import static org.junit.Assert.*;

import org.junit.Test;

public class GrowTest {

	@Test
	public void test() {
		BootCampTasks obj = new BootCampTasks();
		double[] nums = {1.0, 2.0, 3.0};
		double[] arr = obj.grow(nums);
		assertEquals(6, arr.length);
		
	}

}
