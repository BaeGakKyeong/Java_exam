package chp10ex08;

public class ReserveStr {

	public String reserveStr(String str) {
		char[] chars = str.toCharArray();
		char tmp;
		
		for(int i = 0; i < chars.length; i++) {
			for(int j = i + 1; j < chars.length; j++) {
				if(chars[i] < chars[j]) {
					tmp = chars[i];
					chars[i] = chars[j];
					chars[j] = tmp;
				}
			}
		}
		
		return new String(chars);
	}
	
	public static void main(String[] args) {
		ReserveStr rs = new ReserveStr();
		
		System.out.println(rs.reserveStr("Zbcdefg"));
	}
}
