import static org.junit.Assert.*;

import org.junit.Test;

public class TvFunctionalityTest {
	TV my_tv = new TV();

	@Test
	public void VolumeUpTest() {
		int result=my_tv.VolumeUp();
		assertEquals(26, result);
	}
	
	public void VolumeDownTest() {
		int result=my_tv.VolumeDown();
		assertEquals(25, result);
	}
	
	public void ChannelUpTest() {
		int result=my_tv.ChannelUp();
		assertEquals(2, result);
	}
	
	public void ChannelDownTest() {
		int result=my_tv.ChannelDown();
		assertEquals(1, result);
	}

}
