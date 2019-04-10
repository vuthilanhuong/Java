package JV2_Ass_3;

public class Runable2 implements Runnable {
    public void run(){
        try{
            for(int i=1; i<=50; i++){
                System.out.println("Thread 2: " + i);
                Thread.sleep(2);
            }
        } catch (Exception e){};
    }
}