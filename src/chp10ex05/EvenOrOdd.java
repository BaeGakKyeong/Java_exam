package chp10ex05;

public class EvenOrOdd {

	String evenOrOdd(int num) throws NumberCannotBeNegativeException {
		if(num < 0) {
			throw new NumberCannotBeNegativeException();
		}
		return (num % 2 == 0) ? "Even" : "Odd";
	}
}
