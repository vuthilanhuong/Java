package Session_5;

public class Student extends Person {
    public Student() {
    }

    public Student(String ten, Integer gioiTinh, String ngaySinh, String diaChi) {
        super(ten, gioiTinh, ngaySinh, diaChi);
    }


    public void checkAge(){
        System.out.println("Check Tuoi");
        String namSinhStr= this.getNgaySinh().replaceAll("\\s","");
        System.out.println(namSinhStr.length());
        namSinhStr= namSinhStr.substring(6,10);
        Integer tuoi = 2019- Integer.parseInt(namSinhStr);

        System.out.println("Tuoi cua sinh vien:"+ tuoi);
    }
    public static void main(String[] args){
        Student objStudent = new Student("Huong", 1, "12/12 /1990", "HaNoi");
//        Student objStudent = new Student();
//        objStudent.inputInfo();
        objStudent.showInfo();
        objStudent.checkAge();
    }
}
