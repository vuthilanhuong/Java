package Assignment_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    public void insertNews (ArrayList<News> newsList){
        News objNew= new News();
        System.out.println("Nhap tin tuc moi:");
        Scanner sc= new Scanner(System.in);
        System.out.print("Title: ");
        objNew.setTitle(sc.nextLine());
        System.out.print("PublishDate: ");
        objNew.setPublishDate(sc.nextLine());
        System.out.print("Author: ");
        objNew.setAuthor(sc.nextLine());
        System.out.print("Content: ");
        objNew.setContent(sc.nextLine());
        System.out.print("Nhap danh gia: ");
        ArrayList<Integer> RateList =new ArrayList<Integer>();
        RateList.add(0,sc.nextInt());
        RateList.add(1,sc.nextInt());
        RateList.add(2,sc.nextInt());
        objNew.calculate(RateList);
        System.out.print("AverageRate:"+objNew.AverageRate);
        objNew.setID(newsList.size()+1);
        newsList.add(objNew);
    }

    public void viewListNews(ArrayList<News> newsList){
        System.out.println("Cac phan tu cua mang newList:");
        for(News x: newsList){
            x.Display();
        }
    }

}
