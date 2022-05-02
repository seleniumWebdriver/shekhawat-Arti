package ArrayProgram;

import java.util.Arrays;

public class RemElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[] = {20,40,50,80,60,30,10};  // Remove particular element
		int del_ele = 20;
		Arrays.sort(arr);
    	System.out.println(Arrays.toString(arr));
		  
    	int count = 0;
		    for(int i=0; i<arr.length; i++)
		    {
		    	
		    	if(del_ele == arr[i])
		    	{
		    		for(int j=i; j<arr.length-1; j++)
		    		{
		    			arr[j] = arr[j+1];
		    		}
		    		count = count+1;
		    		break;
		    	}
		    }
		      
		      if(count == 0)
		      {
		    	  System.out.println("Element not found");
		    	  
		      }
		      else
		      { 
		    	  System.out.println("Element deleted Successfully");
		    	  for(int i=0; i<arr.length-1; i++)
				    {
				    	System.out.print(+arr[i] + " , ");
				    }
		      }
		  
	}

}
