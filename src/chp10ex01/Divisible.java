package chp10ex01;

import java.util.Arrays;

public class Divisible {
	public int[] divisible(int[] array, int divisor) {
		int a = 0;
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				a++;
			}
		}
		int[] ret = new int[a];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				ret[index] = array[i];
				index++;
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		Divisible div = new Divisible();
		
		int[] array = {5, 9, 7, 10};
		System.out.println(Arrays.toString(div.divisible(array, 5)));
	}

}
