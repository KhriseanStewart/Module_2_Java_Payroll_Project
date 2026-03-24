// Name: Replace with your full name
// ID: Replace with your student ID

// base class for manager + sales rep — abstract so you have to subclass it
public abstract class Staff {
    private String firstName;
    private String lastName;
    private int deptNumber;
    private double hoursWorked;

    public Staff(String firstName, String lastName, int deptNumber, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(int deptNumber) {
        this.deptNumber = deptNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Department Number: " + deptNumber);
        System.out.println("Hours Worked: " + hoursWorked);
    }

    public abstract double calculateSalary();
}
