package com.example.green;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class signup {
    @FXML
    Button back;
    @FXML
    TextField name;
    @FXML
    TextField gmail;
    @FXML
    PasswordField password;
    @FXML
    TextField age;
    @FXML
    TextField phone;
    @FXML
    TextField warning;
    @FXML
    Button sign;

    @FXML
    public void back(ActionEvent e)   throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    @FXML
    public void sign(){
        String a=name.getText();
        String b=gmail.getText();
        String c=password.getText();
        String d=age.getText();
        String f=phone.getText();
        String g="";
        if(a.equals(g)||b.equals(g)||c.equals(g)||d.equals(g)||f.equals(g)){
            warning.setText("Please Enter all the Information");
        }
        else{
            warning.setText("Account Created Successfully");
            File userInformation=new File("userInformation.txt");
            File username=new File("Username.txt");
            File password=new File("Password.txt");
            try {
                BufferedWriter buf = new BufferedWriter(new FileWriter(userInformation,true));
                buf.write("Name: "+a);
                buf.newLine();
                buf.write("Password: "+c);
                buf.newLine();
                buf.write("Email: "+b);
                buf.newLine();
                buf.write("Age: "+d);
                buf.newLine();
                buf.write("Phone Number: "+f);
                buf.newLine();
                buf.newLine();
                buf.newLine();
                buf.write("----------------------------------------------------------");
                buf.newLine();
                buf.newLine();
                buf.newLine();
                buf.close();
                BufferedWriter buf2 = new BufferedWriter(new FileWriter(username,true));
                buf2.write(a);
                buf2.newLine();
                buf2.close();
                BufferedWriter buf3 = new BufferedWriter(new FileWriter(password,true));
                buf3.write(c);
                buf3.newLine();
                buf3.close();
            } catch (Exception ex) {
                warning.setText("Please Enter all the Information");
            }
        }
    }
}
