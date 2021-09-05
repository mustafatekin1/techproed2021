package day14_Method_Creation;

public class Animal {

String name;
String specy;
int age;

static int counter;

public Animal () {

	counter++;
}
public Animal (int age, String specy, String name) {
this.age = age;
this.specy = specy;
this.name = name;
counter++;
}

public Animal (int age, String  specy) {
	counter ++;
	this.age = age;
	this.specy = specy;
}





}

