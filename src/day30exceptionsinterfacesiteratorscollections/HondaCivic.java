package day30exceptionsinterfacesiteratorscollections;

public class HondaCivic implements Engine, AirCondition, Music {

	@Override
	public void gasUsage() {
		System.out.println("Gas usages... ");
		
	}

	@Override
	public void speedLimit() {
		System.out.println("Speed limit for Honda");
		
	}

	@Override
	public void sound() {
		System.out.println("Sound.. ");
		
	}

	@Override
	public void tune() {
		
		System.out.println("Tune.. ");
	}

	@Override
	public void climate() {
	
		System.out.println("Climate... ");
	}

public static void main(String[] args) {
	Engine h1 = new HondaCivic();
	Music h2 = new HondaCivic();
	AirCondition h3 = new HondaCivic();
	
}

}
