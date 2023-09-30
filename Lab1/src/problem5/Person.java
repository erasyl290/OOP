package problem5;

public class Person {
	Gender gender;

	Person() {
		gender = Gender.MALE;
	}

	Person(Gender gender) {
		this.gender = gender;
	}

	Person(char sex) {
		if (sex == 'B')
			gender = Gender.MALE;
		else if (sex == 'G')
			gender = Gender.FEMALE;
	}

	public String toString() {
		if (gender == Gender.FEMALE)
			return "G";
		return "B";
	}
}
