package chp08ex02;

public interface Meter {
	//public int BASE_FARE = 3000;	인터페이스에 선언된 변수는 스태틱 변수로써, 값을 변경할 수 없다.
	
	public void start();
	public int stop(int distance);
}
