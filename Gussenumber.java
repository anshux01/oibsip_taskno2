/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gussenumber;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class Gussenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int randomNumber = rand.nextInt(100)+ 1;
//        System.out.println("ans:"+randomNumber);

int tryCount =0;

System.out.println("Enter your Guess (1-100): ");
while(true){
    int pg = sc.nextInt();
    tryCount++;
    
    if (pg == randomNumber){
        System.out.println("Correct! You win..!");
        System.err.println("It took you "+ tryCount +" tries");
        break;
    }
    else if(randomNumber > pg){
        System.out.println("The number is higher than your number. Guess again. ");
    }
    else {
        System.out.println("The number is Lower than your number. Guess again");
    }
} 
       }
    }
    
}
