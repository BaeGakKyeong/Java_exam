package chp09ex03;

public class ExceptionExam {
	public int get50thItem(int[] array) throws IllegalArgumentException {
		if(array.length < 50) {
			throw new IllegalArgumentException("배열의 크기가 50보다 작습니다.");
		}
		return array[49];
	}
}
