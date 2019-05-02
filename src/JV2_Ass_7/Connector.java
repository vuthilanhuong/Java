package JV2_Ass_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {
    //1.Create attribute conn
    public Connection conn;
    //Step1: single design
    private static Connector instance;

    //Ham contructor
    private Connector() { //Step2: single design
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/t1808m1";
            this.conn = DriverManager.getConnection(URL, "huong", "123456");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    //Step 3: single design
    public static Connector getInstance(){
        if (instance==null){
            instance = new Connector();
        }
        return instance;
    };

    //ham query database
    public ResultSet executeQuery(String sql)throws Exception{
        Statement statement= this.conn.createStatement();
        return statement.executeQuery(sql);
    }

    //ham update
    public Integer executeUpdate(String sql) throws Exception{
        Statement statement = this.conn.createStatement();
        return statement.executeUpdate(sql);
    }

}