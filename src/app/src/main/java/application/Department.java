package app.src.main.java.application;

public class Department {
	// fields
	String name;
	int id;
	String country;
	String city;

	// Constructors
	public Department(String name, int id, String country, String city) {
		this.name = name;
		this.id = id;
		this.country = country;
		this.city = city;
	}

	public void print() {
		System.out.println();
		System.out.println("Department information:");
		System.out.println(String.format("  Name: %10s", name));
		System.out.println(String.format("  ID: %10d", id));
		System.out.println(String.format("  Country: %10s", country));
		System.out.println(String.format("  City: %10s", city));
	}
	//public boolean isEquals(Department other) {
	//	return false;
	//}
}
