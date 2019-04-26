package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.ResultSet;

public class Login {
    public TextField txtUsername;
    public PasswordField txtPassword;

    //1. Login
    public void buttonLogin() throws Exception {
        //get Information
        String username= txtUsername.getText();
        String password= txtPassword.getText();

        //Check database
        Connector connector= new Connector();
        String sql="SELECT * FROM user\n" +
                "WHERE username LIKE '"+ username +"' " +
                "AND password LIKE'"+ password +"';";
        ResultSet result= connector.executeQuery(sql);

        //Renounce
        if (result.next()){
            //chuyen sang trang list
            this.changeList();
        }else {
            //chuyen sang trang error
            this.changeError();
        }
    }

    //2.Chuyen cac trang
    public void changeRegister() throws IOException {
        Parent page = FXMLLoader.
                load(getClass().getResource("1.register.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }

    public void changeList() throws Exception {
        Parent page = FXMLLoader.
                load(getClass().getResource("1.list.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }

    public void changeLogin() throws Exception {
        Parent page = FXMLLoader.
                load(getClass().getResource("1.login.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }

    public void changeError() throws Exception {
        Parent page = FXMLLoader.
                load(getClass().getResource("1.login_error.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }

}
