package JV2_Ass_7;

import JV2_Ass_7.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class phoneDAO implements DAOInterface<PhoneBook> {

    @Override
    public ArrayList<PhoneBook> getList() {
        try{
            Connector connector = Connector.getInstance();
            String sql ="SELECT * FROM phoneBook;";
            ArrayList<PhoneBook> list = new ArrayList<>();
            ResultSet result = connector.executeQuery(sql);

            while (result.next()){
                PhoneBook phoneBook= new PhoneBook();

                phoneBook.setId(result.getInt("id"));
                phoneBook.setUser_id(result.getInt("user_id"));
                phoneBook.setTelephone(result.getString("telephone"));
                phoneBook.setStatus(result.getInt("status"));

                list.add(phoneBook);
            };
            return list;
        }catch (Exception e){e.printStackTrace();}
        return null;
    }

    @Override
    public boolean save(PhoneBook phoneBook) {
        try{
            //1. connect
            Connector connector = Connector.getInstance();

            //2.sql
            Integer id= phoneBook.getId();
            Integer user_id= phoneBook.getUser_id();
            String telephone = phoneBook.getTelephone();
            Integer status = phoneBook.getStatus();

            String sql = "INSERT INTO phoneBook \n" +
                    "(user_id, telephone, status)\n" +
                    "VALUES \n" +
                    "('"+user_id+"', '"+telephone+"', '"+status+"');";
            try {
                Integer result = connector.executeUpdate(sql);
                if(result==1){
                    System.out.println("Save Succeed!");
                }else {
                    System.out.println("Can Not Save!");
                }
            }catch (Exception MySQLIntegrityConstraintViolationException){
                System.out.println("Duplicate Error!");
            }

        }catch (Exception e){e.printStackTrace();}
        return false;
    }

    @Override
    public boolean update(PhoneBook phoneBook) {
        try{
            Connector connector= Connector.getInstance();

            String sql= "UPDATE phoneBook\n" +
                    "SET user_id = '"+phoneBook.getUser_id()+"', "+
                    "telephone= '"+phoneBook.getTelephone()+"', " +
                    "status= '"+phoneBook.getStatus()+"'" +
                    "WHERE id = "+phoneBook.getId()+";";
            Integer result = connector.executeUpdate(sql);

            if(result==1){
                System.out.println("Update Succeed!");
            }else {
                System.out.println("Can Not Update!");
            }

        }catch (Exception e){e.printStackTrace();}
        return false;
    }

    @Override
    public boolean delete(PhoneBook phoneBook) {

        try{
            Connector connector= Connector.getInstance();

            String sql = "UPDATE phoneBook\n" +
                    "SET Status = '0'\n" +
                    "WHERE id = "+phoneBook.getId()+";";

            try {
                Integer result = connector.executeUpdate(sql);

                if(result==1){
                    System.out.println("Delete Succeed!");
                }else {
                    System.out.println("Can Not Delete!");
                }
            }catch (Exception e){
                e.printStackTrace();
            }


        }catch (Exception e){e.printStackTrace();}
        return false;
    }
}
