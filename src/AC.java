
public class AC implements HAS_Interface{
	public boolean power = false;
	public void onOff(){
		if(power!=true){
			power=true;
			System.out.println("AC is on!");
		}else{
			power=false;
			System.out.println("AC is off!");
		}
		
	}
}
