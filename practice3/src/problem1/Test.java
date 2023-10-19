package problem1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat entity = new Cat("Monya", 4);
		System.out.println(entity);
		
		entity.setGender(Gender.FEMALE);
		entity.ageChange();
		entity.grow(3);
		System.out.println(entity);
	}

}