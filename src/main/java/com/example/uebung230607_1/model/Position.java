package com.example.uebung230607_1.model;

public class Position
{
    private double xKoordinate;
    private double yKoordinate;
    private double zKoordinate;

    public Position(double xKoordinate, double yKoordinate, double zKoordinate)
    {
        this.xKoordinate = xKoordinate;
        this.yKoordinate = yKoordinate;
        this.zKoordinate = zKoordinate;
    }


    public double getxKoordinate()
    {
        return xKoordinate;
    }

    public synchronized void setxKoordinate(double xKoordinate)
    {
        this.xKoordinate = xKoordinate;
    }

    public double getyKoordinate()
    {
        return yKoordinate;
    }

    public synchronized void setyKoordinate(double yKoordinate)
    {
        this.yKoordinate = yKoordinate;
    }

    public double getzKoordinate()
    {
        return zKoordinate;
    }

    public synchronized void setzKoordinate(double zKoordinate)
    {
        this.zKoordinate = zKoordinate;
    }
}
