/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salad;

import inerfaceProduct.Salad;

/**
 *
 * @author asus
 */
public class ItalianSalad implements Salad {

    @Override
    public void cut() {
        System.out.println("Cut  salad 'Caesar'");
    }

}