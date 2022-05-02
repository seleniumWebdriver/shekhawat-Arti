package StringPrograms;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Maya rakshashi Ayodhaya";
		String arr[] = str.split(" ");
		String RevString = " ";
		
		   for (int i=0; i<arr.length; i++)
		   {
			   String Word = arr[i];
			   String RevWord = " ";
			   
			     for (int j=Word.length()-1; j>=0; j--)
			     {
			    	 RevWord = RevWord + Word.charAt(j);
			    
			     }
				 RevString = RevString + RevWord;
		   }
		   System.out.println(RevString);
	}

}
