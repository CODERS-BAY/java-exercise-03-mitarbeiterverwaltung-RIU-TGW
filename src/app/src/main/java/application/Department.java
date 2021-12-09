package application;

public class Department {
	// fields
	private String name;
	private int id;
	private String counter;
	private String city;

	// Constructors

	public Department() {

	}

	public Department(String name, int id, String counter, String city) {
		this.name = name;
		this.id = id;
		this.counter = counter;
		this.city = city;
	}

	public boolean isEquals(Department other) {
		return false;
	}
}
