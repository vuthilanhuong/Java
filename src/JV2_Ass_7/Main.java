package JV2_Ass_7;

import java.sql.*;
import java.util.ArrayList;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import JV2_Ass_7.Connector;

public class Main{
    public static final int DEACTIVE =0;
    public static final int ACTIVE =1;

    public static void main(String args[]) throws Exception{
        phoneDAO phoneDAO= new phoneDAO();

        //1. Chuc nang lay ra danh sach
        ArrayList<PhoneBook> listPhone = phoneDAO.getList();
        for (int i=0; i<listPhone.size();i++){
            System.out.println(listPhone.get(i).getId() +"__"+listPhone.get(i).getUser_id()
                    +"__"+listPhone.get(i).getTelephone()+"__"+listPhone.get(i).getStatus());
        }

        //2. them vao danh sach
        phoneDAO.save(new PhoneBook(listPhone.size()+1,21,"0983151989",ACTIVE));

        //3. update
        phoneDAO.update(new PhoneBook(7,3,"087766655",ACTIVE));

        //4.Delete
        Integer id = 37;
        try {
            if(listPhone.size()+1>id ){
                PhoneBook phoneBook_delete= new PhoneBook(
                        id,
                        listPhone.get(id).getUser_id(),
                        listPhone.get(id).getTelephone(),
                        listPhone.get(id).getStatus()
                );
                phoneDAO.delete(phoneBook_delete);
            }else {
                System.out.println("Vuot qua do dai database");
            }
        }catch (Exception e){e.printStackTrace();};

        //5. List user
        UserDAO userDAO= new UserDAO();
        ArrayList<User> listUser = userDAO.getList();
        //in ra
        for(int i=0;i<listUser.size();i++){
            System.out.println(listUser.get(i).getId() +"__"+listUser.get(i).getUsername());
        }

        //6.Tim sdt cua user
        FindPhone findPhone = new FindPhone();
        findPhone.tim("Hoa");

    }

}
