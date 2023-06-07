package com.example.uebung230607_1.control;

import com.example.uebung230607_1.model.Drone;
import com.example.uebung230607_1.model.Geschwindigkeit;
import com.example.uebung230607_1.model.Position;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class DroneController
{
    private static DroneController classInstance;

    public static DroneController getClassInstance()
    {
        if (classInstance == null)
        {
            classInstance = new DroneController();
        }
        return classInstance;
    }


    private Drone drone;
    private DoubleProperty geschwindigkeitsProperty;
    private DoubleProperty xKoordinateProperty;
    private DoubleProperty yKoordinateProperty;
    private DoubleProperty zKoordinateProperty;

    private DroneController()
    {
        this.drone = new Drone();
        this.geschwindigkeitsProperty = new SimpleDoubleProperty();
        this.xKoordinateProperty = new SimpleDoubleProperty();
        this.yKoordinateProperty = new SimpleDoubleProperty();
        this.zKoordinateProperty = new SimpleDoubleProperty();
        propertyListeners();
    }

    private void propertyListeners()
    {
       this.geschwindigkeitsProperty.addListener(new ChangeListener<Number>()
       {
           @Override
           public void changed(ObservableValue<? extends Number> observableValue, Number alteGeschwindigkeit, Number neueGeschwindigkeit)
           {
               drone.getGeschwindigkeit().setGeschwindigkeit((Double) neueGeschwindigkeit);
           }
       });

       this.xKoordinateProperty.addListener(new ChangeListener<Number>()
       {
           @Override
           public void changed(ObservableValue<? extends Number> observableValue, Number alteXKoordinate, Number neueXKoordinate)
           {
               drone.getPosition().setxKoordinate((Double) neueXKoordinate);
           }
       });

        this.yKoordinateProperty.addListener(new ChangeListener<Number>()
        {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number alteYKoordinate, Number neueYKoordinate)
            {
                drone.getPosition().setyKoordinate((Double) neueYKoordinate);
                System.out.println("changed y");
            }
        });

        this.zKoordinateProperty.addListener(new ChangeListener<Number>()
        {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number alteZKoordinate, Number neueZKoordinate)
            {
                drone.getPosition().setzKoordinate((Double) neueZKoordinate);
            }
        });
    }




    public DoubleProperty geschwindigkeitsProperty()
    {
        return geschwindigkeitsProperty;
    }


    public DoubleProperty xKoordinateProperty()
    {
        return xKoordinateProperty;
    }


    public DoubleProperty yKoordinateProperty()
    {
        return yKoordinateProperty;
    }


    public DoubleProperty zKoordinateProperty()
    {
        return zKoordinateProperty;
    }

    public Drone getDrone()
    {
        return drone;
    }
}
