package HotelExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Fuction {
    public HotelExam.Hotel inputHotel (){
        HotelExam.Hotel newHotel = new HotelExam.Hotel();
        Scanner screen = new Scanner(System.in);

        System.out.println("Name:");
        newHotel.setName(screen.nextLine());

        System.out.println("Location:");
        newHotel.setLocation(screen.nextLine());

        System.out.println("OwnerName:");
        newHotel.setOwnerName(screen.nextLine());

        return newHotel;
    }
    //in chi tiet all KS khi nhap ten nguoi so huu
    public void printHotel(String ownerName, ArrayList<HotelExam.Hotel> arrHotel){
        System.out.println("Danh sach cac KS cung chu so huu: "+ ownerName);
        boolean check=true;
        ownerName= ownerName.trim();
        for (int i=0; i<arrHotel.size(); i++){

            if (ownerName.equals(arrHotel.get(i).getOwnerName())){
                check = false;
                System.out.print("Name:"+arrHotel.get(i).getName());
                System.out.println(" _Location:"+arrHotel.get(i).getLocation());
            }
        }
        if (check==true)
            System.out.println("Khong ton tai KS thuoc chu so huu nay!");
    }
}
