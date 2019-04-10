package JV2_Ass_3;

public class Main {
    public static void main (String args[]){
        Runable1 r1= new Runable1();
        Thread th1= new Thread(r1);
        th1.start();

        Runable2 r2= new Runable2();
        Thread th2= new Thread(r2);
        th2.start();

        Runable3 r3= new Runable3();
        Thread th3= new Thread(r3);
        th3.start();


    }
}
