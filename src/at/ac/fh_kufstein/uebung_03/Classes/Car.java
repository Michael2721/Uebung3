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
public class Car extends Vehicle{
    
    private boolean aircondition;
    private short airbag;

    public boolean isAircondition() {
        return aircondition;
    }

    

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public Car( short airbag, short wheels, Color f, short ps, short doors) {
        super(wheels, f, ps, doors);
        this.aircondition = false;
        this.airbag = airbag;
    }

    @Override
    public String toString() {
        return "Mein Auto hat" + getPs() + " PS und fährt mit " + getSpeed() + " km/h"; //To change body of generated methods, choose Tools | Templates.
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }
    
    public void startAircondition()
    {
        if(aircondition = false)
        {
            aircondition = true;
        }
        else
        {
            System.out.println("Klima läuft bereits");
        }
    }
    
    public void stopAircondition()
    {
        if(aircondition = true)
        {
            aircondition = false;
        }
        else
        {
            System.out.println("Klima ist schon aus");
        }
    }
    
}
