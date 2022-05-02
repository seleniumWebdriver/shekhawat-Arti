package StringPrograms;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "heyhelloh";
		char ch = 'h';
		int count = 0;
		
		  for(int i=0; i< str.length(); i++)
		  {
			  if(str.charAt(i) == ch)
			  {
				  count++;
			  }
		  }
           System.out.println("The Character" + " " + ch +" "+ "found" + count + " " + "times in a string" + "  "+ str+ "'.");
	}

}
