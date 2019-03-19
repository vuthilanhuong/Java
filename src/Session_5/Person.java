package Session_5;
import java.util.Scanner;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Calendar;
//import java.util.Date;
//import java.time.format.DateTimeFormatter;
public class Person {
    public String ten;
    public Integer gioiTinh; //1 la con gai; 0 la con trai
    public String ngaySinh;
    public String diaChi;

    public Person() {
    }

    public Person(String ten, Integer gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    //Nhap thong tin tu ban phim
    public void inputInfo(){
        System.out.println("Nhap thong tin:");
        Scanner sc =new Scanner(System.in);
        System.out.print("Ten: ");
        this.setTen(sc.nextLine());
        System.out.print("Gioi tinh: ");
        this.setGioiTinh(sc.nextInt());
        System.out.print("Ngay sinh (dd/mm/yyyy): ");
        this.setNgaySinh(sc.nextLine());
        sc.nextLine();
        System.out.print("Dia chi: ");
        this.setDiaChi(sc.nextLine());
    }

    public void showInfo(){
        System.out.println("Thong tin sinh vien: ");
        System.out.println("Ten: "+ this.getTen());
        System.out.println("Gioi tinh: "+ this.getGioiTinh());
        System.out.println("Ngay sinh (dd/mm/yyyy): "+this.getNgaySinh());
        System.out.println("Dia chi: "+ this.getDiaChi());
    }

    public static void main(String[] args){
        Person obj= new Person("Huong", 1, "12/12/1990", "HaNoi");

        obj.inputInfo();
        obj.showInfo();


    }
}
