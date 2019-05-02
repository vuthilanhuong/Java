package JV2_Ass_7;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO implements DAOInterface<User> {
    @Override
    public ArrayList<User> getList() {
        Connector connector = Connector.getInstance();
        String sql ="SELECT * FROM user";
        try{
            ArrayList<User> listUser = new ArrayList<>() ;
            ResultSet resultSet= connector.executeQuery(sql);
            while (resultSet.next()){
                User newUser= new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password"),
                        resultSet.getInt("status")
                );
                listUser.add(newUser);
            }

            return listUser;
        }catch (Exception e){e.printStackTrace();}
        return null;
    }

    @Override
    public boolean save(User user) {
        try{

        }catch (Exception e){e.printStackTrace();}
        return false;
    }

    @Override
    public boolean update(User user) {
        try{

        }catch (Exception e){e.printStackTrace();}
        return false;
    }

    @Override
    public boolean delete(User user) {
        try{

        }catch (Exception e){e.printStackTrace();}
        return false;
    }
}
