package StringPrograms;

import java.util.HashMap;
import java.util.Set;

public class DupWordsNofOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			   duplicateWords("Bread butter and bread");
			   
		        duplicateWords("Java is java again java");
		 
		        duplicateWords("Super Man Bat Man Spider Man");
	    }
	}
		static void duplicateWords(String str)
		{
			System.out.println(str);
			
			String words[] = str.split(" ");
			
			//Creating one HashMap with words as key and their count as value
			HashMap<String, Integer> wordcount = new HashMap<String,Integer>();
			
			//Checking each word
			for(String word : words)
			{
			if(	wordcount.containsKey(word.toLowerCase()))
			{
				//If it is present, incrementing it's count by 1
				wordcount.put(word.toLowerCase(), wordcount.get(word.toLowerCase())+1);
			}
			else
			{
				 //If it is not present, put that word into wordCount with 1 as it's value
				wordcount.put(word.toLowerCase(),1);
			}
			}
			
			 //Extracting all keys of wordCount
			Set<String> wordsInString = wordcount.keySet();
			System.out.println("Unique value"+wordsInString);
			
			 //Iterating through all words in wordCount
			for(String word : wordsInString)
			{
				//if word count is greater than 1
				if(wordcount.get(word)>1)
				{
					//Printing that word and it's count
					 
	                System.out.println(word+" : "+wordcount.get(word));
	                System.out.println("\n");
				}
			}
			
		}
	}
	
