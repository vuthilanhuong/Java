package Session_3;

public class TamGiac {
    public int c1;
    public int c2;
    public int c3;

    public void setTamGiac(int c1, int c2, int c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }

    public int getC3() {
        return c3;
    }

    public TamGiac() {
    }

    //kiem tra co phai tam giac khong
    public boolean checkTG (int c1, int c2, int c3){
        boolean  check= true;
        if ((c1+c2)<=c3) check= false;
        if ((c1+c3)<=c2) check= false;
        if ((c2+c3)<=c1) check= false;

        if (Math.abs(c1-c2)>c3) check =false;
        if (Math.abs(c1-c3)>c2) check =false;
        if (Math.abs(c3-c2)>c1) check =false;

        return check;

    }
    //tinh chu vi, dien tich
    public int chuVi(){
        int C = this.c1 +this.c2 + this.c3;
        return C;
    }

    public double dienTich(){
        int p = (this.c1 +this.c2 + this.c3)/2;
        double S = Math.sqrt(p*(p-this.c1)*(p-this.c2)*(p-this.c3));
        return S;
    }

    //ham main
    public static void main(String[] args){
        TamGiac obj= new TamGiac();
        obj.setTamGiac(22,33,44);

        System.out.println(obj.checkTG(obj.getC1(),obj.getC2(),obj.getC3()));

        if (obj.checkTG(obj.getC1(),obj.getC2(),obj.getC3())== true){
            System.out.println("chu vi tam giac: " +obj.chuVi());
            System.out.println("dien tich tam giac: " +obj.dienTich());
        }
        else {
            System.out.println("Khong phai 3 canh tam giac!");
        }

    }

}
