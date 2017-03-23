import java.util.ArrayList;

// Solutions from Cracking the Coding Interview 4th
// 8.4 Write a method to compute all permutations of a string
// the solution takes O(n!) time
public class Permutation {

	public static void main(String[] args) {
		String testString= "abc";
		ArrayList<String> permutations =Permutation.getPerms(testString);
		System.out.println("The permutation of "+ testString);
		for(String word: permutations){
			System.out.println(word);
		}
		
		/* the result will be 
	    abc
	    bac
	    bca
		acb
		cab
		cba
		*/
		
		
		String testString2= "abcd";
		ArrayList<String> permutations2 =Permutation.getPerms(testString2);
		System.out.println("The permutation of "+ testString2);
		for(String word: permutations2){
			System.out.println(word);
		}
		
		/* The result will be 
		 * 	abcd
			bacd
			bcad
			bcda
			acbd
			cabd
			cbad
			cbda
			acdb
			cadb
			cdab
			cdba
			abdc
			badc
			bdac
			bdca
			adbc
			dabc
			dbac
			dbca
			adcb
			dacb
			dcab
			dcba
		 * total 4!= 24 permutations 
		 */
	}
	
	public static ArrayList<String> getPerms(String s){
		ArrayList<String> permutations = new ArrayList<String>();
		if(s==null){ // error case
			return null;
		}else if(s.length() ==0){ // base case
			permutations.add("");
			return permutations;
		}
		
		char first = s.charAt(0); //get the first character
		String remainder = s.substring(1);// substring starts at the index 1, i.e., remove the first character
		ArrayList<String> words= getPerms(remainder);// get the permutations of the remainder without the first character
		for(String word: words){
			for(int j=0; j<= word.length(); j++){ //put the first character into the j index of the word
				permutations.add(insertCharAt(word, first, j));
			}
		}
		return permutations;
		
	}

	//this function put char "first" into index "j" of the string "word"
	private static String insertCharAt(String word, char first, int j) {
		String start = word.substring(0, j);// get the sub-string of word from index 0 to index j-1
		String end = word.substring(j); // get the sube-string of word from index j to the end
		return start+first+end;
	}

}
