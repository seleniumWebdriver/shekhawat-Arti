package StringPrograms;

import java.util.Scanner;

public class TotalCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner (System.in);
         System.out.println("Enter a string");
         String str = scan.nextLine();
         int count =0 , i=0;
           scan.close(); 
               while(i < str.length())
               {
            	   if(str.charAt(i) != ' ')
            	   {
            	   count++;
                   }
                 i++;
	}
	   System.out.println("Total character" + count);
	}
}
