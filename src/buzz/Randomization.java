/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

/**
 * Interface for generate random numbers.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public interface Randomization {

    /**
     * 
     * @param start
     * @param end
     * @return 
     */
    public int[] generateRandoms(int start, int end);
    
    /**
     * 
     * @param end
     * @return 
     */
    public int[] generateRandoms(int end);
    
    /**
     * 
     * @param start
     * @param end
     * @param array
     * @return 
     */
    public String[] generateRandoms(int start, int end, String[] array);
}
