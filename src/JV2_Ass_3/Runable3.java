package JV2_Ass_3;

public class Runable3 implements Runnable {
    public void run(){
        try{
            for(int i=1; i<=50; i++){
                System.out.println("Thread 3: " + i);
                Thread.sleep(1);
            }
        } catch (Exception e){};
    }
}