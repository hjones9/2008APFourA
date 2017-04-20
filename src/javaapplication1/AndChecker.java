/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Hailey.Jones
 */
public class AndChecker implements Checker{
    final Checker one, two;
    
    AndChecker(Checker first, Checker second){
    
    one = first;
    two = second;   
    }
    
    @Override
    public boolean accept(String text) {
        boolean accepts = false;
        
        if((one.accept(text)&&(two.accept(text)))){
        accepts = true;
        }
        return accepts;
    
    }
    
}
