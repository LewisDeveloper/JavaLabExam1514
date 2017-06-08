
public class Lights implements HAS_Interface{
	public boolean power = false;
	public void onOff(){
		if(power!=true){
			power=true;
			System.out.println("Lights are on!");
		}else{
			power=false;
			System.out.println("Lights are off!");
		}
		
	}
}
