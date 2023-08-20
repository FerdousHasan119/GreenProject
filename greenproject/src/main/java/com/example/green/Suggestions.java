package com.example.green;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Suggestions {
    public TextField name;
    public TextField description;
    public Button submit;
    public Text alert;
    public Button back;

    public void submit(ActionEvent actionEvent) {
        String a=name.getText();
        String b=description.getText();
        alert.setText("Prbolem stored. Keep eye on notice.");
        File suggestion=new File("suggestion.txt");
        try {
            BufferedWriter buf = new BufferedWriter(new FileWriter(suggestion,true));
            buf.write("Name: "+a);
            buf.newLine();
            buf.write(b);
            buf.newLine();
            buf.newLine();
            buf.write("----------------------------------------------------------");
            buf.newLine();
            buf.newLine();
            buf.close();
        } catch (Exception ex) {
            alert.setText("Please Enter all the Field");
        }
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,800,550));
    }
}
