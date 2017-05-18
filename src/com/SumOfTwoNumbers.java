package com;

public class SumOfTwoNumbers {

	 public static int addNumber(int a, int b){  
	        while (b != 0){
	            int carry = (a & b) ; //CARRY is AND of two bits
	          
	            a = a ^b; //SUM of two bits is A XOR B
	          
	            b = carry << 1; //shifts carry to 1 bit to calculate sum
	        }
	        return a;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration of the variables
		
		int a=3;
		int b=5;
		int result=addNumber(a,b);
		
		System.out.println("The sum of the numbers "+a + " and " +b +" is = "+result);
	
		
		

	}

}
