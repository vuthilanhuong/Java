package JV2_Ass_5_teacher;

import java.util.ArrayList;

public interface UserDAOInterface {
    ArrayList<User> getUsers();
    boolean saveUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
}
