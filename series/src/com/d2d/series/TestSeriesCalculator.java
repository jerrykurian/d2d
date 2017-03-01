package com.d2d.series;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestSeriesCalculator {

	@Test
	public void testFindNextInSeries_2() {
		SeriesCalculator calc = new SeriesCalculator();
		long[] input = new long[2];
		input[0] = 2;
		input[1] = 5;
		long[] output;
		try {
			output = calc.findNextInSeries(input);
			long[] expectedOutput = new long[2];
			expectedOutput[0] = 17;
			expectedOutput[1] = 257;
			assertArrayEquals(expectedOutput,output);
		} catch (InvalidSeriesException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindNextInSeries_4() {
		SeriesCalculator calc = new SeriesCalculator();
		long[] input = new long[3];
		input[0] = 2;
		input[1] = 5;
		input[2] = 17;
		
		long[] output;
		try {
			output = calc.findNextInSeries(input);
			long[] expectedOutput = new long[2];
			expectedOutput[0] = (16*16)+1;
			expectedOutput[1] = (256*256)+1;
			assertArrayEquals(expectedOutput,output);
		} catch (InvalidSeriesException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindNextInSeries_InvalidSeries() {
		SeriesCalculator calc = new SeriesCalculator();
		long[] input = new long[3];
		input[0] = 2;
		input[1] = 4;
		input[2] = 17;
		
		long[] output;
		try {
			output = calc.findNextInSeries(input);
			fail("Did not find invalid series");
		} catch (InvalidSeriesException e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}
	}
}
