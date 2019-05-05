package JV2_Practice_Thread;

public class Main {
    public static void main (String args[]){
        //Cach 1: Creat SubThread
            MyThread th = new MyThread();
            th.start();

        //Cach 2: Creat Runnable (In)
            Runnable r1 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Creat Runnable 1");
                }
            };
            Thread th1 = new Thread(r1);
            th1.start();


            //wait
            try{
                System.out.println("wait!");
                th1.wait(10000);
            }catch (Exception e){}

            //syncrinize


        //Cach 3: Creat Runnable (Out)
//            MyRunnable r2= new MyRunnable();
//            Thread th2= new Thread(r2);
//            th2.start();
        Thread th2= new Thread(new MyRunnable());
        th2.start();
        System.out.println("Thread 2:");
        System.out.println(th2.getName());
        th2.setName("Huong's thread!");
        System.out.println(th2.getName());
        th2.setDaemon(true);
        th2.isAlive();

    }
}
