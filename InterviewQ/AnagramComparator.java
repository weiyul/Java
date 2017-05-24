import java.util.Arrays;
import java.util.Comparator;
//From Cracking the Coding Interview 4th edition
//Solution 10.2
//Write a method to sort an array of string so that all the anagrams are next to each other.

public class AnagramComparator implements Comparator<String> {
	public static void main(String[] args){
		
		String[] array = new String[]{"abc", "abcdeff","cab", "cba", "ggg", "fedabc", "ggg", "abfcdfe", "bac" };
		Arrays.sort(array, new AnagramComparator());
		
		// will show [abc, cab, cba, bac, fedabc, abcdeff, abfcdfe, ggg, ggg]
		// this will take O(n log(n))
		System.out.println(Arrays.toString(array));
	}
	//Sort anagrams
	public String sortChars(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	//compare two strings to see if they are anagrams
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return sortChars(s1).compareTo(sortChars(s2));
	}

}
