package problem4;

public class Course {
	public String name, description;
	public int credits;
	public Course prerequisite;
	
	Course() {
	}
	
	Course(String name) {
		this.name = name;
	}
	
	Course(String name, String description) {
		this(name);
		this.description = description;
	}
	
	Course(String name, int credits) {
		this(name);
		this.credits = credits;
	}
	
	Course(String name, Course prerequisite) {
		this(name);
		this.prerequisite = prerequisite;
	}
	
	Course(String name, String description, int credits) {
		this(name, description);
		this.credits = credits;
	}
	
	Course(String name, int credits, String description) {
		this(name, description, credits);
	}
	
	Course(String name, int credits, Course prerequisite) {
		this(name, credits);
		this.prerequisite = prerequisite;
	}
	
	Course(String name, Course prerequisite, int credits) {
		this(name, credits, prerequisite);
	}
	
	Course(String name, String description, Course prerequisite) {
		this(name, description);
		this.prerequisite = prerequisite;
	}
	
	Course(String name, Course prerequisite, String description) {
		this(name, description, prerequisite);
	}
	
	Course(String name, String description, int credits, Course prerequisite) {
		this(name, description, credits);
		this.prerequisite = prerequisite;
	}
	
	public String toString() {
		String result = name;
		if (credits != 0)
			result += " − " + credits;
		if (description != null)
			result += "\nDescription: " + description;
		if (prerequisite != null)
			result += " / Prerequisite: " + prerequisite.name;
		return result + "\n";
	}
}
