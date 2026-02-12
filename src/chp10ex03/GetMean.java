package chp10ex03;

public class GetMean {

	public int getMean(int[] array) {
		int sum = 0;
		int avg;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		avg = sum / array.length;
		return avg;
	}
	public static void main(String[] args) {
		GetMean getMean = new GetMean();
		int[] x = {5, 4, 3};
		
		System.out.println("평균값 : " + getMean.getMean(x));
	}

}
