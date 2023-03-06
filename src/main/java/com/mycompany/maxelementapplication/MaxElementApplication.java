/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maxelementapplication;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author stipanmadzar
 */


public class MaxElementApplication {

    
    public static double findMaxElement(ArrayList<Double> list, int index, double largest) {
          
        
        if(index == list.size() - 1) {
            return largest;
        }
        
        else if(largest < list.get(index + 1)) {
               largest = list.get(index + 1);
        }
        
        return findMaxElement(list, index + 1, largest);   
    }
   
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        
        System.out.printf("Please enter a number or (-1 to quit the input): ");
        
        double element = scan.nextDouble();
        
        while(element != -1) {
            
            list.add(element);
            System.out.printf("Please enter a number or (-1 to quit the input): ");
            element = scan.nextDouble();
        }
        
        if(list.isEmpty()) {
            System.out.println("List is empty!");
        }
        else {
            System.out.println("Largest is: " + findMaxElement(list, 0, list.get(0)));
        }
       
        scan.close();
    }
    
    
}
