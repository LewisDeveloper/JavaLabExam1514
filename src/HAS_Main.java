
public class HAS_Main {

	public static void main(String[] args) {
		HAS_Factory my_HAS_Factory = new HAS_Factory();

	      HAS_Interface Appliance_1 = my_HAS_Factory.getAppliance("AC");

	      Appliance_1.on();

	      HAS_Interface Appliance_2 = my_HAS_Factory.getAppliance("Lights");

	      Appliance_2.on();

	      HAS_Interface Appliance_3 = my_HAS_Factory.getAppliance("TV");

	      Appliance_3.on();
	}

}
