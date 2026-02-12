package chp10ex01;

public class MyCheckedException extends Exception {
	public MyCheckedException() {
		super("나누어 떨어지는 수가 없습니다.");
	}
}
