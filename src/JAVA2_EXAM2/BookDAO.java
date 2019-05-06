package JAVA2_EXAM2;

import JV2_Ass_5_teacher.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO implements DAOInterface<Book> {

    @Override//1.get list book
    public ArrayList<Book> getList() {
        try{
            Connector connector = Connector.getInstance();
            String sql ="SELECT * FROM book;";
            ArrayList<Book> list = new ArrayList<>();
            ResultSet result = connector.executeQuery(sql);

            while (result.next()){
                Book book= new Book();

                book.setId(result.getString("id"));
                book.setTitle(result.getString("title"));
                book.setAuthor(result.getString("author"));
                book.setPrice(result.getInt("price"));

                list.add(book);
            };
            return list;

        }catch (Exception e){e.printStackTrace();}

        return null;
    }

    @Override//3. add new book
    public boolean add(Book book) {
        try{
            Connector connector = Connector.getInstance();
            String sql = "INSERT INTO book \n" +
                    "(id, title, author, price)\n" +
                    "VALUES \n" +
                    "('"+book.getId()+"', '"+book.getTitle()+"', '"+book.getAuthor()+"', '"+book.getPrice()+"');";

            try {
                Integer result = connector.executeUpdate(sql);
                if(result==1){
                    System.out.println("Add book Succeed!");
                }else {
                    System.out.println("Can Not Add!");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){e.printStackTrace();}
        return false;
    }


}
