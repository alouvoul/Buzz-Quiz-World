/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

/**
 * Class - child of class Round, one of the categories of the game, contains
 * the basic functions of this category. The first player that answers correct
 * takes 1000 points and the second 500.
 *
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class fastAnswer extends Round{
    /**
     * variable to keep the order of the players that answer.
     */
    private short position;

    private short correct;
    
    /**
     * Constructor of this obect set the position of the player answer.
     */
    public fastAnswer() {
        position = 1;
        correct = 1;
    }
    
    /**
     * The first player that answer divides 1000 with 1 so takes 1000 points.
     * The second divides 1000/2 so wins 500 points and set position variable again
     * with value 1.
     * 
     * @param answer True or false answered by player
     * @return points to win
     */
    @Override
    public int calculate(boolean answer) {
        int temp = 0;
        if(position>2){
            position = 1;
            correct = 1;
        }
        if(answer){
            points = 1000;
            temp = (int)(points/correct);
            correct++;
        }
        
        position++;
        return temp;
    }
    
}
