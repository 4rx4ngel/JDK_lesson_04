public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        Employee employee1 = new Employee("Кирилл", 127303,"89231234567", 24);
        Employee employee2 = new Employee("Михаил", 127321,"89131247586", 11);
        Employee employee3 = new Employee("Алексей",127346,"89231654879", 20);
        Employee employee4 = new Employee("Олег",127895,"89676055417",13);
        Employee employee5 = new Employee("Дмитрий",128999,"89836548912",15);
        Employee employee6 = new Employee("Михаил",127654,"89029728272",16);
        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);
        employeeDirectory.addEmployee(employee3);
        employeeDirectory.addEmployee(employee4);
        employeeDirectory.addEmployee(employee5);
        employeeDirectory.addEmployee(employee6);
        System.out.println("Фильтр по стажу:");
        System.out.println(employeeDirectory.searchByExperience(20));
        System.out.println();
        System.out.println("Фильтр по имени: ");
        System.out.println(employeeDirectory.searchByName("Михаил"));
        System.out.println();
        System.out.println("Фильтр по табельному: ");
        System.out.println(employeeDirectory.searchByPersonnelNumber(127303));
    }
}