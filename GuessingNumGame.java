// Author: Wei-Yu Liao
// 2014/5/2

import java.util.Scanner;

public class GuessingNumGame {
	public GuessingNumGame (){

		int randomNum=this.getBaseNum();
		String result="";
		int count=1;
		int guessingNum=0;
		Scanner in = new Scanner(System.in);
		while(guessingNum!=randomNum){
			System.out.println("Enter 4 digits:");
			guessingNum = in.nextInt();
			
			while(!this.varifyInput(guessingNum)){
				
				guessingNum = in.nextInt();
			}
		
			result=this.compareGuessing(guessingNum, randomNum);
			System.out.println("#"+count+" guessing. You have: "+result);
			count++;
		}
		System.out.println("Congraduation, after "+count+" trials, you got the correct answer:"+randomNum);
	}
	public int getBaseNum(){
		
		long r=Math.round(Math.random()*10000);//get a random number from 0000~9999 for guessing
		int randomNum=(int)r;
		
		//make sure that the base number is 4 digit
		while(randomNum<1000||this.repeatDigit(randomNum)){
			randomNum=(int)Math.round(Math.random()*10000);
		}
		

		
//		System.out.println("the base number:"+randomNum);
		return randomNum;
	}
	
	public boolean varifyInput(int input){
		
		if(input<1000){
			System.out.println("the first digit must from 1 to 9");
			return false;
		}else if(this.repeatDigit(input)){
			System.out.println("please enter 4 digits number without repetition:");
			return false;
		}
		
		return true;
	}

	private boolean repeatDigit(int randomNum) {
		if( randomNum<1000){
			System.out.println("The parameter must be 4 digits");
			return false;
		}
		String baseN=Integer.toString(randomNum);

		for(int i=0; i<3; i++){
			
			for(int j=i+1; j<4; j++){
				
				if(baseN.charAt(i)==baseN.charAt(j)){
					return true;
				}
			}
		}
		
		
		return false;
	}

	public String compareGuessing(int guessingNum, int randomNum){
		
		if(guessingNum <1000 || randomNum<1000){
			return "The parameters must be 4 digit numbers";
		}
		if(this.repeatDigit(randomNum)||this.repeatDigit(guessingNum)){
			return "The input cannot have repeated digits";
		}
		
		String guessingN=Integer.toString(guessingNum);
//		System.out.println(guessingN);
		String baseN=Integer.toString(randomNum);
		String result="";
		char baseCh, guessCh; 
		int countA=0, countB=0;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				baseCh=baseN.charAt(i);
				guessCh=guessingN.charAt(j);
				if(baseCh==guessCh&&i==j){
					
					result +="A";
					countA++;
				}else if(baseCh==guessCh&&i!=j){
					
					result +="B";
					countB++;
				}
				
			}
		}
		
		
		result=countA+"A"+countB+"B";
		
		
		
		return result;
		
	}
	
	public static void main(String[] args) {
		

		
		GuessingNumGame play1=new GuessingNumGame();
/*
		int randomNum=play1.getBaseNum();
		String result="";
		int count=1;
		int guessingNum=0;
		Scanner in = new Scanner(System.in);
		while(guessingNum!=randomNum){
			System.out.println("Enter 4 digits:");
			guessingNum = in.nextInt();
			
			while(!play1.varifyInput(guessingNum)){
				
				guessingNum = in.nextInt();
			}
		
			result=play1.compareGuessing(guessingNum, randomNum);
			System.out.println("#"+count+" guessing. You have: "+result);
			count++;
		}
		System.out.println("Congraduation, after "+count+" trials, you got the correct answer:"+randomNum);
*/
	}


}


