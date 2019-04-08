package JV2_Ass_2;

public class Main {
    public static void main (String args[]){
        PersonModel<Student> objStudent= new PersonModel<>();
        objStudent.arrPerson.add(new Student(1,"H",23));
        objStudent.arrPerson.add(new Student(2,"F",30));
        for(Student x: objStudent.arrPerson){
            x.display();
        }

        PersonModel<Employee> objEmployee = new PersonModel<>();
        objEmployee.arrPerson.add(new Employee(1,"Ngoc",23.4));
        objEmployee.arrPerson.add(new Employee(2,"Nam",26.6));
        for(Employee x: objEmployee.arrPerson){
            x.display();
        }


    }
}
