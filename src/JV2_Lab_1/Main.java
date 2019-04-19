package JV2_Lab_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main (String args[]){
        try{
            //Step1:
            Class.forName("com.mysql.jdbc.Driver");
            //Step2:
            String URL ="jdbc:mysql://localhost:3306/t1808m1";
            Connection conn= DriverManager.getConnection(URL,"huong","123456");
            //Step3:
            Statement statement = conn.createStatement();
            //
            String sql = "SELECT*FROM student";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                System.out.println("ID "+ rs.getString("id"));
                System.out.println("Name "+ rs.getString("name"));
                System.out.println("Age "+ rs.getString("age"));
                System.out.println("Mark "+ rs.getString("mark"));
            }
            //Step4: Insert by ID
            String insert_sql = "INSERT INTO student (name,age,mark) " +
                    "VALUES('Nguyen xuan truong',19,2)";
            statement.executeUpdate(insert_sql);
            //Step5: Update by ID
            String update_sql = "UPDATE student "+
            "SET name = 'Dao Duy Tung', age= '99' "+
            "WHERE id = 4";
            statement.executeUpdate(update_sql);
            //Step6: Delete by ID
            String delete_sql = "DELETE FROM student WHERE id='2'";
            statement.executeUpdate(delete_sql);


        }
        catch (Exception e){
            e.printStackTrace();
        };
    }
}
