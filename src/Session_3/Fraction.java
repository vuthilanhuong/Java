package Session_3;

import java.util.Scanner;

public class Fraction {
    public int numerator;
    public int denominator;


    //constructor and getter
    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    };

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //1.input fraction and print fraction
    public void inputFraction(){
        System.out.println("Nhap tu so: ");
        Scanner screen = new Scanner(System.in);
        this.setNumerator(screen.nextInt());
        System.out.println("Nhap mau so: ");
        this.setDenominator(screen.nextInt());
    }

    public void printFraction(){
        System.out.println("Phan so ban vua nhap la: "+
                this.getNumerator()+"/"+this.getDenominator());

    }

    //2. Rut gon phan so
    public void rutGon(){
        int min= Math.min(getNumerator(),getDenominator());
        int mauSoChung = 0;
        for (int i=2; i<=min; i++) {
            if (this.numerator % i == 0 & this.denominator % i == 0) {
                mauSoChung = i;
            }
        };

        if (mauSoChung!=0){
            System.out.println("Phan so "+numerator+"/"+denominator+
                    " chua toi gian!");
            this.numerator= this.numerator/mauSoChung;
            this.denominator= this.denominator/mauSoChung;
            System.out.println("Phan so duoc rut gon la: "+
                    this.numerator+"/"+this.denominator);

        }else {
            System.out.println("Phan so "+numerator+"/"+denominator+" da toi gian!");
            };
    }

    //3.nghich dao phan so
    public void nghichDao(){
        if (getNumerator()==0){
            System.out.println("Khong nghich dao duoc!");
        }
        else{
            System.out.println("Phan so nghich dao: "+
                    getDenominator()+"/"+getNumerator());
        }
    };
    //4. Cac phep tinh 2 phan so voi nhau
    public void plus(int t1, int m1, int t2, int m2){
        long Ts,Ms;
        if (t1==0){
            Ts=t2;   Ms=m2;
        }
        else {
            if (t2==0){
                Ts=t1;   Ms=m1;
            }
            else{
                Ts= t1*m2+t2*m1;
                Ms= m1*m2;
            }
        }
        System.out.println("Tong hai phan so: "
                        +Ts+"/"+Ms);
    }

    public void minus(int t1, int m1, int t2, int m2){
        long Ts,Ms;
        if (t1==0){
            Ts=-t2;   Ms=m2;
        }
        else {
            if (t2==0){
                Ts=t1;   Ms=m1;
            }
            else{
                Ts= Ts= t1*m2-t2*m1;
                Ms= m1*m2;
            }
        }
        System.out.println("Hieu hai phan so: "
                +Ts+"/"+Ms);
    }

    public void multiply(int t1, int m1, int t2, int m2){
        long Ts,Ms;
        if(t1==0||t2==0){
            System.out.println("Tichs hai phan so: 0 ");
        }
        else{
            Ts= t1*t2;
            Ms= m1*m2;
            System.out.println("Tichs hai phan so: "
                    +Ts+"/"+Ms);
        }
    }

    public void divide(int t1, int m1, int t2, int m2){
        long Ts, Ms;
        if (t2==0){
            System.out.println("khong chia duoc");
        }
        else{
            if(t1==0){
                System.out.println("Thuong hai phan so: 0 ");
            }
            else {
                Ts= t1*m2;
                Ms= m1*t2;
                System.out.println("Thuong hai phan so: "
                        +Ts+"/"+Ms);
            }
        };
    }
    //main function
    public static void main(String[] args){
        Fraction obj = new Fraction();
//        obj.inputFraction();
//        obj.printFraction();
//        obj.rutGon();


        Fraction obj1 = new Fraction(0,3);
        Fraction obj2 = new Fraction(2,8);
        obj1.nghichDao();

        if (obj1.getDenominator()==0||obj2.getDenominator()==0){
            System.out.println("phan so khong hop le!");
        }
        else {
            obj1.rutGon();
            obj2.rutGon();
            obj.plus(obj1.getNumerator(),obj1.getDenominator(),
                    obj2.getNumerator(),obj2.getDenominator());
            obj.minus(obj1.getNumerator(),obj1.getDenominator(),
                    obj2.getNumerator(),obj2.getDenominator());
            obj.multiply(obj1.getNumerator(),obj1.getDenominator(),
                    obj2.getNumerator(),obj2.getDenominator());
            obj.divide(obj1.getNumerator(),obj1.getDenominator(),
                    obj2.getNumerator(),obj2.getDenominator());
        };

    }
}
