package ArrayProgram;

import java.util.Arrays;

public class CountRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {50,20,10,50,60,10,50,20,80,50};
       countDuplicate(arr);
	}
           static void countDuplicate(int arr[])
           {
        	   Arrays.sort(arr);
        	   System.out.println("Sorted Element" +Arrays.toString(arr));
        	    for(int i=0; i<arr.length-1; i++)
        	    {
        	    	int count=1;
        	    	  for(int j=i+1; j<arr.length;j++)
        	    	  {
        	    		  if(arr[i] == arr[j])
        	    			  count++;
        	    		  else
        	    			  break;
        	    	  }
        	    	  if(count>1)
        	    	  {
        	    		  System.out.println(arr[i]+" ->" + count);
        	    		 i+=(count-1);
        	    	  }
        	    }
           }    
	}

