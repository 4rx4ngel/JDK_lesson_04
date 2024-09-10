import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> searchByExperience(int exp) {
        List<Employee> emplFiltByExp = new ArrayList<>();
        for (Employee e : employees) {
            if (exp <= e.getExperience()) {
                emplFiltByExp.add(e);
            }
        }
        return emplFiltByExp;
    }

    public List<String> searchByName(String name) {
        List<String> emplPhoneNumber = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                emplPhoneNumber.add(e.getPhoneNumber());
            }
        }
        return emplPhoneNumber;
    }

    public List<Employee> searchByPersonnelNumber(int personnelNumber) {
        List<Employee> emlFiltByPersNumb = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getPersonnelNumber() == personnelNumber) {
                emlFiltByPersNumb.add(e);
            }
        }
        return emlFiltByPersNumb;
    }

}
