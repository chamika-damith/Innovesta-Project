package com.example.demo.controller.stock;

import com.example.demo.util.qr.QrGenerator;
import com.google.zxing.WriterException;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddNewCrad {

    public TextField txtName;
    public TextField txtMobile;
    public TextField txtAmount;

    public void btnCreateOnAction(ActionEvent actionEvent) throws IOException, WriterException {
        QrGenerator qrGenerator = new QrGenerator();
        String data = "Name "+txtName.getText()+"\nAmount "+txtAmount.getText()+"\nMobile "+txtMobile.getText();
        qrGenerator.getGenerator(data);


    }
}
