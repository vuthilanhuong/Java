package Session_2;

import java.util.Scanner;

public class SinhVien {
    public String maSV;
    public float diemTB;
    public int tuoi;
    public String lop;

    //1. Nhap thong tin sinh vien
    public void inputInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextLine();

        System.out.println("Nhap diem trung binh: ");
        diemTB = sc.nextFloat();

        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();

        sc.nextLine();
        System.out.println("Nhap ma lop: ");
        lop = sc.nextLine();
}

    //2. In ra thong tin sinh vien
    public void showInfo(){
        System.out.println("Thong tin sinh vien ban vua nhap");
        System.out.println("maSV: "+ this.maSV);
        System.out.println("diemTB: "+ this.diemTB);
        System.out.println("tuoi: "+ this.tuoi);
        System.out.println("maLop: "+ this.lop);
    }

    //3. Xet hoc bong
    public void xetHocBong(){
        if (this.diemTB>=8) {
            System.out.println("DUOC HOC BONG");
        } else {
            System.out.println("KHONG DAT");
        }
    }

    // Main
    public static void main(String[] args){

        SinhVien myObj = new SinhVien();
        myObj.inputInfo();
        myObj.showInfo();
        myObj.xetHocBong();
    }
}
