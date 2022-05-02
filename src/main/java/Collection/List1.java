package Collection;

import java.util.*;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> ls = new ArrayList<String>();
       ls.add("Java");
       ls.add("Phyton");
       ls.add("C#");
       ls.add("Ruby");
       ls.add("Networking");
       
       for(String lang : ls)
       {
       System.out.print(lang +", ");
       }
       
       // sort an element
     
       Collections.sort(ls);
       System.out.println("\n After sorting");
       System.out.println(ls);
      
       
    // Retrive the first and third element
     String element = ls.get(0);
     System.out.println("First element: "+element);
     String element2 = ls.get(2);
     System.out.println("Third element: "+element2);
     
     // Search the value c#
     System.out.println("Is there Phyton = " +ls.contains("Phyton"));
     
     //update the third element with Data Structure
     ls.set(2, "Data Structure");
     System.out.println("update the third element with Data Structure");
     System.out.println(ls);
     
     //Remove the second element
     ls.remove(1);
     System.out.println("Remove the Second element");
     System.out.println(ls);
	}

}
