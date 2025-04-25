class Person { // Person class

    protected String name; 
    protected String address; 
    protected String phone; 
    protected String emailAddress;
    // These strings will be used to store the name, address, phone number, and email address of the person.

    public Person(String name, String address, String phone, String emailAddress) { // This public constructor will set the name, address, phone number, and email address of the person which will be used in the subclasses as parameters.

        this.name = name; 
        this.address = address; 
        this.phone = phone; 
        this.emailAddress = emailAddress; 
    } // 

    @Override 
    public String toString() { 
    return "Class: Person, Name: " + name;
    } 
} // This method will return the name of the person.
