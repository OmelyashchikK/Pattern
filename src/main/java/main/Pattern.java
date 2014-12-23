/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import createBL.CreateBusinessLunch;
import factory.BusinessLunchFactory;
import factory.BusinessLunchItalianFactory;
import factory.BusinessLunchTraditionalFactory;
import generate.Generate;

/**
 *
 * @author asus
 */




public class Pattern {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main (String[] args) {
        // TODO code application logic here
        Generate order1 = new Generate();
        Generate order2 = new Generate();
       
        System.out.println("Received an order for "+order1.rand+" Italian business lunches");
        System.out.println("Received an order for "+order2.rand+" Traditional business lunches");              
        BusinessLunchFactory factory;
        CreateBusinessLunch obj = new CreateBusinessLunch();
        
        factory = BusinessLunchTraditionalFactory.getBusinessLunchTraditionalFactory(); 
        for(int i = 0; i < order2.rand; i++){
             obj.createBusinessLunch(factory);
        }
        
        factory = BusinessLunchItalianFactory.getBusinessLunchItalianFactory();
        for(int i = 0; i < order1.rand; i++){
             obj.createBusinessLunch(factory);
        }        
    }
    
}
 

