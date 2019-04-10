package ThreadDemo;

public class MyThread extends Thread {
    public void run(){
        //1.In ra 10 số chẵn
//        for(int i=0; i<=20; i+=2){
//            try {
//                System.out.println(i);
//                Thread.sleep(1500);
//            } catch (Exception e) {            }
//        }
        //2. In ra 10 số nguyên tố đầu tiên
        int count=0;
        Integer songuyen =2;
        checkNT objCheck= new checkNT();
        while (count<10){
            if(objCheck.checkNt(songuyen) == true){
                try{
                    System.out.println(songuyen);
                    Thread.sleep(10);
                    count++;
                    songuyen++;
                }catch (Exception e){};

            }else{
                songuyen++;
            }
        }
        //3.SubThead countdown 10..1. In cau chuc mung
        SubThread objCountDown = new SubThread();
        objCountDown.run();

    }
}
