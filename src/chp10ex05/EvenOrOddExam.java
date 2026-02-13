package chp10ex05;

public class EvenOrOddExam {

	public static void main(String[] args) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();	//메서드명과 참조형 변수명이 같지만, 컴파일 오류 없음.
		
		try {
			System.out.println("결과 : " + evenOrOdd.evenOrOdd(-1));
			System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
		}catch(NumberCannotBeNegativeException e) {
			System.out.println(e.toString());
		}
	}

}
