package chp07ex08;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Bus();
		
		car.run();
		((Bus)car).announcements();
		
		/*혹은 다음과 같이 사용한다.
		 * Bus bus = null;
		 * bus = (Bus)car;
		 * bus.announcements();
		 */
	}

}
