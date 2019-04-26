package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class List implements Initializable {
    //1. Khai bao cac bien
    public TableView<Object> tableView;
    public TableColumn<User,Integer> txtId;
    public TableColumn<User,String> txtUsername;
    public TableColumn<User,String> txtEmail;
    public TableColumn<User,String> txtPassword;
    public TableColumn<User,Integer> txtStatus;

    //tu dong hien
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //2.Gan gia tri vao tung cot
        txtId.setCellValueFactory(new PropertyValueFactory<>("id"));
        txtUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        txtEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        txtPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        txtStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        //3.khai bao mang de luu danh sach ket qua tra ve tu database
        ObservableList<Object> userList= FXCollections.observableArrayList();

        //4.ket noi, lay du lieu tu database
//        Connector connector =new Connector();
        Connector connector= Connector.getInstance();//su dung design pattern
        String sql = "SELECT * FROM user;";

        //5.tach ket qua tra ve va luu vao mang o tren
        try{
            ResultSet result= connector.executeQuery(sql);
            while (result.next()){
                userList.add(new User(
                    result.getInt("id"),
                    result.getString("username"),
                    result.getString("email"),
                    result.getString("password"),
                    result.getInt("status")
                ));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //6. Nap du lieu vao bang
        tableView.setItems(userList);
    }

    //Chage page
    public void changeRegister() throws Exception{
        Parent page = FXMLLoader.
                load(getClass().getResource("1.register.fxml"));
        Main.mainStage.getScene().setRoot(page);
    }

}
