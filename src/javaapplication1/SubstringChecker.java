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
public class SubstringChecker implements Checker{

    final String goal;
    SubstringChecker(String goal){
    this.goal = goal;
    
    }
    
    @Override
    public boolean accept(String text) {
     
        String[] words = text.split(" ");
        boolean accepts = false;
        
        for(int i = 0; i < words.length; i ++){
        
            if(words[i].equals(goal)){
            accepts = true;
            i = words.length+1;
            }
        
        
        }
        return accepts;
    }
    
}
