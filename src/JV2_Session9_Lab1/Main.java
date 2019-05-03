package JV2_Session9_Lab1;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        System.out.println("Moi ban chon ngon ngu:");
        System.out.println("1.Tieng Anh");
        System.out.println("2.Tieng Viet");

        Integer i;
        Scanner scanner= new Scanner(System.in);
        i= scanner.nextInt();

        if(i==1){
            Locale en= new Locale("en","US");
            Locale.setDefault(en);
        }else{
            if(i==2){
                Locale vi= new Locale("vi","VN");
                Locale.setDefault(vi);
            }
        }

        ResourceBundle resourceBundle = ResourceBundle.getBundle("JV2_Session9_Lab1.Message");

        System.out.println(i);

        System.out.println("1."+ resourceBundle.getString("login"));
        System.out.println("2."+ resourceBundle.getString("register"));
        System.out.println("3."+ resourceBundle.getString("viewList"));
        System.out.println("4."+ resourceBundle.getString("exit"));

    }
}
