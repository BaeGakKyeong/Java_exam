package chp07ex01;

public class Machine {
	public void turnOn() {
		System.out.println("켰습니다.");
	}

	public void turnOff() {
		System.out.println("껐습니다.");
	}
}

class Car extends Machine{
}
