/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author WARNECHA001
 */
import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random dice = new Random();
         // for a random number
        int var1;
        for (int counter = 1; counter<=10; counter++) {
            // rolls a dice 10 times 
            var1 = 1+dice.nextInt(6);
            System.out.println( var1 + " "); 
        } 
        
    }
    
}
