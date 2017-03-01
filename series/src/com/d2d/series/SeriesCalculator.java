package com.d2d.series;

public class SeriesCalculator {
	
	public long[] findNextInSeries(long[] inputNos) 
			throws InvalidSeriesException{
		if(validSeries(inputNos)){
			long theLastNumber = inputNos[inputNos.length-1]-1;
			long[] returnArray = new long[2];
			int i=0;
			
			while(i<2){
				theLastNumber = returnSquareOfNumber(theLastNumber);
				returnArray[i] = theLastNumber+1;
				i++;
			}
			return returnArray;
		}else{
			throw new InvalidSeriesException();
		}
	}
	
	private boolean validSeries(long[] inputNos) {
		// TODO Auto-generated method stub
		return true;
	}

	private long returnSquareOfNumber(long number){
		return number*number;
	}

}
