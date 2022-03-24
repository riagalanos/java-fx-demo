package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private Label resultingValue;
    @FXML private TextField textFieldValue;

    @FXML
    protected void on10ButtonClick() {
        String bob = textFieldValue.getText();
        int result = 10 * Integer.parseInt(bob);
        resultingValue.setText(""+result);
    }
    @FXML
    protected void on100ButtonClick() {
        int result = 100 * Integer.parseInt(textFieldValue.getText());
        resultingValue.setText(resultingValue.getText()+result);
    }
}
