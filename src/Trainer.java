/*
 * Francine Vo
 * CS 251
 * Student UIN: 01253035
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Trainer {

	// Create ArrayLists of the different Class's type
	static ArrayList<Clients> allClients = new ArrayList<>();
	static ArrayList<Exercises> allExercises = new ArrayList<>();
	static ArrayList<Gyms> allGyms = new ArrayList<>();

	public static void main(String[] args) {

		// Invoke methods in the Trainer class, which holds all functionality
		readExercises("Exercises.txt");
		readClientData("Clients.txt");
		readGyms("Gyms.txt");
		menu();
	}

	// Create methods that read in each separate file and add the elements to
	// the appropriate Array Lists
	public static void readClientData(String fileName) {

		try {
			Scanner in = new Scanner(new File(fileName));
			while (in.hasNextLine()) {
				String data = in.nextLine();
				String[] clientInfo = data.split(",");
				allClients.add(new Clients(clientInfo[0] + " " + clientInfo[1],
						Integer.parseInt(clientInfo[2]),
						Double.parseDouble(clientInfo[3]),
						Double.parseDouble(clientInfo[4]), clientInfo[5],
						clientInfo[6].split(";")));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Error with file!");
		}
	}

	public static void readExercises(String fileName) {
		try {
			Scanner in = new Scanner(new File(fileName));
			while (in.hasNextLine()) {
				String data = in.nextLine();
				String[] exercises = data.split(",");
				allExercises.add(new Exercises(exercises[0], exercises[1],
						exercises[2], Boolean.parseBoolean(exercises[3])));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File Error");
		}
	}

	public static void readGyms(String fileName) {
		try {
			Scanner in = new Scanner(new File(fileName));
			while (in.hasNextLine()) {
				String data = in.nextLine();
				String[] gyms = data.split(",");
				allGyms.add(new Gyms(gyms[0], gyms[1]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File Error");
		}
	}
	// Create a method that takes in user input, matches the exercises with
	// the client's exercises, then outputs results from Exercises class to
	// console
	public static void search() {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Client's name(First and Last)");
			String name = in.nextLine();
			for (Clients client : allClients) {
				if (name.equalsIgnoreCase(client.getName())) {
					System.out.println(name + "'s Exercises:");

					for (String clientExercise : client.getExercises())
						for (Exercises exercise : allExercises) {
							if (exercise.name.equals(clientExercise)) {
								System.out.printf("%-15s%-10s%-12s%-10b%n",
										exercise.name, exercise.type,
										exercise.muscle, exercise.machine);
							}
						}
				}
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.err.println("Improper input");
		}
	}

	// Create a menu method that takes in the user input and outputs results to
	// console
	public static void menu() {

		try (Scanner in = new Scanner(System.in)) {
			System.out.println(
					"1. Print all Clients\n2. Print all Exercises\n3. Print all Gyms\n4. Print a Client's Exercises\n5. Exit");
			int input = in.nextInt();
			switch (input) {
				case 1 :
					for (Clients client : allClients)
						System.out.println(client);
					break;
				case 2 :
					for (Exercises exercise : allExercises)
						System.out.println(exercise);
					break;
				case 3 :
					for (Gyms gym : allGyms)
						System.out.println(gym);
					break;
				case 4 :
					search();
					break;
				case 5 :
					break;
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.err.println("Invalid input");
		}
	}
}