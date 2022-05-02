package ArrayProgram;

import java.util.Arrays;

public class AddnewElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[] = {10,20,30,50,60,};
		int element =40;
		int position=3;
		
		
		 System.out.println("Original Array"+ Arrays.toString(arr));
		 arr = addElement (arr,element, position);
		 System.out.println("New Array :" + Arrays.toString(arr));
		 
	}

	    public static int[] addElement(int arr[], int element, int position)
	    {
	    	int j=0;
	    	int temp[] = new int[arr.length+1];
	    	
	    	   for(int i=0; i<temp.length;i++)
	    	   {
	    		   if(i == position)
	    		   {
	    			   temp[i] = element;
	    		   }
	    		   else
	    		   {
	    			   temp[i] = arr[j++];
	    		   }
	    	   }
	    	   return temp;
	    }

}
