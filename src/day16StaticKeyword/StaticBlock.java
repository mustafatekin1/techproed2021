package day16StaticKeyword;

public class StaticBlock {
	
	
	static {
		int year = 2020;
	}
	static {
		System.out.println("static A");
	}
	
	static {
		System.out.println("static B");
	}
	public static void main(String[] args) {
		
		method1();
		System.out.println("main");
		method2();
		StaticBlock o1 = new StaticBlock();
	}

	public static void method1() {
		System.out.println("method1");

	}
	public static void method2() {
		System.out.println("method2");
	}

	StaticBlock () {
		System.out.println("Constructor");
	}


}


