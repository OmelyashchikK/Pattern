/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import inerfaceProduct.Drinkables;
import inerfaceProduct.Entre;
import inerfaceProduct.MainCourse;
import inerfaceProduct.Salad;

/**
 *
 * @author asus
 */
public abstract class BusinessLunchFactory {

    public abstract Salad createSalad();

    public abstract Entre createEntre();

    public abstract MainCourse createMainCourse();

    public abstract Drinkables createDrinkables();

}











