package chp10ex12;

public class HarshadNumber {

	public boolean isHarshad(int num) {
		int sum = 0;
		int digit = 10;
		int iv = num;
		
		if(num < 10) {
			return true;
		}
		else {
			while(iv != 0) {
				sum += iv % digit;
				iv /= 10;
			}
		}
		
		if(num % sum == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		
		System.out.println(sn.isHarshad(10));
		System.out.println(sn.isHarshad(18));
		System.out.println(sn.isHarshad(11));
		System.out.println(sn.isHarshad(13));
	}

}
