package StringPrograms;

import java.util.ArrayList;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "My name isy aartiy";
          
         printDuplicates(str);
	}
	  public static void printDuplicates(String str)
	  {
		 int count = 0;
		  
		   ArrayList<Character> charList = new ArrayList<Character>();
		   
		   for (int i=0; i< str.length(); i++)
		   {
			   char ch = str.charAt(i);
			   
			   for(int j=0; j< str.length(); j++)
			   {
				   if(str.charAt(j) != ch)
				   {
					   continue;
				   }
				   count++;
			   }
			    if(!charList.contains(ch))
			    {
			    	if(count > 1 && ch != ' ')
			    	{
			    		System.out.println("char:" + ch +"  "+   count +" "+ "times.");
			    		charList.add(ch);
			    	}
			    }
			    count = 0;
		   }
	  }

}
