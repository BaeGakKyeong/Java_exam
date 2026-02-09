package chp07ex04;

public class Car extends Machine {

	@Override
	public void turnOn() {
		System.out.println("켰습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("껐습니다.");

	}

}
