package Session_3;

public class SoNguyenTo {
    public int a;

    //Tao cac structor
    public SoNguyenTo() {
    }
    //Tao getter va setter
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    //Hàm boolean isSoNguyenTo(int x){} kiểm tra số x có phải số nguyên tố không.
    public boolean isSoNguyenTo(int x) {
        boolean check = true;//mac dinh la so nguyen to
        if (x == 0 || x == 1) {
            check = false;
        }
        else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    //1. public SoNguyenTo(int x)
    public void SoNguyenTo(int x) {
         if (isSoNguyenTo(x) == true){
              this.setA(x);
              System.out.println(x + " La so nguyen to");
         }else {
              System.out.println(x + " Khong phai la so nguyen to");
            }
    }


    //2. Hàm int timSoNguyenToTiepTheo(){}
    //tìm và trả về số nguyên tố liền sau số nguyên tố a.
    public int timSoNguyenToTiepTheo(int n){
        int check=0;
        int nextNumber = n +1;

        while (check==0){
            if (isSoNguyenTo(nextNumber)==false){
                nextNumber++;

            }
            else{
                check=1;
            }
        }
        System.out.println("so nguyen to tiep theo cua "+ n+ " la: "+ nextNumber );
        return nextNumber;
    }

    //Ham chinh
    public static void main(String[] args){
        SoNguyenTo obj = new SoNguyenTo();
        obj.SoNguyenTo(1);
        obj.SoNguyenTo(0);
        obj.SoNguyenTo(5);
        obj.SoNguyenTo(6);
        obj.timSoNguyenToTiepTheo(6);
        obj.timSoNguyenToTiepTheo(9);
        obj.timSoNguyenToTiepTheo(0);
    }
}
