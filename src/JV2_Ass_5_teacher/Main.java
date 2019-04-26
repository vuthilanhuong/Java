package JV2_Ass_5_teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import JV2_Lab_1.MyConnect;

public class Main {
    public static final int DEACTIVE =0;
    public static final int ACTIVE =1;

    public static void main (String args[]){
        try{
            MyConnect myConnect = new MyConnect();

            //0.Menu
            Scanner scanner= new Scanner(System.in);
            boolean stop= false;

            while (!stop){
                System.out.println("Chon chuc nang:");
                System.out.println("1.Dang nhap");
                System.out.println("2.Dang ky");
                System.out.println("3.Xem danh sach");
                System.out.println("4.Xoa user");
                System.out.println("5.Exit");


                int menu= scanner.hasNextInt()?scanner.nextInt():0;
                if (menu>0&&menu<6){
                    switch (menu){
                        case 1: login(myConnect);break;
                        case 2: regist(myConnect);break;
                        case 3: viewList(myConnect);break;
                        case 4: deleteUser(myConnect);break;
                        case 5: stop= true; myConnect.conn.close(); break;
                    }
                }
            }
        }catch (Exception e){e.printStackTrace();};
    }

    //1. Ham phu: login
    public static void login(MyConnect myConnect) throws Exception{
        Statement statement = myConnect.conn.createStatement();

        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap Username: ");
        String username= scanner.nextLine();
        System.out.println("Nhap Password: ");
        String password= scanner.nextLine();

        boolean succeed = false;
        while (!succeed){
            String sql = "SELECT * FROM user\n" +
                    "WHERE username='"+username+"' AND password='"+password+"';";
            ResultSet rs= myConnect.executeQuery(sql);
            if(rs.next()){
                System.out.println("Dang nhap thanh cong");
                return;
            };
            System.out.println("Sai, dang nhap lai!");
        }
    }

    //Ham phu: Dang ky
    public static void regist(MyConnect myConnect) throws Exception{
        Statement statement = myConnect.conn.createStatement();
        Scanner scanner = new Scanner(System.in);

        System.out.println("New username: ");
        String username = scanner.nextLine();
        System.out.println("New password: ");
        String password = scanner.nextLine();
        System.out.println("New email: ");
        String email = scanner.nextLine();
        System.out.println("New status: ");
        String status = scanner.nextLine();


        String sql_register = "INSERT INTO user (username, password, email,status)\n" +
                "VALUES ('"+username+"', '"+password+"', '"+email+"', '"+status+"');";
        try{
            int i= myConnect.executeUpdate(sql_register);
            if (i==1){
                System.out.println("Dang ky thanh cong!");
            }else {
                System.out.println("Dang ky that bai!");
            };
        } catch (Exception MySQLIntegrityConstraintViolationException){
            System.out.println("Duplicate Error!");
        };
    }

    //Ham phu: Xem danh sach
    //Cach 1:
//    public static void viewList(MyConnect myConnect) throws Exception{
//        Statement statement =myConnect.conn.createStatement();
//
//        String sql = "SELECT * FROM user;";
//        ResultSet result= myConnect.executeQuery(sql);
//        while (result.next()){
//            System.out.print("Username: " + result.getString("username"));
//            System.out.println(" Email: "+ result.getString("email"));
//        }
//    }

    //Cach 2:
    public static void viewList(MyConnect myConnect) throws Exception {
        userDAO userDAO= new userDAO();
        ArrayList<User>  list=  userDAO.getUsers();
        for(int i=1; i<list.size();i++){
            System.out.println(list.get(i).getUsername());
        }
    }
    //Ham phu: Delete by ID
    public static void deleteUser(MyConnect myConnect) throws Exception{
        Statement statement= myConnect.conn.createStatement();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Xoa user by ID:");

        if (scanner.hasNextInt()){
            int id = scanner.nextInt();
            String sql ="UPDATE user\n" +" SET status ="+ DEACTIVE+
                    " WHERE id="+id+";";
            if(myConnect.executeUpdate(sql)>0){
                System.out.println("Xoa thanh cong!");
                return;
            }else {
                System.out.println("Khong xoa duoc!");
                return;
            }
        }
        System.out.println("Nhap sai!");
    }
}
