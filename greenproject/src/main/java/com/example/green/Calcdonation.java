package com.example.green;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.net.*;
import java.util.Objects;

public class Calcdonation {
    public TextField amount;
    public Button calc;
    public Text result;
    public Button back;

    public void calc(ActionEvent actionEvent) {
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());

            String amnt=amount.getText();

            dout.writeUTF(amnt);
            dout.flush();

            String dnt = (String) dis.readUTF();

            result.setText("Donation amount: "+dnt);

            s.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,800,550));
    }
}
