package chp10ex06;

public class AsciiToInt {
	public int ascii(String str, int i) {
		int result = 0;
		int asciiNum;
			
			
		for(; i < str.length(); i++) {
			asciiNum = str.charAt(i) - 48;
			result += asciiNum;
			
			if(i == str.length() - 1) {
				continue;
			}
			
			result *= 10;
		}
	
			
		
		return result;
	}
}

//i를 밖에서 선언하면 안되나?