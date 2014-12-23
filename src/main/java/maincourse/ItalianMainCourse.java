/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincourse;

import inerfaceProduct.MainCourse;

/**
 *
 * @author asus
 */
public class ItalianMainCourse implements MainCourse {

    @Override
    public void cook() {
        System.out.println("Cook  the second dish 'Pasta with chicken'");
    }
}
