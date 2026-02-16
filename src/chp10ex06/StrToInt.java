package chp10ex06;

public class StrToInt {

	public int getStrToInt(String str) {
		AsciiToInt asciiToInt = new AsciiToInt();
		
		if(str.charAt(0) != '+' && str.charAt(0) != '-') {
			return asciiToInt.ascii(str, 0);
		}
		
		else if(str.charAt(0) == '+') {
			return asciiToInt.ascii(str, 1);
		}
		else {
			return asciiToInt.ascii(str, 1) * -1;
		}
		
	}
}