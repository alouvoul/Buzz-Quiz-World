/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.util.HashSet;
import java.util.Random;

/**
 * Generate array with random numbers, class which implements the
 * interface Randomization and help us in different aspects of the game.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class RandomGenerate implements Randomization{

    /**
     * Method which generates array with random numbers, we use it for random
     * question category.
     * 
     * @param start from this value
     * @param end to this value
     * @return the array
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
     * Method which generates array with random numbers, we use it for random
     * question category.
     * 
     * @param end to this value
     * @return the array
     */
    @Override
    public int[] generateRandoms(int end) {
        HashSet set = new HashSet();
        Random r = new Random();
        int[] array = new int[end];
        for (int i = 0; i < end; i++) {
            int temp;
            do{
                temp = r.nextInt(end);
            }while(!set.add(temp));
            array[i] = temp;
        }
        return array;
    }

    /**
     * Method which generates array with random numbers, we use it for random
     * show of questions and answer order.
     * 
     * @param start left border for randoms
     * @param end right border for randoms
     * @param array array that we want to swap
     * @return swapped array
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
