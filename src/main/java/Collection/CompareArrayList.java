package Collection;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> c1 = new ArrayList<String>();
       c1.add("Asha");
       c1.add("Bhasha");
       c1.add("Nasa");
       c1.add("Abhilasa");
       
       ArrayList<String> c2 = new ArrayList<String>();
       c2.add("Nasa");
       c2.add("Bhasha");
       c2.add("Asha");
       
       //Storing the comparison output in ArrayList<String>
       
      ArrayList<String> c3 = new ArrayList<String>();
      
      for(String names : c1)
    	  c3.add(c2.contains(names) ? "Yes" : "No");
      System.out.println(c3);
	}

}
