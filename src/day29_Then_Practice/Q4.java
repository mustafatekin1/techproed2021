package day29_Then_Practice;

public class Q4 {

	public static void main(String[] args) {
		// Create a method to print lowercase of the alphabet

//	    static ArrayList<String> alphabet(){
//	        ArrayList<String> al = new ArrayList<>();
//	        for(char i = 97; i <= 122; i++){
//	            String each = i + "";
//	            al.add(each);
//	        }
//	        return al;
//	    }
		
		
		
		
//1.Write a method that can remove duplicated values from an Integer ArrayList.
//EX : ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5) ---> [1,2,3,4,5]		

//	    static ArrayList<Integer> remover(ArrayList<Integer> al){
//	        for(int i = 0; i < list.size(); i++){
//	            int count = 0;
//	            for(int j = 0; j < list.size(); j++){
//	                if(list.get(i).equals(list.get(j)))
//	                    count++;
//	            }
//	            if(count > 1){
//	                list.remove(list.get(i));
//	                i--;
//	            }
//	        }
//	        return list;
//	        return new ArrayList<>(new HashSet<>(al));
		


//Create a method that generates names, 
//Method accepts an int that will set # of names to be stored in the arraylist. 
//It returns an Arraylist
		
//  static ArrayList<String> createNames(int numOfNames){
//​
//      ArrayList<String> al = new ArrayList<>();
//      List<String> list = alphabet();
//​
//      for(int j = 1; j <= numOfNames; j++) {
//          String name = "";
//          int length = new Random().nextInt(25);
//          for (int i = 0; i <= length; i++) {
//              int num = new Random().nextInt(26);
//              name += list.get(num);
//          }
//          al.add(name);
//      }
//      return al;
//  }

  //Create a method that accepts an arrayList of Strings and return the longest String

//  static String findLongest(ArrayList<String> al){
//      String result = "";
//​
//      for(String each : al){
//          if(each.length() >= result.length())
//              result = each;
//      }
//      System.out.println(al);
//      return result;
//  }
//​
//​
//  public static void main(String[] args) {
//      System.out.println(findLongest(createNames(10)));
//  }
//Collapse
}}