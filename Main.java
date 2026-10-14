public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new OfficeEmployee("An", 10000000);
        employees[1] = new TechnicalEmployee("Binh", 10000000);

        for (Employee e : employees) {
            System.out.println(e.getName() + " - Luong: " + (long) e.calculateSalary());
        }
    }
}