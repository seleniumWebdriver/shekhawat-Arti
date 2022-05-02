package StringPrograms;

public class ReversePreserving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("I Am Not String");
        
        reverseString("JAVA JSP ANDROID");
         
        reverseString("1 22 333 4444 55555");
	}
	 static void reverseString(String inputString)
	    {
		 //Converting inputString to char array 'inputStringArray'
		 char StrArr[] = inputString.toCharArray();
		 
		//Defining a new char array 'resultArray' with same size as inputStringArray
		 char[] resultArray = new char[StrArr.length];
		 //System.out.println(StrArr.length);
		                                              
		 for (int i = 0; i < StrArr.length; i++) 
	        {
	            if (StrArr[i] == ' ') 
	            {
	                resultArray[i] = ' ';
	            }
	        }
		 int j = resultArray.length-1;
		 
		 for (int i = 0; i < StrArr.length; i++)
	        {
	            if (StrArr[i] != ' ') 
	            {
	                //If resultArray already has space at index j then decrementing 'j'
	                 
	                if(resultArray[j] == ' ')
	                {
	                    j--;
	                }
	                 
	                resultArray[j] = StrArr[i];
	                 
	                j--;
	            }
	        }
		 System.out.println(inputString+" ---> "+String.valueOf(resultArray));
	    }
}
