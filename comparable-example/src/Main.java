import java.util.*;

class Employee implements Comparable<Employee>{
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
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && salary == employee.salary && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary- o.salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Anjali",10000,10));
        employeeList.add(new Employee("Rutuja",80000,10));
        employeeList.add(new Employee("Pravin",15000,10));

        Collections.sort(employeeList);
        System.out.println(employeeList);

       // employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList()
        // .forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(employee -> employee.salary)).toList()
                .forEach(employee -> System.out.println(employee) );
    }
}

