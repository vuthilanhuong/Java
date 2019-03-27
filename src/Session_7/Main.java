package Session_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String arg[]){
        Menu objMenu= new Menu();
        Student objStu= new Student();
        ArrayList<Student> stuList = new ArrayList<>();
        Scanner screen= new Scanner(System.in);

        //Khoi tao mang
        stuList.add(new Student(0,"A",23,"HN",1.3));
        stuList.add(new Student(1,"C",23,"HN",7.8));
        stuList.add(new Student(2,"S",23,"HN",5.7));
        stuList.add(new Student(3,"B",23,"HN",2.2));

        //chay menu

        int choice=0;

        do {
            objMenu.showMenu();
            if(screen.hasNextInt()){
                choice = screen.nextInt();
                if (choice==1){objMenu.addStu(stuList);}
                else if (choice==2){objMenu.editStu(1,stuList);}
                else if (choice==3){objMenu.deleteStu(1,stuList);}
                else if (choice==4){objMenu.sortGpa(stuList);}
                else if (choice==5){objMenu.sortName(stuList);}
                else if (choice==6){objMenu.showListStudent(stuList);}
                else if (choice==0){objMenu.exitMenu();}
                else {
                    System.out.println("Khong co trong menu!");
                    choice=0;
                }
            }else {
                System.out.println("Ban nhap sai dinh dang roi!");
                choice=0;
            }
        } while (choice!=0);

    }
}
