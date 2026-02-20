package chp10ex06;

public class AsciiToInt {
	public int ascii(String str, int i) {
		int result = 0;
			
		for(; i < str.length(); i++) {
			result = result * 10 + str.charAt(i) - '0';
		}
		
		return result;
	}
}
