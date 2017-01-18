
// Solution from Cracking the Coding Interview 4th edition
// 8.1 Write a method to generate the nth Fibonacci number

public class Fbio {

	/* There are three potential approaches: 1. recursive approach 2. iterative approach 3. using matrix math
	 * here we use recursive and iterative approaches
	 */
	
	int fiboUsingRecursive(int n){
		if (n ==0){
			return 0; // f(0) = 0
		}else if(n==1){
			return 1; // f(1) =1
		}else if (n>1){
			return fiboUsingRecursive(n-1)+ fiboUsingRecursive(n-2);// f(n) = f(n-1) + f(n-2)
		}else {
			return -1;// Error condition
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Recursive approach:");
		System.out.println("Fibonacci number, n=0: "+ new Fbio().fiboUsingRecursive(0));
		System.out.println("Fibonacci number, n=1: "+ new Fbio().fiboUsingRecursive(1));
		System.out.println("Fibonacci number, n=2: "+ new Fbio().fiboUsingRecursive(2));
		System.out.println("Fibonacci number, n=3: "+ new Fbio().fiboUsingRecursive(3));
		System.out.println("Fibonacci number, n=4: "+ new Fbio().fiboUsingRecursive(4));



	}

}
