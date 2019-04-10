package ThreadDemo;

public class Main {
    public static void main(String args[]){
        MyThread objThread= new MyThread();
        System.out.println(objThread.getName());
        //1.Set new name
        objThread.setName("MyJavaThread");
        //2.Chay MyThread
        objThread.start();
        System.out.println(objThread.getName());


    }
}
