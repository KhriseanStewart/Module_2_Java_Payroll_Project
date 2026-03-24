// Name: Replace with your full name
// ID: Replace with your student ID

import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Assignment 2 — quick test run");
        System.out.println();

        // Staff is abstract now so you cant do new Staff() anymore — old lab stuff left here for reference
        // Staff obj1 = new Staff("John", "Brown", 101, 40);
        // obj1.display();

        Manager mgr = new Manager("Alicia", "Grant", 100, 42, 18000);
        SalesRep rep1 = new SalesRep("Devon", "Blake", 200, 38, 7000);

        System.out.println("one manager:");
        mgr.display();
        System.out.println();

        System.out.println("one sales rep:");
        rep1.display();
        System.out.println();

        ArrayList<SalesRep> repList = new ArrayList<>();
        repList.add(new SalesRep("Troy", "Miller", 201, 40, 5500));
        repList.add(new SalesRep("Keisha", "Wright", 202, 36, 6000));
        repList.add(new SalesRep("Andre", "Lewis", 203, 41, 6500));
        repList.add(new SalesRep("Marsha", "Hall", 204, 39, 5800));
        repList.add(new SalesRep("Renee", "King", 205, 37, 6200));

        System.out.println("iterator thing — 5 reps:");
        Iterator<SalesRep> it = repList.iterator();
        int n = 1;
        while (it.hasNext()) {
            System.out.println("rep #" + n);
            it.next().display();
            System.out.println();
            n++;
        }

        System.out.println("polymorphism part (same list diff types):");
        ArrayList<Staff> everyone = new ArrayList<>();
        everyone.add(mgr);
        everyone.add(rep1);
        everyone.add(new Manager("Nadia", "Campbell", 101, 45, 20000));
        everyone.add(new SalesRep("Omar", "Dixon", 206, 35, 5000));

        for (Staff s : everyone) {
            System.out.println("actual type at runtime: " + s.getClass().getSimpleName());
            s.display();
            System.out.println();
        }

        System.out.println("salary methods:");
        rep1.calculateSalary();
        System.out.println();
        mgr.calculateSalary();
    }
}
