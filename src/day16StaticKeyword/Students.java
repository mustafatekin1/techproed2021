package day16StaticKeyword;

public class Students {
String name;
static String id;
int grade;
int regYear;

static int counter = 1000;

public void setId () {
	counter++;
	id = regYear +""+ grade+ counter;
	
}

public Students(String name, int grade, int regYear) {
	
	this.name = name;
	this.grade = grade;
	this.regYear = regYear;
	setId();
}
	
	
	
	
}
