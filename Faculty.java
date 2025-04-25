class Faculty extends Employee { // Faculty class extends Employee class

    private String officeHours; 
    private String rank;
    // These strings will be used to store the office hours and rank of the faculty.

    public Faculty(String name, String address, String phone, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) { // The public keyword is used to make the constructor accessible to other classes. The Faculty keyword is used to define the constructor. The parameters are the name, address, phone, emailAddress, office, salary, date hired, office hours, and rank of the faculty.

        super(name, address, phone, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours; 
        this.rank = rank; 
        // This constructor will set the name, address, phone, emailAddress, office, salary, date hired, office hours, and rank of the faculty. The super keyword is used to call the constructor of the Employee class.

    } 
    @Override 
    public String toString() { 
    return "Class: Faculty, Name: " + name + ", Rank: " + rank + ", Office Hours: " + officeHours;
    }
} // This method will return the name, rank, and office hours of the faculty.
