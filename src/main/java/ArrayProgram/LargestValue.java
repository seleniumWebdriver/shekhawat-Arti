package ArrayProgram;

import java.util.Scanner;

public class LargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the value");
          
           int value = scan.nextInt();
          
           int arr[] = new int[value];
           
              System.out.println("Enter the number");
              for(int i=0; i<arr.length; i++)
              {
            	  arr[i]= scan.nextInt();
            	
              }
              int val1= arr[0];
              for(int i=1; i<arr.length; i++)
              {
            	  if(arr[i]>val1)
            	  {
            		  val1 = arr[i];
            	  }
              }
              System.out.println(val1);
              scan.close();
	}

}
