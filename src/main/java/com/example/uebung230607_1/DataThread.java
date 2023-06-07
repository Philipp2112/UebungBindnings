package com.example.uebung230607_1;

import com.example.uebung230607_1.control.DroneController;
import javafx.application.Platform;

public class DataThread extends Thread
{

       /* @Override
        public void run ()
        {
            while (true)
            {
                try
                {
                    setzeZufaelligeWerte();
                    System.out.println("Ich lebe " + System.currentTimeMillis());
                    sleep(1000);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }*/


    @Override
    public void run() {
        while (true)
        {
            try
            {
                Platform.runLater(() ->
                        {
                            setzeZufaelligeWerte();
                            System.out.println("Ich lebe " + System.currentTimeMillis());
                        });
                sleep(5000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }




    private void setzeZufaelligeWerte()
    {
        DroneController.getClassInstance().xKoordinateProperty().setValue(Math.random());
        DroneController.getClassInstance().yKoordinateProperty().setValue(Math.random());
        DroneController.getClassInstance().zKoordinateProperty().setValue(Math.random());
        DroneController.getClassInstance().getGeschwindigkeitsProperty().setValue(Math.random());

    }
}
