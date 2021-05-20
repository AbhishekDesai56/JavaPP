package com.poortoys.examples.PP1;

public class CompareTwoLineEndPoint {
	
	
		public int setEndPoint(int x1, int y1, int x2, int y2) {
				return (x2+y2);
		}
		
		public void CompareEndPoint(int endPointOne, int endPointTwo) {
			if(endPointOne == endPointTwo)
				System.out.println("EndPoint One is equal to EndPoint Two");
			else if(endPointOne < endPointTwo)
				System.out.println("EndPoint One is less than EndPoint Two");
			else
				System.out.println("EndPoint One is greater than EndPoint Two");	
		}
		
		public static void main(String args[]) {
			int endPointOfLineOne=0;
		    int endPointOfLineTwo=0;
		    
			CompareTwoLineEndPoint cqotl = new CompareTwoLineEndPoint();
			endPointOfLineOne = cqotl.setEndPoint(4, 3, 4, 4);
			endPointOfLineTwo = cqotl.setEndPoint(4, 3, 2, 2);
			
			cqotl.CompareEndPoint(endPointOfLineOne, endPointOfLineTwo);
		}
}
