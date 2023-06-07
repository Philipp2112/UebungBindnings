package com.example.uebung230607_1.model;


public class Drone
{
    private Position position;
    private Geschwindigkeit geschwindigkeit;

    public Drone()
    {
        this.position = new Position(0.0,0.0,0.0);
        this.geschwindigkeit = new Geschwindigkeit(0.0);
    }

    public Drone(Position position, Geschwindigkeit geschwindigkeit)
    {
        this.position = position;
        this.geschwindigkeit = geschwindigkeit;
    }

    public Position getPosition()
    {
        return position;
    }


    public Geschwindigkeit getGeschwindigkeit()
    {
        return geschwindigkeit;
    }

}
