/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.util.HashSet;
import java.util.Random;

/**
 * Generate array with random numbers
 * 
 * @author alouvoul
 */
public class RandomGenerate implements Randomization{

    /**
     * Method to generate array with random numbers
     * @param start From this value
     * @param end To this value
     * @return The array
     */
    @Override
    public int[] generateRandoms(int start, int end) {
        HashSet set = new HashSet();
        Random r = new Random();
        int[] array = new int[end-start];
        for (int i = 0; i < end-start; i++) {
            int temp;
            do{
                temp = r.nextInt(end-start);
            }while(!set.add(temp));
            array[i] = temp;

        }
        return array;
    }
    
    /**
     * 
     * @param end
     * @return 
     */
    @Override
    public int[] generateRandoms(int end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param start
     * @param end
     * @param array
     * @return 
     */
    @Override
    public String[] generateRandoms(int start, int end, String[] array) {
        HashSet set = new HashSet();
        Random r = new Random();
        String[] numberToswap = new String[end-start];
        for (int i = 0; i < end-start; i++) {
            int temp;
            do{
                temp = r.nextInt(end-start);
            }while(!set.add(array[temp]));
            numberToswap[i] = array[temp];

        }
        return numberToswap;
    } 
}