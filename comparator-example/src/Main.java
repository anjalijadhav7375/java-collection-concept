import java.util.*;

class Employee{
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeComparatorBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary- o2.salary;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Anjali",10000,10));
        employeeList.add(new Employee("Rutuja",80000,10));
        employeeList.add(new Employee("Pravin",15000,10));

         /*
        The lambda expression (o1, o2) -> o1.salary- o2.salary
        This provides implementation for compare method of functional interface Comparator
        The lambda has no name and doesn't belong to any class.
        This lambda is in the form of (parameter1, parameter2) -> expression
         */

      //  Collections.sort(employeeList,(o1, o2) -> o1.salary- o2.salary);

        EmployeeComparatorBySalary employeeComparatorBySalary = new EmployeeComparatorBySalary();
        Collections.sort(employeeList,employeeComparatorBySalary);
        System.out.println(employeeList);

     //   employeeList.stream().sorted(Comparator.comparing(employee -> employee.salary)).toList()
             //   .forEach(employee -> System.out.println(employee));
    }
}