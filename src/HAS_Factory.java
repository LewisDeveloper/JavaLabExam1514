
public class HAS_Factory {
	   public HAS_Interface getAppliance(String Appliance){
	      if(Appliance == null){
	         return null;
	      }		
	      if(Appliance.equalsIgnoreCase("AC")){
	         return new AC();
	         
	      } else if(Appliance.equalsIgnoreCase("Lights")){
	         return new Lights();
	         
	      } else if(Appliance.equalsIgnoreCase("TV")){
	         return new TV();
	         
	      }else if(Appliance.equalsIgnoreCase("Washing Machine")){
		         return new WashingMachine();
		  }
	      
	      return null;
	   }
}
