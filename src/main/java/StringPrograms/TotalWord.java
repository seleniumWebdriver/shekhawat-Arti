package StringPrograms;

import java.util.Scanner;

public class TotalWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner (System.in);
         System.out.println("Enter a string");
         String str = scan.nextLine();
         String arr[] = str.split(" ");
         int count =0 , i=0;
           scan.close(); 
               while(i < arr.length)
               {
            	   if(arr.length != ' ')
            	   {
            	   count++;
                   }
                 i++;
	}
	   System.out.println("Total character" + count);
	}
}