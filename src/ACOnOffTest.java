import static org.junit.Assert.*;

import org.junit.Test;

public class ACOnOffTest {

	@Test
	public void ACOnOffTest() {
		AC my_ac = new AC();
		my_ac.onOff();
		boolean result = my_ac.power;
		assertEquals(true, result);
		
		my_ac.onOff();
		result = my_ac.power;
		assertEquals(false, result);
		
	}

}
