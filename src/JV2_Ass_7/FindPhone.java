package JV2_Ass_7;

import java.util.ArrayList;

public class FindPhone {

    public void tim(String username){
        Connector connector= Connector.getInstance();
        UserDAO userDAO = new UserDAO();
        phoneDAO phoneDAO= new phoneDAO();
        ArrayList<User> listUser= userDAO.getList();
        ArrayList<PhoneBook> listPhone = phoneDAO.getList();

        Integer id_user = null;
        Integer id_phone = null;
        String telephone = null;

        boolean check= false; //gia su ten khong trung nhau
        for(int i=0; i<listUser.size(); i++ ){
            if (listUser.get(i).getUsername().compareTo(username)==0){
                id_user= listUser.get(i).getId();
                check= true;
                break;
            }
        };

        if(check==false){
            System.out.println("Khong tim thay ten!");
        }else {

            for(int i=0; i<listPhone.size(); i++){
                if(listPhone.get(i).getUser_id()==id_user){
                    id_phone= listPhone.get(i).getId();
                    telephone= listPhone.get(i).getTelephone();
                    System.out.println("SDT cua "+username+": "+telephone);
                    return;
                }
            }
        }



    }
}
