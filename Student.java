class Student extends Person { // Student class extends Person class

    public static final String FRESHMAN = "Freshman"; 
    public static final String SOPHOMORE = "Sophomore"; 
    public static final String JUNIOR = "Junior"; 
    public static final String SENIOR = "Senior"; 
    private String status;
    // These strings will be used to store the status of the student.

    public Student(String name, String address, String phone, String emailAddress, String status) { // The public keyword is used to make the constructor accessible to other classes. The Student keyword is used to define the constructor. The parameters are the name, address, phone, emailAddress, and status of the student.

        super(name, address, phone, emailAddress); 
        this.status = status;
    } // This constructor will set the name, address, phone, emailAddress, and status of the student. The super keyword is used to call the constructor of the Person class.
    
    @Override
    public String toString() { 
    return "Class: Student, Name: " + name + ", Status: " + status;
    } 
} // This method will return the name and status of the student.
