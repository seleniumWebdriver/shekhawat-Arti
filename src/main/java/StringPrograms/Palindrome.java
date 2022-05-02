package StringPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String RevString ="";
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        scan.close();
        
            for(int i=str.length()-1; i>=0; i--)
            {
            	RevString = RevString + str.charAt(i);
            }
            System.out.println(RevString);
            	 if(str.equals(RevString))
            	 {
            		 System.out.println("Palindrome String");
            	 }
            	 else
            	 {
            		 System.out.println("Not Palindrome");
            	 }
             
            
        }
}
