/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circles;

// @author chase99

import java.util.*; 

public class Circles {

    public static void main(String[] args) {
        while(true) {
            double pi = 3.14159265359;
            Scanner calmode = new Scanner(System.in);
            System.out.println("(0) - exit");
            System.out.println("(1) - circumfrance");
            System.out.println("(2) - diamiter");
            System.out.println("(3) - radius");
            System.out.print("$: ");
            int mode = calmode.nextInt();
            if(mode == 1) {
                while(true) {
                    System.out.println("circumfrance");
                    Scanner cirmodetool = new Scanner(System.in);
                    System.out.println("(0) - exit");
                    System.out.println("(1) - diamiter");
                    System.out.println("(2) - radius");
                    System.out.print("$: ");
                    int cirmode = cirmodetool.nextInt();
                    if(cirmode == 1) {
                        Scanner di_in = new Scanner(System.in);
                        System.out.print("What is the diamiter: ");
                        double di = di_in.nextDouble();
                        double diamiter = di * pi;
                        System.out.println(diamiter);
                    }
                    if(cirmode == 2) {
                        Scanner rad_in = new Scanner(System.in);
                        System.out.print("whats the radius: ");
                        double rad = rad_in.nextDouble();
                        double rad_diamiter = rad * 2;
                        double rad_diamiter_sol = rad_diamiter * pi;
                        System.out.println(rad_diamiter_sol);
                    }
                    if(cirmode == 0) {
                        break;
                    }
                }
                
            }
            if(mode == 2) {
                while(true) {
                System.out.println("diamiter");
                Scanner dimodetool = new Scanner(System.in);
                System.out.println("(0) - exit");
                System.out.println("(1) - curcumfrance");
                System.out.println("(2) - radius");
                System.out.print("$: ");
                int dimode = dimodetool.nextInt();
                if(dimode == 1) {
                    Scanner cir_in = new Scanner(System.in); 
                    System.out.print("what is the circumfrance: ");
                    double cir = cir_in.nextDouble();
                    double cir_sol = cir / pi; 
                    System.out.println(cir_sol);
                }
                if(dimode == 2) {
                    Scanner rad_in_di = new Scanner(System.in);
                    System.out.print("what is the radius: ");
                    double rad1 = rad_in_di.nextDouble();
                    double rad_sol = rad1 * 2;
                    System.out.println(rad_sol);
                }
                if(dimode == 0) {
                    break;
                    }
                }
                
            }
            if(mode == 3) {
                System.out.println("radius");
                Scanner radmodetool = new Scanner(System.in);
                System.out.println("(0) - exit");
                System.out.println("(1) - circumfrance");
                System.out.println("(2) - diamiter");
                System.out.print("$: ");
                int radmode = radmodetool.nextInt();
                if(radmode == 1) {
                    Scanner rad_cir_in = new Scanner(System.in); 
                    System.out.print("what is the circumfrance: ");
                    double cir_in = rad_cir_in.nextDouble();
                    double di = cir_in / pi;
                    double cir_sol = di / 2;
                    System.out.println(cir_sol);
                }
                if(radmode == 2 ) {
                    Scanner radmodetool1 = new Scanner(System.in);
                    System.out.print("what is the diamiter: ");
                    double rad_di = radmodetool1.nextDouble();
                    double rad_sol = rad_di / 2;
                    System.out.println(rad_sol);
                }
            }
            if(mode == 0) {
                break;
            }
        }
    }
    
}
// session 1 march 26, 2018 - program finished in one two hour session. changes will be made later