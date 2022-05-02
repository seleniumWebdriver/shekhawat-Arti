package StringPrograms;

public class COuntSingleCharInString {

	public static void main(String[] args) {
		String str = "Java is java again java again";
		
		int length1 = str.length();
		int length2 = str.replace("a", "").length();
		int a = (length1-length2)/1;
		System.out.println("a is coming "+a+" times");
		
		 //important question
		String str1 = "ahfnflmnhdjswlmnhdhwlmniirdalmn";
		int length3 = str1.length();
		int length4 = str1.replace("lmn", "").length();
		int b = (length3-length4)/3;
		System.out.println(length3);
		System.out.println(length4);
		System.out.println("lmn is coming: "+b);
		
	}

}
