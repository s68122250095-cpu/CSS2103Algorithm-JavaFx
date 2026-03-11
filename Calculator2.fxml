package com.example.calculator;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private TextField result;

    private double getNum1(){
        return Double.parseDouble(num1.getText());
    }

    private double getNum2(){

        return Double.parseDouble(num2.getText());
    }

    @FXML
    private void add(){

        result.setText(String.valueOf(getNum1()+getNum2()));
    }

    @FXML
    private void subtract() {
        result.setText(String.valueOf(getNum1()-getNum2()));
    }

    @FXML
    private void multiply(){

        result.setText(String.valueOf(getNum1()*getNum2()));
    }

    @FXML
    private void divide(){

        result.setText(String.valueOf(getNum1()/getNum2()));
    }
}
