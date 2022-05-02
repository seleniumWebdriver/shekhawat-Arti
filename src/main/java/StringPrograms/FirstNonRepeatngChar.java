package StringPrograms;

import java.util.Scanner;

public class FirstNonRepeatngChar {


			public static String NonRepeatingChar(String str) {
				// TODO Auto-generated method stub
		          String str1= "";
		     
		           for(int i=0; i< str.length(); i++)
		           {
		        	   Boolean unique = true;
		        	   
		        	   for (int j=0; j<str.length(); j++)
		        	   {
		        		   if(i!=j && str.charAt(i) == str.charAt(j))
		        		   {
		        			   unique = false;
		        			   break;
		        		   }
		        	   }
		        	   if(unique)
		        	   {
		        		   str1=Character.toString(str.charAt(i));
		        		   break;
		        	   }
		           }
		        		  return str1;
			}
			   public static void main (String[] args)
			   {
				   Scanner s = new Scanner(System.in);
				     System.out.println("Enter String");
				   System.out.print(NonRepeatingChar(s.nextLine()));
				  
				    s.close();   
			   }
			   
		}



