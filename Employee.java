class Employee extends Person { // Employee class extends Person class

    protected String office; 
    protected double salary; 
    protected MyDate dateHired; 
    // These strings will be used to store the office, salary, and date hired of the employee.

    public Employee(String name, String address, String phone, String emailAddress, String office, double salary, MyDate dateHired) { // The public keyword is used to make the constructor accessible to other classes. The Employee keyword is used to define the constructor. The parameters are the name, address, phone, emailAddress, office, salary, and date hired of the employee.

        super(name, address, phone, emailAddress); 
        this.office = office; 
        this.salary = salary; 
        this.dateHired = dateHired; 
    } // These two constructors will set the name, address, phone, emailAddress, office, salary, and date hired of the employee. The super keyword is used to call the constructor of the Person class.

    @Override 
    public String toString() { 
    return "Class: Employee, Name: " + name + ", Hired: " + dateHired.toString();
    }
}
