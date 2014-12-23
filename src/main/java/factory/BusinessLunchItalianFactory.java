/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import drinkables.ItalianDrinkables;
import entre.ItalianEntre;
import inerfaceProduct.Drinkables;
import inerfaceProduct.Entre;
import inerfaceProduct.MainCourse;
import inerfaceProduct.Salad;
import maincourse.ItalianMainCourse;
import salad.ItalianSalad;

/**
 *
 * @author asus
 */
public class BusinessLunchItalianFactory extends BusinessLunchFactory {    
    
    private static BusinessLunchItalianFactory businessLunchItalianFactory;

    public static BusinessLunchItalianFactory getBusinessLunchItalianFactory() {
        System.out.println("\n Cook  Italian business lunches");
        if (businessLunchItalianFactory == null) {
            businessLunchItalianFactory = new BusinessLunchItalianFactory();
        }
        return businessLunchItalianFactory;
    }
    
    private  BusinessLunchItalianFactory() {
        
    }

    @Override
    public Salad createSalad() {
        return new ItalianSalad();

    }

    @Override
    public Entre createEntre() {
        return new ItalianEntre();
    }

    @Override
    public MainCourse createMainCourse() {
        return new ItalianMainCourse();

    }

    @Override
    public Drinkables createDrinkables() {
        return new ItalianDrinkables();

    }
    
}
