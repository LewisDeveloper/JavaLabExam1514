import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ACOnOffTest.class, LightOnOffTest.class, TvFunctionalityTest.class, TVOnOffTest.class,
		WMOnOffTest.class })
public class AllTests {

}
