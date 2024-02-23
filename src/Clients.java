/**
 * Francine Vo
 * CS 251
 * Student UIN: 01253035
 * January 26th, 2024
 */
public class Clients {

	private String name;
	private int age;
	private double weight;
	private double height;
	private String gymName;
	private String[] exercises;

	public Clients() {

		name = "";
		age = 0;
		weight = 0.0;
		height = 0.0;
		gymName = "";
		exercises = null;

	}
	public Clients(String name, int age, double weight, double height,
			String gymName, String[] exercises) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.gymName = gymName;
		this.exercises = exercises;
	}

	public String toString() { // Override the toString methods in the classes
								// for enhanced visibility
		String result = "Name: " + name + "\n" + "Age: " + age + "\n"
				+ "Weight: " + weight + "\n" + "Height: " + height + "\n"
				+ "Gym Name: " + gymName + "\n";

		return result;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getGymName() {
		return gymName;
	}
	public void setGymName(String gymName) {
		this.gymName = gymName;
	}
	public String[] getExercises() {
		return exercises;
	}
	public void setExercises(String[] exercises) {
		this.exercises = exercises;
	}
}
