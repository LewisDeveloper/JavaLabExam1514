
public class TV implements HAS_Interface{
	
	public boolean power = false;
	public void onOff(){
		if(power!=true){
			power=true;
			System.out.println("TV is on!");
		}else{
			power=false;
			System.out.println("TV is off!");
		}
		
	}
	
	public int volume = 25;
	public int channel = 1;
	
	public int VolumeUp(){
		if(volume>=100){
			System.out.println("Highest Volume reached, cannot increse further");
		}else{
			volume++;
			System.out.println("VOLUME: "+volume);
		}
		return volume;
	}
	
	public int VolumeDown(){
		if(volume<=0){
			System.out.println("Lowest Volume reached, cannot decrease further");
		}else{
			volume--;
			System.out.println("VOLUME: "+volume);
		}
		return volume;
	}
	
	public int ChannelUp(){
		if(channel==50){
			channel = 1;
		}else{
			channel++;
			System.out.println("CHANNEL: "+channel);
		}
		return channel;
	}
	
	public int ChannelDown(){
		if(channel==1){
			channel = 50;
		}else{
			channel--;
			System.out.println("CHANNEL: "+channel);
		}
		return channel;
	}
}
