/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author hailey.jones
 */
public class FourA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Checker broccoliChecker = new SubstringChecker("broccoli");
        Checker turkey = new SubstringChecker("turkey");
        Checker and = new AndChecker(turkey, broccoliChecker);
        Checker no = new NotChecker(turkey);
       boolean test = and.accept("turkey pudding and broccoli");
       boolean tried = no.accept("pudding");
       
        if(test){
        System.out.println("It has both");
        
        }else{System.out.println("It has neither");}
        
        if(tried){
        System.out.println("It doesn't have it.");
        
        }else{System.out.println("It has it");}
        
    }
    
}
