package JV2_Ass_5_teacher;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class userDAO implements UserDAOInterface {
    @Override
    public ArrayList<User> getUsers() {
        Connector connector = Connector.getInstance();
        String sql ="SELECT * FROM user";
        try {
            ResultSet result = connector.executeQuery(sql);
            ArrayList<User> list = new ArrayList<>();
            while (result.next()){
                User user= new User(
                        result.getInt("id"),
                        result.getString("username"),
                        result.getString("email"),
                        result.getString("password"),
                        result.getInt("status")
                );
                list.add(user);
            }
            return list;

        }catch (Exception e){ e.printStackTrace();}
        return null;
    }

    @Override
    public boolean saveUser(User user) {
        Connector connector= Connector.getInstance();
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
        //sql
        try{
            int i= connector.executeUpdate(sql_register);
            if (i==1){
                System.out.println("Dang ky thanh cong!");
                return true;
            }else {
                System.out.println("Dang ky that bai!");
            };
        } catch (Exception MySQLIntegrityConstraintViolationException){
            System.out.println("Duplicate Error!");
        };


        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }
}
