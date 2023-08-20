package com.example.green;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Packagelist implements Initializable {
    public TextArea text;
    public ScrollBar s2;
    public ScrollBar s1;
    public Button view;
    public Button back;
    String details="";

    public void view(ActionEvent actionEvent) throws IOException {
        FileReader fr = new FileReader("packagelist.txt");
        BufferedReader br = new BufferedReader(fr);
        try {
            while (true) {
                String s = br.readLine();
                if (s == null) break;
                text.setText(s);
                details = details +s +"\n";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        br.close();
        fr.close();
        text.setText(details);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,800,550));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        s1.setLayoutX(text.getWidth()-s1.getWidth());
        s2.setLayoutY(text.getHeight()-s1.getHeight());
        text.setStyle("-fx-control-inner-background: #ffffff; -fx-font-family: 'Times New Roman'; -fx-font-size: 17");
    }
}
