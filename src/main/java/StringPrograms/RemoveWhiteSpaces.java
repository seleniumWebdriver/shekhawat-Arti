package StringPrograms;

public class RemoveWhiteSpaces {
 public static void main(String[] args) {
	 String str = "Enter input string to be cleaned from white spaces";
	    
	  String newStr = str.replaceAll(" ", "");
	  System.out.println(newStr);
	 
}
}
