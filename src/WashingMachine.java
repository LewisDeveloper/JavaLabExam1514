
public class WashingMachine implements HAS_Interface{
	boolean power = false;
	public void onOff(){
		if(power!=true){
			power=true;
			System.out.println("Washing Maching is on!");
		}else{
			power=false;
			System.out.println("Washing Maching is off!");
		}
		
	}
}
