package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the value for a");
           int a1 = scan.nextInt();
           System.out.println("Enter the value for b");
           int b1 = scan.nextInt();
           
           int arr1[] = new int[a1];
           int arr2[] = new int[b1];
           
           System.out.println("Enter the value for a");
                for(int i=0; i<arr1.length; i++)
                {
                	arr1[i]= scan.nextInt();
                	
                }
                System.out.println("Enter the value for b");
                for(int j=0; j<arr2.length; j++)
                {
                	arr2[j]= scan.nextInt(); 
                }
                
                int a = arr1.length;
                int b = arr2.length;
                int c = a+b;
                int arr3[] = new int [c];
                System.arraycopy(arr1, 0, arr3, 0, a);
                System.arraycopy(arr2, 0, arr3, a, b);
                System.out.println(Arrays.toString(arr3));
                scan.close();
	}

}
