package Assignment_6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainNew {

    public static void main (String arg[]){
        News obj= new News(0,"A","A","A","A",3) {
        };
        ArrayList<News> newsList = new ArrayList<>();
        newsList.add(obj);

        ArrayList<Integer> RateList =new ArrayList<Integer>();
        RateList.add(0,12);
        RateList.add(1,13);
        RateList.add(2,14);

        obj.Display();
        obj.calculate(RateList);
        System.out.println("AverageRate: "+ obj.getAverageRate());

        //Menu
        Menu objMenu= new Menu();

        Scanner sc= new Scanner(System.in);
        int method = 0;
        System.out.println("Ban muon lam gi?");
        System.out.println("1. Them");
        System.out.println("2. Show");
        System.out.println("3. Exit");
        System.out.println("Ban chon: ");
        if (sc.hasNextInt()) {
            method= sc.nextInt();

        }
        System.out.println("method: "+ method);
                
        try {
            if (method==1){
                objMenu.insertNews(newsList);
            } else if(method==2){
                objMenu.viewListNews(newsList);
            } else if(method==3){
                objMenu.viewListNews(newsList);
            } else {
                System.out.println("Lua chon khong phu hop");

            }
        }catch (Exception e){
            System.out.println("co loi xay ra!");
        } finally {
            System.out.println("Finally");
        }






    }
}
