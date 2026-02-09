package chp07ex07;

public class GasStation {

	public static void main(String[] args) {
		GasStation gasStation = new GasStation();
		Suv suv = new Suv("suv");
		Truck truck = new Truck("Truck");
		Bus bus = new Bus("Bus");
		
		gasStation.fill(suv);
		gasStation.fill(truck);
		gasStation.fill(bus);
	}

	public void fill(Car car) {
		System.out.println(car.name + "에 기름을 넣습니다.");
		
		car.gas += 10;
		System.out.println("기름이 " + car.gas + "리터 들어있습니다.");
	}
}
