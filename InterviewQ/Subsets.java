// Solution from Cracking the Coding Interview 4th
// 8.3 Write a method that returns all subsets of a set
import java.util.ArrayList;


public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> set= new ArrayList<>();
		set.add(34); 
		set.add(33);
		set.add(32);
		set.add(31);
		System.out.println("The input set:");
		System.out.println(set.toString());
		System.out.println();
		Subsets test = new Subsets();
		System.out.println("Let us see the calcualtion of the subsets by recurssive method:");
		ArrayList<ArrayList<Integer>> allsubsets =test.getSubsetsByRecurssive(set, 0);// index must be 0
		System.out.println();
		System.out.println("Showing the result...");
		System.out.println("all "+allsubsets.size() +" subsets:");
		
		for(ArrayList<Integer> subset: allsubsets ){
			
			
			System.out.println(subset.toString());
			
			
		}
		
	}
	
	ArrayList<ArrayList<Integer>> getSubsetsByRecurssive(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size()==index){
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());// Empty set
			System.out.println("index: "+ index+ " and I am base set: "+ allsubsets.toString());
		}else{
			allsubsets = getSubsetsByRecurssive(set, index+1);
			System.out.println();
			System.out.println("index: "+ index+ " and the input set: "+allsubsets.toString());

			int item= set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets= new ArrayList<ArrayList<Integer>>();
			

			for(ArrayList<Integer> subset: allsubsets){
				
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				System.out.println("The the current subset we are looking at is: "+ newsubset.toString());
				newsubset.add(item);
				System.out.println("Adding dditional item, set["+ index +"] = "+item+", to the above set to generate a new subset and we get : "+ newsubset.toString());
				moresubsets.add(newsubset);
				
				
			}
			System.out.println("The total new subsets we get at this step are:"+ moresubsets.toString());
			allsubsets.addAll(moresubsets);
		
		}
		
	
		return allsubsets;
		
	}

}
