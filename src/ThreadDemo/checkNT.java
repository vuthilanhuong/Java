package ThreadDemo;

public class checkNT {
    public boolean checkNt(Integer x){
        boolean check=true;
        for(int i=2; i<=x/2;i++){
            if (x%i==0) {
                check= false;
                break;
            }
        }
        return check;
    }
}
