import java.util.Calendar; // Import the Calendar class
class MyDate { // MyDate class

    private int year; 
    private int month;
    private int day; 
    public MyDate() { // These integers will be used to store the current date of the system.

        Calendar cal = Calendar.getInstance(); 
        this.year = cal.get(Calendar.YEAR); 
        this.month = cal.get(Calendar.MONTH); 
        this.day = cal.get(Calendar.DAY_OF_MONTH); 
    } // This constructor will set the date to the current date of the system.

    public MyDate(int year, int month, int day) { 
        this.year = year; 
        this.month = month; 
        this.day = day; 
    } // This constructor will set the date to the specified date.

    public int getYear() { return year; } 
    public int getMonth() { return month; } 
    public int getDay() { return day; }
    // These methods will return the year, month, and day of the date.

    @Override // The override annotation is used to indicate that this method overrides a method in the superclass.
    public String toString() { 
    return (month + 1) + "/" + day + "/" + year;
    }
} // This method will return the date in the format MM/DD/YYYY.
