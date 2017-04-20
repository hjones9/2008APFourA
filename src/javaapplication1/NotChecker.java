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
public class NotChecker implements Checker{
    final Checker object;
    
    NotChecker(Checker checker){
    
    object = checker;
    }
    
    @Override
    public boolean accept(String text) {
        boolean accepts;
       if(object.accept(text)){
       accepts = false;
       }else{accepts = true;}
       return accepts;
    
    }
    
    
    
}
