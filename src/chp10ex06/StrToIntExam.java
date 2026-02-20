package chp10ex06;
import java.util.Scanner;

public class StrToIntExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StrToInt strToInt = new StrToInt();
		
		String value;
		boolean isCorrect;
		
		do {
			System.out.println("정수값을 입력해 주세요");
			value = scan.next();
			isCorrect = strToInt.isCorrectValue(value);
			
			if(isCorrect == false) {
				System.out.println("정수 값이 아닙니다.");
			}
			else {
				System.out.println("입력된 값은 " + strToInt.getStrToInt(value) + "입니다.");

			}
		}while(isCorrect == false);
		
		scan.close();
	}

}
