/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkables;

import inerfaceProduct.Drinkables;

/**
 *
 * @author asus
 */
public class TraditionalDrinkables implements Drinkables {

    @Override
    public void brewing() {
       System.out.println("Brewing  'tea'");
    }

}
