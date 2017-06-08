import static org.junit.Assert.*;

import org.junit.Test;

public class LightOnOffTest {

	@Test
	public void LightOnOffTest() {
		Lights my_lights = new Lights();
		my_lights.onOff();
		boolean result = my_lights.power;
		assertEquals(true, result);
		
		my_lights.onOff();
		result = my_lights.power;
		assertEquals(false, result);
		
	}

}
