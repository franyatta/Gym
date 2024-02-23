/**
 * Francine Vo
 * CS 251
 * Student UIN: 01253035
 * January 26th, 2024
 */
public class Exercises {
	String name;
	String type;
	String muscle;
	boolean machine;

	public Exercises() {
		name = "";
		type = "";
		muscle = "";
		machine = true;
	}

	public Exercises(String name, String type, String muscle, boolean machine) {
		this.name = name;
		this.type = type;
		this.muscle = muscle;
		this.machine = machine;

	}

	public String toString() {
		String result = "Exercise: " + name + "\nType: " + type + "\nMuscle: " + muscle + "\nUses Machine?: " + machine + "\n";
		return result;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMuscle() {
		return muscle;
	}

	public void setMuscle(String muscle) {
		this.muscle = muscle;
	}

	public boolean isMachine() {
		return machine;
	}

	public void setMachine(boolean machine) {
		this.machine = machine;
	}
}
