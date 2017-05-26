import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
//From Cracking the Coding Interview 4th edition
//I made a slight change in sortChars(String s), to convert an input string into lowercase
//Solution 10.2
//Write a method to sort an array of string so that all the anagrams are next to each other.
import java.util.LinkedList;

public class AnagramComparator implements Comparator<String> {
	public static void main(String[] args){
		
		String[] array = new String[]{"abc", "abcdeff","cab", "cba", "ggg", "fedabc", "ggg", "abfcdfe", "bac" };
		Arrays.sort(array, new AnagramComparator());
		
		// will show [abc, cab, cba, bac, fedabc, abcdeff, abfcdfe, ggg, ggg]
		// this will take O(n log(n))
		System.out.println(Arrays.toString(array));
		String[] array2 = new String[]{"William Shakespeare", "abcdeff","cab","Arrigo Boito", "cba", "ggg","Tobia Gorrio" , "ggg", "abfcdfe", "bac", "I am a weakish speller" };
		AnagramComparator anagram= new AnagramComparator();
		anagram.sort(array2);
		System.out.println(Arrays.toString(array2));//[abfcdfe, abcdeff, bac, cba, cab, William Shakespeare, I am a weakish speller, Tobia Gorrio, Arrigo Boito, ggg, ggg]
	}
	//Sort anagrams
	public String sortChars(String s){
		String sLower = s.toLowerCase();//change all character to lower case
		char[] content = sLower.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	//compare two strings to see if they are anagrams
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return sortChars(s1).compareTo(sortChars(s2));
	}
	
	public void sort(String[] array){
		Hashtable<String, LinkedList<String>> hash = new Hashtable<>();
		
		//Group words by anagram
		for(String s:array){
			String key = sortChars(s);
			//System.out.println(key);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hash.get(key);
			anagrams.push(s);
		}
		//Convert hash table to array
		int index =0; 
		for(String key: hash.keySet()){
			LinkedList<String> list = hash.get(key);
			for (String t :list){
				array[index] = t;
				index++;
			}
		}
	}

}
