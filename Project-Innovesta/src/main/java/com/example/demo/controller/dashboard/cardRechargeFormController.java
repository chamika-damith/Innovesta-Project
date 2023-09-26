package com.example.demo.controller.dashboard;
import com.example.demo.controller.stock.AddNewCrad;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class cardRechargeFormController {


    public AnchorPane stockChangePane1;
    public TextField txt1;
    public TextField txt2;
    public TextField txt3;
    public TextField txt4;
    public Label lbl1;
    public Label lbl2;
    public Label lbl3;
    public Label lbl4;
    public Button NewCard;
    public AnchorPane cardRechargePane;
    public ImageView qrImg;


    public void BtlRechargeONAction(ActionEvent actionEvent) {
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        String text3 = txt3.getText();

        txt1.clear();

        lbl1.setText(text1);
        lbl2.setText(text2);
        lbl3.setText(text3);

    }




    public void CardRecharge(MouseEvent mouseEvent) throws IOException {
//        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/dashboard/addNewCrad.fxml"));
//        cardRechargePane.getChildren().clear();
//        cardRechargePane.getChildren().add(anchorPane);



        AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/dashboard/addNewCrad.fxml")));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) cardRechargePane.getScene().getWindow();
        stage.centerOnScreen();
        stage.show();

        qrImg.setImage(new Image(new File("C:/Users/Chamika/Desktop/a/Name ddd_Amount aaa_Mobile 111.png").toURI().toString()));

    }
}
