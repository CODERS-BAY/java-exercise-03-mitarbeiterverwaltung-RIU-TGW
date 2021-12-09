package app.src.main.java.application;

public class App {

    public static void main(String[] args) {
        Department defaultDepartment = new Department("Test", 123, "Neverland", "Gotham" );
        defaultDepartment.print();

        Employee defaultEmployee = new Employee("Max", "Mustermann", 123, "Test");
        defaultEmployee.print();
    }

    /*
    * for the bonus task
    *
    * private static int generateID() {}
    *
    */

    /*
     * for the console application
     *
     * private static void application() {}
     *
     */

  }
