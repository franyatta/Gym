/**
 * Francine Vo
 * CS 251
 * Student UIN: 01253035
 * January 26th, 2024
 */
public class Gyms {

	String name;
	String address;

	public Gyms() {
		name = "";
		address = "";
	}
	public Gyms(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String toString() {
		String result = "Gym Name: " + name + "\nGym Address: " + address
				+ "\n";
		return result;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}