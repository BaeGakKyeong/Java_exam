package chp10ex11;

public class GetMinMaxString {

	public String getMinMaxString(String str) {
		
		int count = 1;
		int index = 0;

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		
		int[] array = new int[count];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			}
			else {
				if(str.charAt(i) == '-') {
					array[index] = (str.charAt(i + 1) - '0') * -1;
					index++;
					i++;
				}
				else {
					array[index] = (str.charAt(i) - '0');
					index++;
				}
			}
		}
		
		int maxValue = array[0]; 
		int minValue = array[0];
		
		for(int i = 0; i < count; i++) {
			if(maxValue < array[i]) {
				maxValue = array[i];
			}
			if(minValue > array[i]) {
				minValue = array[i];
			}
		}
		
		
		
		return minValue + "" + " " + maxValue + "";
	}
	
	public static void main(String[] args) {
		
		String str1 = "1 2 3 4";
		String str2 = "-1 -2 -3 -4";
		GetMinMaxString minMax = new GetMinMaxString();
		
		System.out.println("최댓값과 최솟값은? " + minMax.getMinMaxString(str1));
		System.out.println("최댓값과 최솟값은? " + minMax.getMinMaxString(str2));
	}

}

/*
 * 1. 숫자의 배열 크기 지정을 위한 카운팅
 * 2. '-'기호의 여부 확인
 * 3. 최댓값과 최솟값을 찾기
 * 4. 문자열로 반환
 */