package chp09ex02;

public class ExamExam {

	public static void main(String[] args) {
		ExceptionExam exam = new ExceptionExam();
		
		try {
			int num = exam.get50thItem(new int[30]);
			System.out.println("array 배열의 50번째 요소의 값: " + num);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기가 50보다 작습니다. " + e.toString());
		}
		
	}

}
