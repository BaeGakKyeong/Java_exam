package chp10ex06;

public class StrToInt {
	
	public boolean isCorrectValue(String str) {
		char first = str.charAt(0);
		if(first != '+' && first != '-') {
			if(first < '0' || first > '9') {
				return false;
			}
		}
		for(int i = 1; i < str.length(); i++) {	
			if(str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		
		return true;
	}

	public int getStrToInt(String str) {
		char firstIndex = str.charAt(0);
		AsciiToInt asciiToInt = new AsciiToInt();
		
		if(firstIndex != '+' && firstIndex != '-') {
			return asciiToInt.ascii(str, 0);
		}
		
		else if(firstIndex == '+') {
			return asciiToInt.ascii(str, 1);
		}
		else {
			return asciiToInt.ascii(str, 1) * -1;
		}
		
	}
}

/*
 * 예상 가능한 오류:
 * 숫자가 아닌 문자의 입력(부호는 제외)
 * 부호가 0번 인덱스 외에 다른곳에 가 있음
 * (0으로 시작하는 문자열의 경우, 예를 들어 0023일 때, 코드상 23을 리턴해서 오류 없음.)
 */