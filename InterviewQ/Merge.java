import java.util.Arrays;

// From Cracking the Coding Interview 4th edition
// Solution 9.1
// Question: You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. Write a method to merge B into B in sorted order.
public class Merge {

	public static void main(String[] args) {
		int[] a = new int[10];
		a[0]=11;
		a[1]=13;
		a[2]=24;
		int[]b = new int[]{0,4,8,12,16,15,27};
		int lastA=3, lastB=7;
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		Merge.merge(a, b, lastA, lastB);
		System.out.println("After Merging: "+Arrays.toString(a));
		
	}
	public static void merge(int[] a, int[]b, int lastA, int lastB){
		int indexA = lastA-1;//index of last element in array a
		int indexB = lastB-1;//index of last element in array b
		int indexMerged = lastB +lastA-1; //end of merge array
		
		//Merge a and b, starting from the last element in each
		while(indexA>=0 && indexB>=0){
			//end of a is > than end of b, then move the last element of A to the place of index indexMerged
			if(a[indexA]> b[indexB]){
				a[indexMerged]= a[indexA];//copy element
				indexMerged--; //move indices
				indexA--;
			}else{
				a[indexMerged]=b[indexB];//copy element
				indexMerged--;
				indexB--;
			}
		}
		
		//Copy remaining elements from b into place, this means that the remaining of b are less the a[0]
		while (indexB>=0){
			a[indexMerged] = b[indexB];
			indexMerged--;
			indexB--;
		}
		
	}

}
