package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> languages = new ArrayList<String>();
     
     languages.add("Red");
     languages.add("Orange");
     languages.add("White");
     
     System.out.println("ArrayList"+ languages);
     
     // Iterate using for each loop
     
     for(String color : languages)
     {
    	 System.out.print(color);
     }
     
     //change the Element of the ArrayList
     languages.set(2,"Pink");
     System.out.println("Modified ArrayList" + languages);
     
     // Remove Element From Index 1.
     String str = languages.remove(1);
     System.out.println("Updated Color"+ languages);
     System.out.println("Removed Element = " + str);
	}

}
