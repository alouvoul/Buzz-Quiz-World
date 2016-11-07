/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

/**
 *
 * @author alouvoul
 */
public class Bet extends Round{
    private int bet;
    
    public Bet() {
        
    }

    public void setBet(int bet) {
        this.bet = bet;
    }
    
    

    @Override
    public int calculate(boolean answer) {
        int temp;
        if(answer)
            temp = bet;
        else
            temp=-bet;
        
        return temp;
    }
    
}
