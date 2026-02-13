package chp10ex05;

public class NumberCannotBeNegativeException extends Exception {
	public NumberCannotBeNegativeException() {
		super("음수는 매개변수가 될 수 없습니다.");
	}
}
