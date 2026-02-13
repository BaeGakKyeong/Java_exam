package chp10ex06;

public class StrToInt {

	public int getStrToInt(String str) {
		int result = 0;
		int ascii;
		
		for(int i = 0; i < str.length(); i++) {
			ascii = str.charAt(i) - 48;
			result += ascii;
			
			if(i == str.length() - 1) {
				return result;
			}
			result *= 10;
		}
		return 0;
	}
	public static void main(String[] args) {
		StrToInt strToInt = new StrToInt();
		
//		System.out.println(strToInt.getStrToInt("-1234"));
//		System.out.println(strToInt.getStrToInt("+1234"));
		System.out.println(strToInt.getStrToInt("1234"));
	}

}
/* 아스키코드값으로 인덱스 48번이 0, 57이 9이다. 
 * switch-case문으로 "1" 이면 1이고, "2"이면 2이고... 이렇게 무식하게 하는게 아니라, 유니코드값으로 반환하는 방법이 있지 않을까?
 * ascii코드로 반환하는 방법은, str로 선언된 문자열의 경우 str.chartAt(배열 인덱스)이다.
 */