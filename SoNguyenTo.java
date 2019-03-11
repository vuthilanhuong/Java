package Session_1;

import java.util.Scanner;

public class SoNguyenTo {
    //1. Nhập 1 số từ bàn phím, kiểm tra xem có phải số nguyên tố hay không.
    public static void main(String[] args){
        System.out.println("Nhap 1 so nguyen tu ban phim: ");
        Scanner screen = new Scanner(System.in);
        int n;
        n= screen.nextInt();
        if (n==0 || n==1){
            System.out.println(n+ "la so nguyen to ");
        }
        else {
            if (check(n) == 0){
                System.out.println(n+ "la so nguyen to ");
            }
            else {
                System.out.println(n+ "KHONG la so nguyen to ");
            }
        }
    }
}
    //ham check so n co phai la so nguyen to hay khong?
    public static int check(int n){
        int count=0;
        for(int i=2; i<=n/2; i++)
            if(n%i==0){
                count++;
                break;
            };
        return count;
    };
}
