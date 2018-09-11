package sample;

import exercise1.ConversionCelsiusToFahrenheit;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;

public class Controller {

    @FXML
    Button buttonConverterCelsiusToFahrenheit;

    public void converterCelsiusToFahrenheit(){

        Dialog dialog = new Dialog();
        dialog = FXMLLoader.load(getClass().getResource("window.fxml"));
        dialog.show();
        ConversionCelsiusToFahrenheit program = new ConversionCelsiusToFahrenheit();
        program.conversionCelciusToFahrenheit();
    }
}