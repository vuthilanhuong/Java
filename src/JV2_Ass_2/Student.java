package JV2_Ass_2;

public class Student {
    Integer id;
    String name;
    Integer age;

    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void display(){
        System.out.print("ID:"+ this.getId());
        System.out.print(" Name:"+ this.getName());
        System.out.println(" Age:"+ this.getAge());
    }
}
