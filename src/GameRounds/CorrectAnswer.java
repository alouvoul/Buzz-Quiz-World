/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

/**
 * Class - child of class Round, one of the categories of the game, contains
 * the basic functions of this category.
 *
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class CorrectAnswer extends Round{
    public static final int POINTS_CORRECT_ANSWER = 1000;
    
    /**
     * Constructor of the class, initialize the points of the player.
     */
    public CorrectAnswer() {
        points = POINTS_CORRECT_ANSWER;
    }

    /**
     * Overrides method of parent class Round and calculate and return the
     * points of the player.
     * 
     * @param answer
     * @return 
     */
    @Override
    public int calculate(boolean answer) {
        if(answer){
            return (int)points;
        }
        
        return 0;
    }
}
