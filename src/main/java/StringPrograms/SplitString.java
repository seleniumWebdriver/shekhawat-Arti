package StringPrograms;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "jan-feb-march";
          String delimeter = "-";
          String temp[] = str.split("");
          
          for(int i=0; i<temp.length; i++)
          {
        	  System.out.println(temp[i]);
        	  System.out.println("");
        	  str = "jan.feb.march";
        	  delimeter = "\\.";
        	  temp = str.split(delimeter, 2);
        	  
        	  for (int j=0; j< temp.length; j++)
        	  {
        		  System.out.println(temp[j]);
        	  }
          }
	}

}
