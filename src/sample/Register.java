package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.ResultSet;

public class Register {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public void buttonRegister() throws Exception{
        String username= txtUsername.getText();
        String emai = txtEmail.getText();
        String password = txtPassword.getText();

        //check sql
        Connector connector= new Connector();
        String sql="SELECT * FROM user\n" +
                "WHERE username LIKE '"+username+"' " +
                "AND password LIKE '"+password+"';";
        ResultSet result= connector.executeQuery(sql);

        //update
        if (result.next()){
            this.changeError();
        }
        else {
            String sql_update ="INSERT INTO User " +
                    "(username, email, password, status)\n" +
                    "VALUES " +
                    "('"+username+"', '"+emai+"', '"+password+"', '1');";
            connector.executeUpdate(sql_update);
        }
    }

    //change page
    public void changeLogin() throws Exception {
        Parent page = FXMLLoader.
                load(getClass().getResource("1.login.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }
    public void changeRegister() throws Exception {
        Parent page = FXMLLoader.
                load(getClass().getResource("1.register.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }
    public void changeError() throws Exception {
        Parent page = FXMLLoader.
                load(getClass().getResource("1.Register_error_renounce.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }
    public void changeSucceed() throws Exception {
        Parent page = FXMLLoader.
                load(getClass().getResource("1.Register_succeed_renounce.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }

}
