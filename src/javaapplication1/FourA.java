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
       boolean test = broccoliChecker.accept("carrots are great");
        if(test){
        System.out.println("It works!");
        
        }
    }
    
}
