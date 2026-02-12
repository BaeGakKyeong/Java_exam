package chp10ex01;

import java.util.Arrays;

public class Divisible {
	public int[] divisible(int[] array, int divisor) throws MyCheckedException {
		int resultArraySize = 0;
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				resultArraySize++;
			}
		}
		if(resultArraySize == 0) {
			throw new MyCheckedException();
		}
		int[] ret = new int[resultArraySize];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				ret[index++] = array[i];
			}
		}
		return ret;
	}
}
