package com.example.uebung230607_1;

import com.example.uebung230607_1.model.Drone;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
            FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("hello-view.fxml"));
            Scene scene = null;
            try
            {
                scene = new Scene(fxmlLoader.load(), 800, 800);
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }


    public static void main(String[] args)
    {
        startThread();
        launch();
    }

    private static void startThread()
    {
        DataThread dataThread = new DataThread();
        dataThread.start();
    }
}