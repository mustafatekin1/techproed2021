package day29_Then_Practice;

public class Q2_TeachersSolution {

	static int reverseNumber(int num){
        String result = "";
        String str = String.valueOf(num);
        if(num < 0){
            str = str.substring(1);
            result += "-";
        }
        result += new StringBuilder(str).reverse().toString();
        return Integer.parseInt(result);
//        String reversed = "";
//        if(num == 0)
//            reversed = "0";
//        if(num < 0) {
//            num *= -1;
//            reversed += "-";
//        }
//        while(num > 0){
//            reversed += num % 10;
//            num /= 10;
//        }
//        return Integer.parseInt(reversed);
    }
	
	
	
	public static void main(String[] args) {
		
		reverseNumber(123);
		
	}

}
