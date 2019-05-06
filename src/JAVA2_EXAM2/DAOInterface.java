package JAVA2_EXAM2;

import java.util.ArrayList;

public interface DAOInterface<E>  {
    ArrayList<E> getList();
    boolean add(E e);
   // boolean update(E e);
   // boolean delete(E e);
}
