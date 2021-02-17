package sample;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Float dataType = 0f;
    int operations = -1;

    @FXML
    private Button addition, minus, multiply, divide, equals, clear;
    @FXML
    private Button one,two,three,four,five,six,seven,eight,nine,zero;
    @FXML
    private TextField display;


    public void processNumber(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
        }
    }
    public void operations(ActionEvent event){

        if (event.getSource() == addition){

            dataType = Float.parseFloat(display.getText());
            operations = 1; //Addition
            display.setText("");
        } else if (event.getSource() == minus){

            dataType = Float.parseFloat(display.getText());
            operations = 2;//Subtraction
            display.setText("");
        } else if (event.getSource() == multiply){

            dataType = Float.parseFloat(display.getText());
            operations = 3;//Multiply
            display.setText("");
        } else if (event.getSource() == divide) {

            dataType = Float.parseFloat(display.getText());
            operations = 4;//Divide
            display.setText("");

        } else if (event.getSource() == equals){
            Float secondOperand = Float.parseFloat(display.getText());
            switch (operations) {
                case 1:
                    Float solution = dataType + secondOperand;
                    display.setText(String.valueOf(solution));
                    break;
                case 2:
                    solution = dataType - secondOperand;
                    display.setText(String.valueOf(solution));
                    break;
                case 3:
                    solution = dataType * secondOperand;
                    display.setText(String.valueOf(solution));
                    break;
                case 4:
                    solution = 0f;
                    try {
                        solution = dataType / secondOperand;
                    } catch (Exception e) {
                        display.setText("Error");
                    }
                    display.setText(String.valueOf(solution));
                    display.setText(String.valueOf(solution));
                    break;
            }

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
