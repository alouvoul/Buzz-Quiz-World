/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

/**
 * Interface for generate random numbers.
 * 
 * @author alouvoul
 */
public interface Randomization {

    public int[] generateRandoms(int start, int end);
    
    public int[] generateRandoms(int end);
    
    public String[] generateRandoms(int start, int end, String[] array);
}
