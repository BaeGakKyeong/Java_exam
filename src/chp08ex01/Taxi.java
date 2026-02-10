package chp08ex01;

public class Taxi implements Meter {
	
	@Override
	public void start() {
		System.out.println("출발합니다.");
	}

	@Override
	public int stop(int distance) {
		System.out.println("도착했습니다.");
		return distance * 2;
	}

}
