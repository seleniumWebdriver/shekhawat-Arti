package StringPrograms;

public class SwapString {
  
	public static void main(String[] args) {
		
		 String s1 = "jivraj";
		 String s2 = "singh";
		
		 System.out.println("Before Swapping :");
         
	        System.out.println("s1 : "+s1);
	        System.out.println("s2 : "+s2);
	        
	        //swapping start
	        s1 = s1+s2;
	        System.out.println("s1-------- : "+s1);
	        System.out.println("s2-------- : "+s2);
	        s2 = s1.substring(0, s1.length()-s2.length());
	        s1 = s1.substring(s2.length());
	        System.out.println("After Swapping :");
	         
	        System.out.println("s1 : "+s1);
	         
	        System.out.println("s2 : "+s2);
	}
}
