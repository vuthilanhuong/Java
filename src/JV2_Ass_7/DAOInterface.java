package JV2_Ass_7;

import java.util.ArrayList;

public interface DAOInterface<E> {
    ArrayList<E> getList();
    boolean save(E e);
    boolean update(E e);
    boolean delete(E e);
}
