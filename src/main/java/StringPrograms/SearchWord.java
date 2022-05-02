package StringPrograms;

public class SearchWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "My name is arti is shekhawat";
		 int index = str.indexOf("ox");
		 System.out.println(index);
		 
		     if (index == -1)
		     {
		    	 System.out.println("Arti not found");
		     }
		     else
		     {
		    	 System.out.println("Found arti at index" +"  " + index);
		     }
	}

}
