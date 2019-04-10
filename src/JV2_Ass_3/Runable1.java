package JV2_Ass_3;

public class Runable1 implements Runnable {
    public void run(){
        try{
            for(int i=1; i<=50; i++){
                System.out.println("Thread 1: " + i);
                Thread.sleep(3);
            }
        } catch (Exception e){};
    }
}
