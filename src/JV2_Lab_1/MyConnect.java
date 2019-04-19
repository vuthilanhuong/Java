package JV2_Lab_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnect {
    public Connection conn;

    public MyConnect() {
        try{
            //Step1: Cai Drive
            Class.forName("com.mysql.jdbc.Driver");
            //Step2: Ket noi
            String URL ="jdbc:mysql://localhost:3306/t1808m1";
            this.conn= DriverManager.getConnection(URL,"huong","123456");
        } catch (Exception e){e.printStackTrace();}
    }

    public ResultSet executeQuery (String sql) throws Exception {
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    };

    public Integer executeUpdate (String sql) throws Exception {
        Statement statement = conn.createStatement();
        return statement.executeUpdate(sql);
    };
}
