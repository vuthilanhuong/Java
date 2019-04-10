package ThreadDemo;

public class SubThread {
    public void run(){
        int i=10;
        while (i>0){
            try{
                System.out.println("count down "+ i);
                i--;
                Thread.sleep(100);
            }catch (Exception e){};
        }
        System.out.println("Chuc mung ban hoan thanh bai tap!");
    }
}
