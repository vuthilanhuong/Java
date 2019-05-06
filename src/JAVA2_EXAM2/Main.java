package JAVA2_EXAM2;

import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        Connector connector= Connector.getInstance();
        Scanner scanner = new Scanner(System.in);
        Fuction fuction= new Fuction();

        boolean stop= false;

        while (!stop){
            System.out.println("Menu:");
            System.out.println("1. Add book records");
            System.out.println("2. Save");
            System.out.println("3. Display book records");
            System.out.println("4. Exit");
            Integer menu= scanner.hasNextInt()?scanner.nextInt():0;

            if (menu>0&&menu<5){
                switch (menu){
                    case 1: fuction.add();break;
                    case 2: ;break;
                    case 3: fuction.display();break;
                    case 4: stop= true; break;
                }
            }

        }


    }

}
