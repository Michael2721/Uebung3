/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author Michael
 */
public class Vehicle extends  AbstractBenennbar{
    
    
    
    private short wheels;
    private Color f;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;

    public Vehicle(short wheels, Color f, short ps, short doors) {
        this.wheels = wheels;
        this.f = f;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = (short) 0;
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public Color getF() {
        return f;
    }

    public void setF(Color f) {
        this.f = f;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
    
    public void start()
    {
        started = true;
    }
    
    public void stop()
    {
        started = false;
    }
    
    public void accelerate(short speed)
    {
        if(started==true && ((this.speed+speed )<(short)250))
        {
            this.speed += speed;
        } else if (started==true && ((this.speed+speed )>(short)250))
        {
            this.speed = (short) 250;
        }
    }
    
    
    public void brake(short speed)
    {
        if(started==true && ((this.speed-speed )>=(short)0))
        {
            this.speed -= speed;
        } else if (started==true && ((this.speed-speed )<(short)0))
        {
            this.speed = (short)0;
        }
    }
    
   
    @Override
    public String getName()
    {
       return FName; 
    }
    public void setName(String _n)
    {
        FName = _n;
    }
    
    
}
