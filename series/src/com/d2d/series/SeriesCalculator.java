package com.d2d.series;

public class SeriesCalculator {
	
	public long[] findNextInSeries(long[] inputNos){
		long theLastNumber = inputNos[inputNos.length-1]-1;
		long[] returnArray = new long[2];
		int i=0;
		
		while(i<2){
			theLastNumber = returnSquareOfNumber(theLastNumber);
			returnArray[i] = theLastNumber+1;
			i++;
		}
		return returnArray;
	}
	
	private long returnSquareOfNumber(long number){
		return number*number;
	}

}
