package chp10ex10;

public class ReserveInt {

	public int reserveInt(int n) {
		int iv = n;		//initial value
		int digit = 0;
		int tmp;
		int result = 0;
		
		while(n / 10 > 0) {
			n /= 10;
			digit++;
		}
		
		int[] array = new int[digit + 1];
		
		for(int i = 0; i <= digit; i++) {
			array[i] = iv % 10;
			iv /= 10;
		}
		
		for(int i = 0; i < digit; i++) {
			for(int j = 0; j <= i; j++) {
				if(array[j] < array[j + 1]) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		
		for(int i = 0; i <= digit; i++) {
			result = (result * 10) + array[i]; 
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		ReserveInt ri = new ReserveInt();
		System.out.println(ri.reserveInt(118372));
	}

}
/*
 * 1. 정수값을 하나의 숫자배열로 분해해야 함.
 * 1-1. 숫자배열의 길이가 정수값에 따라 변함. 즉, 배열 길이 또한 유동적.
 * 2. 숫자배열로 분해된 수들을 내림차순으로 배치(selection sort)
 * 3. 다시 그 숫자 배열을 하나의 정수로 반환
 */