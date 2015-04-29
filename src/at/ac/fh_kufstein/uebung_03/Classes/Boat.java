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
public class Boat extends Vehicle{
    
    private double draft;
    private short propeller;
    private double cargo;

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + getPs() + " PS und einen Tiegang von " + getDraft() + " m"; //To change body of generated methods, choose Tools | Templates.
    }

    public Boat(double draft, short propeller, double cargo, short wheels, Color f, short ps, short doors) {
        super(wheels, f, ps, doors);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }
    
    public void unload()
    {
        cargo = 0.0;
        try{
            Thread.sleep(5000);
        }catch (Exception e) {}
    }
    
}
