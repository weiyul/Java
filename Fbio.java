
// Solution from Cracking the Coding Interview 4th edition
// 8.1 Write a method to generate the nth Fibonacci number

public class Fbio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iterative approach:");
		System.out.println("Fibonacci number, n=0: "+ new Fbio().fiboUsingIterative(0));
		System.out.println("Fibonacci number, n=1: "+ new Fbio().fiboUsingIterative(1));
		System.out.println("Fibonacci number, n=2: "+ new Fbio().fiboUsingIterative(2));
		System.out.println("Fibonacci number, n=3: "+ new Fbio().fiboUsingIterative(3));
		System.out.println("Fibonacci number, n=4: "+ new Fbio().fiboUsingIterative(4));
		System.out.println("Fibonacci number, n=5: "+ new Fbio().fiboUsingIterative(5));
		System.out.println("Fibonacci number, n=6: "+ new Fbio().fiboUsingIterative(6));
		System.out.println("Fibonacci number, n=7: "+ new Fbio().fiboUsingIterative(7));
		System.out.println("Fibonacci number, n=8: "+ new Fbio().fiboUsingIterative(8));
		System.out.println("Fibonacci number, n=9: "+ new Fbio().fiboUsingIterative(9));
		System.out.println("Fibonacci number, n=10: "+ new Fbio().fiboUsingIterative(10));
		System.out.println("Fibonacci number, n=11: "+ new Fbio().fiboUsingIterative(11));
		System.out.println("Fibonacci number, n=12: "+ new Fbio().fiboUsingIterative(12));
		System.out.println("Fibonacci number, n=13: "+ new Fbio().fiboUsingIterative(13));
		System.out.println("Fibonacci number, n=14: "+ new Fbio().fiboUsingIterative(14));
		System.out.println("Fibonacci number, n=15: "+ new Fbio().fiboUsingIterative(15));
		System.out.println("Fibonacci number, n=16: "+ new Fbio().fiboUsingIterative(16));
		System.out.println("Fibonacci number, n=17: "+ new Fbio().fiboUsingIterative(17));
		System.out.println("Fibonacci number, n=18: "+ new Fbio().fiboUsingIterative(18));
		System.out.println("Fibonacci number, n=19: "+ new Fbio().fiboUsingIterative(19));
		System.out.println("Fibonacci number, n=20: "+ new Fbio().fiboUsingIterative(20));
		System.out.println("Fibonacci number, n=21: "+ new Fbio().fiboUsingIterative(21));
		System.out.println("Fibonacci number, n=22: "+ new Fbio().fiboUsingIterative(22));
		System.out.println("Fibonacci number, n=23: "+ new Fbio().fiboUsingIterative(23));
		System.out.println("Fibonacci number, n=24: "+ new Fbio().fiboUsingIterative(24));
		System.out.println("Fibonacci number, n=25: "+ new Fbio().fiboUsingIterative(25));
		System.out.println("Fibonacci number, n=26: "+ new Fbio().fiboUsingIterative(26));
		System.out.println("Fibonacci number, n=27: "+ new Fbio().fiboUsingIterative(27));
		System.out.println("Fibonacci number, n=28: "+ new Fbio().fiboUsingIterative(28));
		System.out.println("Fibonacci number, n=29: "+ new Fbio().fiboUsingIterative(29));
		System.out.println("Fibonacci number, n=30: "+ new Fbio().fiboUsingIterative(30));
		System.out.println("Fibonacci number, n=31: "+ new Fbio().fiboUsingIterative(31));
		System.out.println("Fibonacci number, n=32: "+ new Fbio().fiboUsingIterative(32));
		System.out.println("Fibonacci number, n=33: "+ new Fbio().fiboUsingIterative(33));
		System.out.println("Fibonacci number, n=34: "+ new Fbio().fiboUsingIterative(34));
		System.out.println("Fibonacci number, n=35: "+ new Fbio().fiboUsingIterative(35));
		System.out.println("Fibonacci number, n=36: "+ new Fbio().fiboUsingIterative(36));
		System.out.println("Fibonacci number, n=37: "+ new Fbio().fiboUsingIterative(37));
		System.out.println("Fibonacci number, n=38: "+ new Fbio().fiboUsingIterative(38));
		System.out.println("Fibonacci number, n=39: "+ new Fbio().fiboUsingIterative(39));
		System.out.println("Fibonacci number, n=40: "+ new Fbio().fiboUsingIterative(40));
		System.out.println("Fibonacci number, n=41: "+ new Fbio().fiboUsingIterative(41));
		System.out.println("Fibonacci number, n=42: "+ new Fbio().fiboUsingIterative(42));
		System.out.println("Fibonacci number, n=43: "+ new Fbio().fiboUsingIterative(43));
		System.out.println("Fibonacci number, n=44: "+ new Fbio().fiboUsingIterative(44));
		System.out.println("Fibonacci number, n=45: "+ new Fbio().fiboUsingIterative(45));//1134903170
		System.out.println("Fibonacci number, n=46: "+ new Fbio().fiboUsingIterative(46));//1836311903
		System.out.println("Fibonacci number, n=47: "+ new Fbio().fiboUsingIterative(47));//-1323752223
		System.out.println("Fibonacci number, n=48: "+ new Fbio().fiboUsingIterative(48));//512559680
		System.out.println("Fibonacci number, n=49: "+ new Fbio().fiboUsingIterative(49));//-811192543
		System.out.println("Fibonacci number, n=50: "+ new Fbio().fiboUsingIterative(50));//-298632863
		System.out.println("Fibonacci number, n=51: "+ new Fbio().fiboUsingIterative(51));//-1109825406
		System.out.println("Fibonacci number, n=52: "+ new Fbio().fiboUsingIterative(52));//-1408458269

		System.out.println();

		System.out.println("Recursive approach:");
		System.out.println("Fibonacci number, n=0: "+ new Fbio().fiboUsingRecursive(0));
		System.out.println("Fibonacci number, n=1: "+ new Fbio().fiboUsingRecursive(1));
		System.out.println("Fibonacci number, n=2: "+ new Fbio().fiboUsingRecursive(2));
		System.out.println("Fibonacci number, n=3: "+ new Fbio().fiboUsingRecursive(3));
		System.out.println("Fibonacci number, n=4: "+ new Fbio().fiboUsingRecursive(4));
		System.out.println("Fibonacci number, n=10: "+ new Fbio().fiboUsingRecursive(10));
		System.out.println("Fibonacci number, n=11: "+ new Fbio().fiboUsingRecursive(11));
		System.out.println("Fibonacci number, n=12: "+ new Fbio().fiboUsingRecursive(12));
		System.out.println("Fibonacci number, n=13: "+ new Fbio().fiboUsingRecursive(13));
		System.out.println("Fibonacci number, n=14: "+ new Fbio().fiboUsingRecursive(14));
		System.out.println("Fibonacci number, n=15: "+ new Fbio().fiboUsingRecursive(15));
		System.out.println("Fibonacci number, n=16: "+ new Fbio().fiboUsingRecursive(16));
		System.out.println("Fibonacci number, n=17: "+ new Fbio().fiboUsingRecursive(17));
		System.out.println("Fibonacci number, n=18: "+ new Fbio().fiboUsingRecursive(18));
		System.out.println("Fibonacci number, n=19: "+ new Fbio().fiboUsingRecursive(19));
		System.out.println("Fibonacci number, n=20: "+ new Fbio().fiboUsingRecursive(20));
		System.out.println("Fibonacci number, n=21: "+ new Fbio().fiboUsingRecursive(21));
		System.out.println("Fibonacci number, n=22: "+ new Fbio().fiboUsingRecursive(22));
		System.out.println("Fibonacci number, n=23: "+ new Fbio().fiboUsingRecursive(23));
		System.out.println("Fibonacci number, n=24: "+ new Fbio().fiboUsingRecursive(24));
		System.out.println("Fibonacci number, n=25: "+ new Fbio().fiboUsingRecursive(25));
		System.out.println("Fibonacci number, n=26: "+ new Fbio().fiboUsingRecursive(26));
		System.out.println("Fibonacci number, n=27: "+ new Fbio().fiboUsingRecursive(27));
		System.out.println("Fibonacci number, n=28: "+ new Fbio().fiboUsingRecursive(28));
		System.out.println("Fibonacci number, n=29: "+ new Fbio().fiboUsingRecursive(29));
		System.out.println("Fibonacci number, n=30: "+ new Fbio().fiboUsingRecursive(30));
		System.out.println("Fibonacci number, n=31: "+ new Fbio().fiboUsingRecursive(31));
		System.out.println("Fibonacci number, n=32: "+ new Fbio().fiboUsingRecursive(32));
		System.out.println("Fibonacci number, n=33: "+ new Fbio().fiboUsingRecursive(33));
		System.out.println("Fibonacci number, n=34: "+ new Fbio().fiboUsingRecursive(34));
		System.out.println("Fibonacci number, n=35: "+ new Fbio().fiboUsingRecursive(35));
		System.out.println("Fibonacci number, n=36: "+ new Fbio().fiboUsingRecursive(36));
		System.out.println("Fibonacci number, n=37: "+ new Fbio().fiboUsingRecursive(37));
		System.out.println("Fibonacci number, n=38: "+ new Fbio().fiboUsingRecursive(38));
		System.out.println("Fibonacci number, n=39: "+ new Fbio().fiboUsingRecursive(39));
		System.out.println("Fibonacci number, n=40: "+ new Fbio().fiboUsingRecursive(40));
		System.out.println("Fibonacci number, n=41: "+ new Fbio().fiboUsingRecursive(41));
		System.out.println("Fibonacci number, n=42: "+ new Fbio().fiboUsingRecursive(42));
		System.out.println("Fibonacci number, n=43: "+ new Fbio().fiboUsingRecursive(43));
		System.out.println("Fibonacci number, n=44: "+ new Fbio().fiboUsingRecursive(44));//start to calculate super slowly, 701408733
		System.out.println("Fibonacci number, n=45: "+ new Fbio().fiboUsingRecursive(45));//1134903170
		System.out.println("Fibonacci number, n=46: "+ new Fbio().fiboUsingRecursive(46));//1836311903
		System.out.println("Fibonacci number, n=47: "+ new Fbio().fiboUsingRecursive(47));//-1323752223
		System.out.println("Fibonacci number, n=48: "+ new Fbio().fiboUsingRecursive(48));// too slowly........512559680
		System.out.println("Fibonacci number, n=49: "+ new Fbio().fiboUsingRecursive(49));// too slowly........-811192543
		System.out.println("Fibonacci number, n=50: "+ new Fbio().fiboUsingRecursive(50));// too slow to wait
		System.out.println("Fibonacci number, n=51: "+ new Fbio().fiboUsingRecursive(51));// too slow to wait
		System.out.println("Fibonacci number, n=52: "+ new Fbio().fiboUsingRecursive(52));// too slow to wait

	}


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
	
	int fiboUsingIterative(int n){
		if (n <0) return -1; // Error condition
		if (n ==0) return 0;
		if (n ==1) return 1;
		
		int a=0, b=1;
		for(int i=1; i< n; i++){
			int c = a+b;
			a=b;
			b=c;
		}
		return b;
	}
}
