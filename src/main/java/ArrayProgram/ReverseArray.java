package ArrayProgram;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr3[] = {2,3,4,5,6,7,8,9};
		
		System.out.println("Original Array");
		for(int i=0; i<arr3.length; i++)
		{
		System.out.print(arr3[i] +",");
		}
		
		System.out.print("\n Reverse Array");
		for(int i=arr3.length-1; i>=0; i--) 
		{
			System.out.print(arr3[i] + ",");
		}
		

	}

}
