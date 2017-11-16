/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.menu;

/**
 *
 * @author WARNECHA001
 */
import java.io.*;
import java.util.*;
public class FoodMenu {
        public static void main(String[] args) {
        long food_limit = 0; 
        System.out.println("what kind of food do you like");
        long a;
        Scanner var1 = new Scanner(System.in);
        while(food_limit == 0){
        Map<String, String> dynamic_vars = new HashMap<>();
        long i = 0;
        long exit =0;
        while(exit == 0) {     
            System.out.print(">: ");
            Scanner foods = new Scanner(System.in);
            String food = foods.nextLine();
            if(food.equals("STOP")){
                exit += 1;
            }else{ 
               dynamic_vars.put("var" + i, food);
               i += 1;
            }

    }
    
}