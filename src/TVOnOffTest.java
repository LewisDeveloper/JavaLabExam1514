import static org.junit.Assert.*;

import org.junit.Test;

public class TVOnOffTest {

	@Test
	public void TVOnOffTest() {
		TV my_tv = new TV();
		my_tv.onOff();
		boolean result = my_tv.power;
		assertEquals(true, result);
		
		my_tv.onOff();
		result = my_tv.power;
		assertEquals(false, result);
		
	}
}
