class Staff extends Employee { // Staff class extends Employee class

    private String title;
    public Staff(String name, String address, String phone, String emailAddress, String office, double salary, MyDate dateHired, String title) { // The public keyword is used to make the constructor accessible to other classes. The Staff keyword is used to define the constructor. The parameters are the name, address, phone, emailAddress, office, salary, date hired, and title of the staff member.

        super(name, address, phone, emailAddress, office, salary, dateHired);
        this.title = title; 
    } // This constructor will set the name, address, phone, emailAddress, office, salary, date hired, and title of the staff member. The super keyword is used to call the constructor of the Employee class.

    @Override 
    public String toString() {
    return "Class: Staff, Name: " + name + ", Title: " + title;
    }
} // This method will return the name and title of the staff member.
