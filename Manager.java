// Name: Replace with your full name
// ID: Replace with your student ID

// manager gets the higher hourly rate in calculateSalary (2500)
public class Manager extends Staff {
    private double bonus;

    public Manager(String firstName, String lastName, int deptNumber, double hoursWorked, double bonus) {
        super(firstName, lastName, deptNumber, hoursWorked);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public double calculateSalary() {
        double pay = (getHoursWorked() * 2500) + bonus; // hours * rate + bonus
        System.out.println("--- Manager pay ---");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Department Number: " + getDeptNumber());
        System.out.println("Salary: " + pay);
        return pay;
    }
}
