/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delta;

import java.util.*;
public class Delta {
    public static void main(String[] args) {
        System.out.println("Hello Welcome To Delta!");
        while(true){
            System.out.println("whats your name");
            System.out.print(">:$ ");
            //String usrname;
            long exit = 0;
            Scanner Sc = new Scanner(System.in);
            String name = Sc.nextLine();
            //while(exit == 0) {
            System.out.println(name + " " + "is this right?");
            System.out.println("Type y for yes n for no");
            String next = Sc.nextLine();
            if(next.equals("n")){
                continue;
            }
            break;
            // write code here
        }
                
    }

}
