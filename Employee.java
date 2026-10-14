class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public String getName() {
        return name;
    }
}

class OfficeEmployee extends Employee {
    public OfficeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 1000000;
    }
}

class TechnicalEmployee extends Employee {
    public TechnicalEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 2000000;
    }
}

