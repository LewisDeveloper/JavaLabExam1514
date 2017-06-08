
public class HAS_Main {

	public static void main(String[] args) {
		HAS_Factory my_HAS_Factory = new HAS_Factory();

	      HAS_Interface Appliance_1 = my_HAS_Factory.getAppliance("AC");

	      Appliance_1.onOff();

	      HAS_Interface Appliance_2 = my_HAS_Factory.getAppliance("Lights");

	      Appliance_2.onOff();

	      HAS_Interface Appliance_3 = my_HAS_Factory.getAppliance("TV");

	      Appliance_3.onOff();
	      
	      HAS_Interface Appliance_4 = my_HAS_Factory.getAppliance("Washing Machine");

	      Appliance_4.onOff();
	      
	      TV my_TV = new TV();
	      my_TV.VolumeUp();
	      my_TV.VolumeDown();
	}

}
