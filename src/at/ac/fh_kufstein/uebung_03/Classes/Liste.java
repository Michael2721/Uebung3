/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

import static at.ac.fh_kufstein.uebung_03.Classes.Color.SILVER;

/**
 *
 * @author Michael
 * @param <T>
 */
public class Liste<T extends AbstractBenennbar>{
    private int size;
    private final Object[] elements;
    private int pointer = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
   

    public Liste(int size) {
        this.size = size;
        elements = (Object[])new Object[size];
    }
    
    public void save(T element) 
    {
       
            if(pointer<this.size)
            {
                elements[pointer] = element;
                pointer++;
            } else
            {
                System.err.println("Array voll");
            }
        
    }

    public Object getElement(int a) {
        return elements[a];
    }

    

   
    
    
    
    public static void main(String[] args)
    {
        Liste doub = new Liste(2);
        Car namedCar = new Car((short)4, (short)4, SILVER, (short)220, (short) 5);
        
        doub.save(namedCar);
        doub.save(namedCar);
        
        
        for (int i = 0; i < doub.getSize(); i++) {
            System.out.println(doub.getElement(i));
        }
        
    }


}
