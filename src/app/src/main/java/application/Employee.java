package app.src.main.java.application;

public class Employee {
    // fields
    String firstName;
    String lastName;
    int id;
    final Department dept;

    public Employee(String firstName, String lastName, int id, Department dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dept = dept;
    }

    public void print() {
        System.out.println();
        System.out.println("Employee information:");
        System.out.println(String.format("   First name: %10s", firstName));
        System.out.println(String.format("   Second name: %10s", lastName));
        System.out.println(String.format("   ID: %10d", id));
        System.out.println(String.format("   Department: %10s", dept));
    }

    //public boolean isEquals(Employee other) {
    //    return false;
    //}
}