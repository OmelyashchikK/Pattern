/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import drinkables.TraditionalDrinkables;
import entre.TraditionalEntre;
import inerfaceProduct.Drinkables;
import inerfaceProduct.Entre;
import inerfaceProduct.MainCourse;
import inerfaceProduct.Salad;
import maincourse.TraditionalMainCourse;
import salad.TraditionalSalad;

/**
 *
 * @author asus
 */
public class BusinessLunchTraditionalFactory extends BusinessLunchFactory {

    private static BusinessLunchTraditionalFactory businessLunchTraditionalFactory;

    public static BusinessLunchTraditionalFactory getBusinessLunchTraditionalFactory() {
        System.out.println("\n Cook  Traditional business lunches");
        if (businessLunchTraditionalFactory == null) {
            businessLunchTraditionalFactory = new BusinessLunchTraditionalFactory();
        }
        return businessLunchTraditionalFactory;
    }

    private BusinessLunchTraditionalFactory() {
    }

    @Override
    public Entre createEntre() {
        return new TraditionalEntre();
    }

    @Override
    public MainCourse createMainCourse() {
        return new TraditionalMainCourse();

    }

    @Override
    public Drinkables createDrinkables() {
        return new TraditionalDrinkables();

    }

    @Override
    public Salad createSalad() {
        return new TraditionalSalad();

    }
}
