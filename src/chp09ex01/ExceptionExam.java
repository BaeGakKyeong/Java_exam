package chp09ex01;

public class ExceptionExam {
	public static void main(String[] args) {
	
		try {
			int[] array = new int[10];
			array[20] = 10;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 범위를 지나쳤어요. " + e.toString());
		}
		
		System.out.println("성공"); 
	}
}
