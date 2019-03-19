package Session_2;

import java.util.Scanner;

public class SinhVien {
    public String maSV;
    public float diemTB;
    public int tuoi;
    public String lop;

    public SinhVien() {
    }

    public SinhVien(String maSV, float diemTB, int tuoi, String lop) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    //1. Nhap thong tin sinh vien
    public void inputInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        this.setMaSV(sc.hasNextLine()?sc.nextLine():"D00534");

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
