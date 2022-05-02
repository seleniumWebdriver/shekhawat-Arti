package ArrayProgram;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
   
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		 int value = scan.nextInt();
	   
	   
	     int arr[]= new int [value];
	   
	     System.out.println("Enter the numbers" );
	     for(int i=0; i<arr.length; i++)
	     {
	    	 arr[i]= scan.nextInt();
	     }
	     for (int i=0; i<arr.length; i++)
	     {
	    	  for (int j = i+1; j<arr.length; j++)
	    	  {
	    		  if(arr[i]>arr[j])
	    		  {
	    			  temp= arr[i];
	    			  arr[i]=arr[j];
	    			  arr[j]=temp;

	    			  
	    		  }
	    	  }
	    	  System.out.print(arr[i] +",");
	     }
	     scan.close();
	}
}
