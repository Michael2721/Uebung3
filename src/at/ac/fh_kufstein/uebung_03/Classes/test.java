/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

import static at.ac.fh_kufstein.uebung_03.Classes.Color.SILVER;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael
 * @param <T>
 */
public class test<T extends AbstractBenennbar> {
    List<T> list = new ArrayList<T>();
    public test()
    {
        
    }
    public void populate(T t)
    {
        list.add(t);
    }

    public List<T> getList() {
        return list;
    }

   

 
    
    
    public static void main(String[] ags)
    {
        Car namedCar = new Car((short)4, (short)4, SILVER, (short)220, (short) 5);
        AbstractBenennbar b = namedCar;
        List<Car> autolist2 = new ArrayList<>();
       
        List<? extends AbstractBenennbar> autos = autolist2;
        
        autolist2.add(new Car((short)4, (short)4, SILVER, (short)220, (short) 5));
        
        for(Car a : autolist2)
        {
            System.out.println(a);
        }
    }
}
