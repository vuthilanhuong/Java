package HotelExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        HotelExam.Hotel objHotel = new HotelExam.Hotel();
        ArrayList<HotelExam.Hotel> arrHotel = new ArrayList<>();
        HotelExam.Fuction objFuct= new HotelExam.Fuction();


        arrHotel.add(new HotelExam.Hotel("A","HN","Huong"));
        arrHotel.add(new HotelExam.Hotel("B","HN","Huong"));
        arrHotel.add(new HotelExam.Hotel("C","HN","Thao"));
        arrHotel.add(new HotelExam.Hotel("D","HN","Thao"));
        arrHotel.add(new HotelExam.Hotel("E","HN","Hoa"));

        arrHotel.add(objFuct.inputHotel());

        System.out.println("Danh sach KS: ");
        for (HotelExam.Hotel x: arrHotel){
            System.out.print("Name: "+ x.getName());
            System.out.print(" _Location:" + x.getLocation());
            System.out.println(" _Owner: "+ x.getOwnerName());

        }

        System.out.println("Moi ban nhap chu so huu: ");
        Scanner screen =new Scanner(System.in);

        String x = screen.nextLine();
        System.out.println("x:"+ x);
        objFuct.printHotel(x,arrHotel);
}
}
