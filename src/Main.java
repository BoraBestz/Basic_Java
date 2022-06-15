public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("01","Best",1500000.0);
        Employee e2 = new Employee();
        e2.setId("02");
        e2.setName("Best za");
        e2.setSalary(500000.0);
        e1.displayEmployee();
        e2.displayEmployee();
        Programmer e3 = new Programmer();
        e3.skill("Java");
        e3.bonus();
    }
}
