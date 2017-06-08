import static org.junit.Assert.*;

import org.junit.Test;

public class WMOnOffTest {

	@Test
	public void WMOnOffTest() {
		WashingMachine my_wm = new WashingMachine();
		my_wm.onOff();
		boolean result = my_wm.power;
		assertEquals(true, result);
		
		my_wm.onOff();
		result = my_wm.power;
		assertEquals(false, result);
		
	}
}
