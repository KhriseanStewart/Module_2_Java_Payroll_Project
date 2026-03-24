// Name: Replace with your full name
// ID: Replace with your student ID

// sales rep uses 1500 per hour in the formula + allowance
public class SalesRep extends Staff {
    private double allowance;

    public SalesRep(String firstName, String lastName, int deptNumber, double hoursWorked, double allowance) {
        super(firstName, lastName, deptNumber, hoursWorked);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Allowance: " + allowance);
    }

    @Override
    public double calculateSalary() {
        double pay = (getHoursWorked() * 1500) + allowance;
        System.out.println("--- Sales rep pay ---");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Department Number: " + getDeptNumber());
        System.out.println("Salary: " + pay);
        return pay;
    }
}
