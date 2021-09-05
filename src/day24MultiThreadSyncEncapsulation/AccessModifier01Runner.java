package day24MultiThreadSyncEncapsulation;

public class AccessModifier01Runner extends  AccessModifier01{

	public static void main(String[] args) {
		
	
	AccessModifier01 obj1 = new AccessModifier01();
	
	System.out.println(obj1.address); // we can see it because address is protected
									// and this class is "child class"
						// we make it child class by the keyword'exy=tends'


}
}