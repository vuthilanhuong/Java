package JAVA2_EXAM2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {
    //1.Create attribute conn
    public Connection conn;
    private static Connector instance;//Step1: single design_ dai dien instance

    //2.Ham contructor
    private Connector() { //Step2: single design_ set private
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/t1808m1";
            this.conn = DriverManager.getConnection(URL, "huong", "123456");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connector getInstance(){ //Step 3: single design__ tao getInstance
        if (instance==null){
            instance = new Connector();
        }
        return instance;
    };

    //3.ham query database
    public ResultSet executeQuery(String sql)throws Exception{
        Statement statement= this.conn.createStatement();
        return statement.executeQuery(sql);
    }

    //4.ham update
    public Integer executeUpdate(String sql) throws Exception{
        Statement statement = this.conn.createStatement();
        return statement.executeUpdate(sql);
    }
}
