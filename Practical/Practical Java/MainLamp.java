//Class and Object in Out-Side the class.
class Lamp{
	boolean isOn;
	void turnOn(){
		isOn=true;
		System.out.println("Light On?"+isOn);
	}
	void turnOff(){
		isOn=false;
		System.out.println("Light Off?"+isOn);
	}
}
class MainLamp{
	public static void main(String[] args) {
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		led.turnOn();
		halogen.turnOff();
	}
}