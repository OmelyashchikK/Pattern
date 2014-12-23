/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createBL;

import factory.BusinessLunchFactory;
import inerfaceProduct.Drinkables;
import inerfaceProduct.Entre;
import inerfaceProduct.MainCourse;
import inerfaceProduct.Salad;

/**
 *
 * @author asus
 */
public class CreateBusinessLunch {
    
    public void createBusinessLunch(BusinessLunchFactory factory) {
        
        Salad salad = factory.createSalad();
        Entre entre = factory.createEntre();
        MainCourse mainCourse = factory.createMainCourse();
        Drinkables drinkables = factory.createDrinkables();
        salad.cut();
        entre.boil();
        mainCourse.cook();
        drinkables.brewing();
    }
}
