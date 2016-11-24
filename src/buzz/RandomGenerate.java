/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author alouvoul
 */
public class RandomGenerate implements Randomization{

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

    @Override
    public int[] generateRandoms(int end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] generateRandoms(int start, int end, String[] array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
