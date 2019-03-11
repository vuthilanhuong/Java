package Session_2;

import java.util.Scanner;

public class NhanVien {
    public String ten;
    public int tuoi;
    public double tienLuong;
    public String diaChi;
    public int tongSoGioLam;

    //1.Nhap thong tin tu ban phim
    public void inputInfo(){
        System.out.println("Nhap ten: ");
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();

        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();

        System.out.println("Nhap tien luong: ");
        tienLuong = sc.nextDouble();

        System.out.println("Nhap tong so gio lam: ");
        tongSoGioLam = sc.nextInt();
    };

    //2. In thong tin nhan vien
     public void printInfo(){
        System.out.println("Thong tin nhan vien ban vua nhap");
        System.out.println(ten);
    }

    //3. tinh thuong
    public void tinhThuong(){
        System.out.println("Phan thuong ban duoc nhan la:");
        double thuong;
        int i;
        i = this.tongSoGioLam;
        if (i>=200){
            thuong= this.tienLuong*20/100;
        }
        else {
            if(i<100) {
                thuong = 0;
            }
            else {
                thuong= this.tienLuong*10/100;
            }

        }
        System.out.println(thuong);

    }

    //4. Ham chinh
    public static void main(String[] args){

        NhanVien myObj1 = new NhanVien();
        myObj1.inputInfo();
        myObj1.printInfo();
        myObj1.tinhThuong();
    }

}
