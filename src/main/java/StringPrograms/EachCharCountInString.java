package StringPrograms;

import java.util.HashMap;

public class EachCharCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		characterCount("Java J2EE Java JSP J2EE");
		  
	       characterCount("All Is Well");
	  
	       characterCount("Done And Gone");
	}
	private static void characterCount(String str)
	{
		HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
		
		//Converting given string to char array
	     char Strarr[] = str.toCharArray();
	     
	     //checking each char of strArray
	     for(char c : Strarr)
	     {
	// containsKey() method is used to check whether a particular key is being mapped into 
	// the HashMap or not
	    	 if(charcount.containsKey(c))
	    	 {
	    		//If char 'c' is present in charCountMap, incrementing it's count by 1
	    		 charcount.put(c, charcount.get(c)+1);
	    	 }
	    	 else
	    	 {
	    		 {
	                 //If char 'c' is not present in charCountMap,
	                 //putting 'c' into charCountMap with 1 as it's value
	   
	                 charcount.put(c, 1);
	             }
	    	 }  

	     }
	     System.out.println(str+" : "+charcount);
	}

}
