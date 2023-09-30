package problem5;

import java.util.Vector;

public class DragonLaunch {
	Vector<String> line = new Vector<String>();
	
	DragonLaunch(){
	}

	void kidnap(Person person) {
		line.add(person.toString());
	}

	boolean willDragonEatOrNot(){
		for (int i = 0; i < line.size() / 2; i++) {
			if (line.elementAt(i) == "G" || line.elementAt(i) == line.elementAt(line.size() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
