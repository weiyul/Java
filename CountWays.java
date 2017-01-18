
//Solution from Cracking the Coding Interview 5th edition
//Recursion and Dynamic Programming 
//9.1 A child is running up a staircase with n steps, 
//and can hop either 1 step, 2 steps, or 3 steps at a time. 
//Implement a method to count how many possible ways the child can run up the stairs

public class CountWays {

	//We can approach this problem from the top down. 
	//On the very last hop, up to the nth step, 
	//the child could have done either a single, double, or triple step hop. That is, the last move might have been a single step hop from step n-1, a double step hop from step n-2, or a triple step hop from n-3. The total number of ways of reaching the last step in therefore the sum of the number of ways of reaching each of the last three steps.

	public int countWays(int n){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else{
			return countWays(n-1)+countWays(n-2)+countWays(n-3);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountWays c= new CountWays();
		System.out.print(c.countWays(3));// 3 steps, there are 4 wayss
		

	}

}
