package chp10ex01;

import java.util.Arrays;

public class DivisibleExam {

	public static void main(String[] args) {
		Divisible div = new Divisible();
		
		int[] array = {5, 9, 7, 10};
		try {
			System.out.println(Arrays.toString(div.divisible(array, 8)));
		}catch(MyCheckedException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("main end");
	}

}
