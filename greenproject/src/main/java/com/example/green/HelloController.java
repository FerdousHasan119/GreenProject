package com.example.green;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class HelloController {
    public Button login;
    public Button signup;
    public Button close;
    public PasswordField pass;
    public TextField u_name;
    @FXML
    TextField warning;

    @FXML
    public void signup(ActionEvent e)   throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        Stage window = (Stage) signup.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    @FXML
    public void login(ActionEvent e)   throws Exception{
        File read=new File("Username.txt");
        File read1=new File("Password.txt");
        String user=u_name.getText();
        String password=pass.getText();
        try {
            BufferedReader buf = new BufferedReader(new FileReader(read));
            BufferedReader buf1 = new BufferedReader(new FileReader(read1));
            String input =buf.readLine();
            String input1=buf1.readLine();
            int flag=0;
            while(input !=null&&input1!=null){
                if(user.equals(input)&&password.equals(input1)){
                    flag=1;
                    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
                    Stage window = (Stage) login.getScene().getWindow();
                    window.setScene(new Scene(root,800,500));
                    break;
                }
                else{
                    input =buf.readLine();
                    input1=buf1.readLine();
                }
            }
            if(flag==0){
                warning.setText("Wrong Username or Password");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @FXML
    public void close(ActionEvent e)   {
        System.exit(0);
    }
}