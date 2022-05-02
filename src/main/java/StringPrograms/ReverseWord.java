package StringPrograms;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(" Original String");
		
		String OrgString = scan.nextLine();
		scan.close();
		   
		   String arr[] = OrgString.split(" ");
		   String RevWord = "";
		   
		    for (int i=arr.length-1; i>=0; i--)
		    {
		    	 String word = arr[i];
		    	 
		    	 RevWord = RevWord +" " + word;
		    }
		System.out.println(RevWord);

	}

}
