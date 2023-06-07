package com.example.uebung230607_1.view;

import com.example.uebung230607_1.control.DroneController;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.NumberStringConverter;

public class ClientDelegate
{
    public TextField inputXKoordinate;
    public Label outputXKoordinate;
    public TextField inputYKoordinate;
    public Label outputYKoordinate;
    public TextField inputZKoordinate;
    public Label outputZKoordinate;
    public TextField inputSpeed;
    public Label outputSpeed;
    @FXML
    private void initialize()
    {
       /* DroneController.getClassInstance().getGeschwindigkeitsProperty().bind(Bindings.createDoubleBinding(()->{
            if (inputSpeed.getText().equals(""))
            {
                return 0.0;
            }else {
                try
                {
                    return new DoubleStringConverter().fromString(inputSpeed.getText());
                }catch (NumberFormatException numberFormatException)
                {
                    System.err.println("Falsche Eingabe!");
                    return 0.0;
                }
            }
        },inputSpeed.textProperty()));*/


       Bindings.bindBidirectional(outputSpeed.textProperty() , DroneController.getClassInstance().getGeschwindigkeitsProperty() , new NumberStringConverter());
       Bindings.bindBidirectional(outputXKoordinate.textProperty(), DroneController.getClassInstance().xKoordinateProperty(), new NumberStringConverter());
       Bindings.bindBidirectional(outputYKoordinate.textProperty(), DroneController.getClassInstance().yKoordinateProperty(), new NumberStringConverter());
       Bindings.bindBidirectional(outputZKoordinate.textProperty(), DroneController.getClassInstance().zKoordinateProperty(), new NumberStringConverter());
    }


    @FXML
    private Label welcomeText;

    @FXML
    protected void onSetButtonClick()
    {
        //DroneController.getClassInstance().xKoordinateProperty().set(new DoubleStringConverter().fromString(inputXKoordinate.getText()));
        //DroneController.getClassInstance().yKoordinateProperty().set(new DoubleStringConverter().fromString(inputYKoordinate.getText()));
        //DroneController.getClassInstance().zKoordinateProperty().set(new DoubleStringConverter().fromString(inputZKoordinate.getText()));
        //DroneController.getClassInstance().geschwindigkeitsProperty().set(new DoubleStringConverter().fromString(inputSpeed.getText()));
    }

    public void onLoadButtonClick()
    {
        outputXKoordinate.setText(new DoubleStringConverter().toString(DroneController.getClassInstance().getDrone().getPosition().getxKoordinate()));
        outputYKoordinate.setText(new DoubleStringConverter().toString(DroneController.getClassInstance().getDrone().getPosition().getyKoordinate()));
        outputZKoordinate.setText(new DoubleStringConverter().toString(DroneController.getClassInstance().getDrone().getPosition().getzKoordinate()));
        outputSpeed.setText(new DoubleStringConverter().toString(DroneController.getClassInstance().getDrone().getGeschwindigkeit().getGeschwindigkeit()));
    }


    public void onSetAndLoadClick()
    {
        onSetButtonClick();
        onLoadButtonClick();
    }
}