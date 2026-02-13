package chp10ex04;

public class WaterMelon {
	
	public String waterMelon(int n) {
		String result = "";
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				//result += "수"; 이렇게 작성해도 문제 없음.
				result = result.concat("수");
			}
			else {
				//result += "박";
				result = result.concat("박");
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		WaterMelon wm = new WaterMelon();
		
		System.out.println("n이 3인 경우 : " + wm.waterMelon(3));
		System.out.println("n이 4인 경우 : " + wm.waterMelon(4));
	}

}
