package com.poortoys.examples.PP1;

public class checkEqualityofTwoLineUC2 {
	
	public double LengthofLine(int x1, int y1, int x2, int y2) {
		double lengthOfTheLine = (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		lengthOfTheLine=Math.sqrt(lengthOfTheLine); 
		return lengthOfTheLine;
	}
	
	public static void main(String args[]) {
		checkEqualityofTwoLineUC2 cqotl = new checkEqualityofTwoLineUC2();
		double lineOne = cqotl.LengthofLine(4, 3, 4, 4);
		double lineTwo = cqotl.LengthofLine(4, 3, 2, 2);
		lineOne = Math.floor(lineOne);
		lineTwo = Math.floor(lineTwo);
		
		if(lineOne == lineTwo) 
			System.out.println(lineOne + " is equal to " + lineTwo);
		else
			System.out.println(lineOne + " is not equal to " + lineTwo);
	}
}
