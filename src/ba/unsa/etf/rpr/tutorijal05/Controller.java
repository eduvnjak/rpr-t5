package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private Button jedan;
    @FXML
    private Button dva;
    @FXML
    private Button tri;
    @FXML
    private Button cetiri;
    @FXML
    private Button pet;
    @FXML
    private Button sest;
    @FXML
    private Button sedam;
    @FXML
    private Button osam;
    @FXML
    private Button devet;
    @FXML
    private Button nula;
    @FXML
    private Button mod;
    @FXML
    private Button puta;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button podijeljeno;
    @FXML
    private Button tacka;
    @FXML
    private Button jednako;
    @FXML
    private TextField display;
    private Float rezultat = 0f;
    private int operacija = -1;
    @FXML
    void handleButtonAction(ActionEvent event){
        if(event.getSource() == jedan){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "1" );
        }else if(event.getSource() == dva){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "2" );
        }else if(event.getSource() == tri){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "3" );
        }else if(event.getSource() == cetiri){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "4" );
        }else if(event.getSource() == pet){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "5" );
        }else if(event.getSource() == sest) {
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "6");
        }else if(event.getSource() == sedam){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "7" );
        }else if(event.getSource() == osam){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "8" );
        }else if(event.getSource() == devet){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "9" );
        }else if(event.getSource() == nula){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "0" );
        }else if(event.getSource() == tacka){
            if(operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "." );
        }else if(event.getSource() == jednako){
            Float operand = Float.parseFloat(display.getText());
            if(operacija == 1){
                rezultat += operand;
                display.setText(String.valueOf(rezultat));
            }else if(operacija == 2){
                rezultat -= operand;
                display.setText(String.valueOf(rezultat));
            }else if(operacija == 3){
                rezultat *= operand;
                display.setText(String.valueOf(rezultat));
            }else if(operacija == 4){
                rezultat /= operand;
                display.setText(String.valueOf(rezultat));
            }else if(operacija == 5){
                rezultat %= operand;
                display.setText(String.valueOf(rezultat));
            }
            operacija = 0;
        }else if(event.getSource() == plus){
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 1;
        }else if(event.getSource() == minus){
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 2;
        }else if(event.getSource() == puta){
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 3;
        }else if(event.getSource() == podijeljeno){
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 4;
        }else if(event.getSource() == mod){
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 5;
        }
    }
}
