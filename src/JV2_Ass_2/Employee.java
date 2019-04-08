package JV2_Ass_2;

public class Employee {
    Integer id;
    String name;
    Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void display(){
        System.out.print("ID:"+ this.getId());
        System.out.print(" Name:"+ this.getName());
        System.out.println(" Salary:"+ this.getSalary());
    }
}
