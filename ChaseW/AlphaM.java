
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor.
//  */


/**
 *
 * @author chase99
 */
import java.util.*; 
public class AlphaM {

    
    public static void main(String[] args) {
         
        Timer mytimer = new Timer();
        TimerTask Task = new TimerTask() {
            
            long seconds = 0;
            @Override
            public void run() {
                seconds++;
                System.out.println("seconds passed: " + seconds);
            }
        };
        mytimer.scheduleAtFixedRate(Task,1000,1000);
        // we have 1000 because 1000 ms = 1s
        // 1000 , 1000 because we want our timer to start at one second
    }

 }