package day22dateAccessModifiers;

import day20ArrayList.AccessModifiers03_inOtherPackage;

public class AccessModifiers02_Exp {

	public static void main(String[] args) {
		/* To access to another class, there are 2 ways
		 1.	Call by class 
		 	- the variable must be static!
		 	- We can also call from other packages if they have "public" and "static".
		 2. by objects.
		 	- We do not have to use static.
		 	- We can call from other packages if they are "public"
		 		- if there is no public, we can not call from other packages.
		 Notes:
		 - If a class member is "private", we can not access it from different class!
		 - If a class member is default(default: without access modifier); 
		 we can not access it from different package. 	
		 
		 	** protected: we'll learn later. 
		 */

//System.out.println(AccessModifiers01.name);// the variable in the 01 class must be "static"
// So we can only call "lastName"
System.out.println(AccessModifiers01.lastName);		

AccessModifiers01 obj1 = new AccessModifiers01();
System.out.println(obj1.name);
//we can not reach the address "obj1.address". Because it is "private"
System.out.println(obj1.schoolName);


AccessModifiers03_inOtherPackage obj2 = new AccessModifiers03_inOtherPackage();
//AccessModifiers03_inOtherPackage. or obj2. we can not reach in neither of them. 
//we can not see the created variable "schoolName2" "without public" access modifier in another package.
System.out.println(obj2.schoolName3);// As here we can reach schoolName3 "with public" from another package 
	System.out.println(AccessModifiers03_inOtherPackage.deneme);
	
	}	

}
