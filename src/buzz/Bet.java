/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

/**
 * 
 * 
 * @author alouvoul
 */
public class Bet extends Round{
    
    public Bet() {
        
    }
    

    @Override
    public int calculate(boolean answer) {
        int temp;
        if(answer)
            temp = points;
        else
            temp=-points;
        
        return temp;
    }
    
}
