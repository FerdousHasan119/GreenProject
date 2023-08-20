package com.example.green;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard {
    public Button donate;
    public Button logout;
    public Button feedback;
    public Button rqstPlant;
    public Button plantlist;
    public Button notice;
    public Button order;
    public Button blog;
    public Button packagelist;
    public Button suggestions;
    public Button consult;

    public void donate(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("calcdonation.fxml"));
        Stage window = (Stage) donate.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage window = (Stage) logout.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void feedback(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("givefeedback.fxml"));
        Stage window = (Stage) feedback.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }


    public void rqstPlant(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("rqst_plant.fxml"));
        Stage window = (Stage) rqstPlant.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void plantlist(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("plantlist.fxml"));
        Stage window = (Stage) plantlist.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void notice(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("notice.fxml"));
        Stage window = (Stage) notice.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void order(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("order.fxml"));
        Stage window = (Stage) order.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void blog(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blog.fxml"));
        Stage window = (Stage) blog.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void packagelist(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("packagelist.fxml"));
        Stage window = (Stage) packagelist.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void suggestions(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("suggestions.fxml"));
        Stage window = (Stage) suggestions.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void consult(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("consult.fxml"));
        Stage window = (Stage) consult.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }
}
