package problem3;

public class TestTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature temp = new Temperature();
		System.out.println(temp);
		temp.setDegree(100);
		temp.setScale('F');
		System.out.println(temp.inCelsius());
		System.out.println(temp.inFarenheit());
		
		Temperature t = new Temperature('F');
		System.out.println(t);
	}

}
