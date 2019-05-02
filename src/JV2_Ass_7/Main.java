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
        ArrayList<PhoneBook> list = phoneDAO.getList();
        for (int i=0; i<list.size();i++){
                System.out.println(list.get(i).getId() +"__"+list.get(i).getUser_id()
                +"__"+list.get(i).getTelephone()+"__"+list.get(i).getStatus());
            }

        //2. them vao danh sach
        phoneDAO.save(new PhoneBook(list.size()+1,7,"0983151989",ACTIVE));

        //3. update
        phoneDAO.update(new PhoneBook(7,3,"087766655",ACTIVE));

        //4.Delete
        Integer id = 7;
        PhoneBook phoneBook_delete= new PhoneBook();
        phoneBook_delete.setId(id);
        phoneBook_delete.setUser_id(list.get(id).getUser_id());
        phoneBook_delete.setTelephone(list.get(id).getTelephone());
        phoneBook_delete.setStatus(list.get(id).getStatus());

        phoneDAO.delete(phoneBook_delete);
    }

}
