import static org.junit.Assert.*;

import org.junit.Test;

public class ShrinkTest {

	@Test
	public void test() {
		BootCampTasks obj = new BootCampTasks();
		int[] nums = {1, 2, 3, 4};
		int[] arr = obj.shrink(nums);
		assertEquals(2, arr.length);
	}

}
