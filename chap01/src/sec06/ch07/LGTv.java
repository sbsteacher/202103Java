package sec06.ch07;

public class LGTv implements RemoteControl {
	private int volume;
	
	public void welcome() {
		System.out.println("LG Welcome!!");
	}	
	
	public void volumeUp() {
		volume++;
	}
	
	public void volumeDown() {		
		volume--;
	}
	
	public void chkVolume() {
		System.out.println("volume : " + volume);
	}
}
