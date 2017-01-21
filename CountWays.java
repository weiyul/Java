
//Solution from Cracking the Coding Interview 5th edition
//Recursion and Dynamic Programming 
//9.1 A child is running up a staircase with n steps, 
//and can hop either 1 step, 2 steps, or 3 steps at a time. 
//Implement a method to count how many possible ways the child can run up the stairs

public class CountWays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountWays c= new CountWays();
		System.out.println("n=3, method of fibonacci: "+c.countWays(3));// 3 steps, there are 4 wayss
		int[] map ={-1,-1,-1,-1};//since n =3
		System.out.println("n=3, method of dynamic programming: "+CountWays.countWaysDP(3, map));
		

	}
	
	//Dynamic programming, store vale in each calculation to avoid unnecessary repeatedly calling of the same values as fibonacci maehod
	public static int countWaysDP(int n, int[] map){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else if (map[n]>-1){
			return map[n];
		}else{
			map[n] = countWaysDP(n-1, map)+ 
					countWaysDP(n-2, map)+
					countWaysDP(n-3, map);
			return map[n];
		}
	}
	
	//We can approach this problem from the top down. 
	//On the very last hop, up to the nth step, 
	//the child could have done either a single, double, or triple step hop. That is, the last move might have been a single step hop from step n-1, a double step hop from step n-2, or a triple step hop from n-3. The total number of ways of reaching the last step in therefore the sum of the number of ways of reaching each of the last three steps.
	//Like the Fibonacci problem, the runtime of this algorithm is exponential, O(3^n), since each call branches out to three more calls.
	//This means that countWays is called many times for the same values, which is unnecessary
	public int countWays(int n){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else{
			return countWays(n-1)+countWays(n-2)+countWays(n-3);
		}
		
	}
	



}
