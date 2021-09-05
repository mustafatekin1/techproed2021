package day30exceptionsinterfacesiteratorscollections;

public class RunnerDay30 {

	public static void main(String[] args) {
		System.out.println(I01.x);
		System.out.println(I01.s);
		
		I01.concrete2(10, 20);
		
		HondaCivic honda1 = new HondaCivic();
		honda1.accelerate();
		honda1.speedLimit();
		honda1.climate();
		// By using object, we can not call methods. 
		// For ex I dont see honda1.volume(); We have to use the specific interface name.
		
		
		//System.out.println(honda1.price); gives error because there are 
		// "price"variables in three child interfaces.
		// No problem with different variables as follows:
		System.out.println(honda1.system+honda1.name+honda1.brand);
		
		// we can call those variables via interfaces:
		System.out.println(Engine.price+" "+AirCondition.price+" "+Music.price);
		// It is better to call variables via Interfaces!
		
		
	
		Music.volume();
		

	}

}
