import static org.junit.Assert.*;

import org.junit.Test;

public class SmallestTest {

	@Test
	public void test() {
		BootCampTasks obj = new BootCampTasks();
		int[] nums = {1, 2, 4, 6, 7, 9, 10, 15};
		int returned = obj.smallest(nums);
		assertEquals(1, returned);
		//assertEquals(6, returned);
	}

}
