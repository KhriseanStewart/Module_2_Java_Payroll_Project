# Module 2 Graded Assignment (Java)

This is my college assignment project for Module 2.
It shows inheritance, abstract classes, and a little polymorphism using `Staff`, `Manager`, and `SalesRep`.

## Files in this project

- `Staff.java` - abstract base class with common fields and methods
- `Manager.java` - extends `Staff` and adds bonus-based salary logic
- `SalesRep.java` - extends `Staff` and adds allowance-based salary logic
- `Tester.java` - main test file that runs everything

## How to compile

I’m sending all compiled `.class` files into an `out` folder:

```bash
mkdir -p out
javac -d out Staff.java Manager.java SalesRep.java Tester.java
```

## How to run

```bash
java -cp out Tester
```

## What this program shows

- Creating `Manager` and `SalesRep` objects
- Using `ArrayList` + `Iterator`
- Polymorphism with an `ArrayList<Staff>`
- Salary calculation methods in both subclasses
