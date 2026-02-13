package chp10ex05;

public class EvenOrOdd {

	String evenOrOdd(int num) {
		if(num % 2 == 0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
	public static void main(String[] args) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();	//메서드명과 참조형 변수명이 같지만, 컴파일 오류 없음.
		
		System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
		System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
	}

}
