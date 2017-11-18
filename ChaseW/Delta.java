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
        System.out.println("type 'n' to exit");
        while(true){
            System.out.println("whats your name");
            System.out.print(":$ ");
            //String usrname;
            long exit = 0;
            Scanner Sc = new Scanner(System.in);
            String name = Sc.nextLine();
            //while(exit == 0) {
            System.out.println(name + " " + "is this right?");
            System.out.println("Type y for yes n for no");
            System.out.print(":$ ");
            String next = Sc.nextLine();
            if(next.equals("n")){
                continue;
            }
            break;
        }
        while(true) {
        System.out.println("Hello welcome to your cortex");
        System.out.println("this is your base of operations when you want to come back type 'cortex'");
        System.out.println("press any key to continue");
            Scanner crtx = new Scanner(System.in);
            String crtx1 = crtx.nextLine();
            if(crtx1.equals("cortex")) {
                continue;
            }
            break;   
        }
        while (true) {
            System.out.println("this is your helment its your gateway into Delta");
            System.out.println("this helment tranfers your consciousness into an ");
            System.out.println("interactive AI it can be used for anything form ");
            System.out.println("gaming to deadly warfare"); 
            
        break;
        }
            
    }
}
