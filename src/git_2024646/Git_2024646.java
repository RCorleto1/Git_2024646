/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024646;
import java.util.Scanner;
/**
 *
 * @author rorro
 */
public class Git_2024646 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //This is the input that will allow the users to type anything they want.
        Scanner myKB = new Scanner(System.in);
        //This are my variables.
        String userInput;
        String upperCase;
        
    //I added the "try" to my code to avoid that the program crashes.   
    try{
        
        //This will be the request that the program will ask to the user.
        System.out.println("Type your name please:");
        System.out.println("Remember that you must type text only."); 
        
        //I used the string method "trim" to cut any spaces that the user could have misstyped.
        userInput = myKB.nextLine().trim();
        
        //I added the condition "if" to avoid that the user types any number on the program.
        if (!userInput.matches("[a-zA-Z.!,? '\"]+")){
            
            //If the user type any number then the program will display a message asking to try again.
            do{
                //This is the output that will be shown if the user type a number.
                System.out.println("No numbers allowed, try again please:");
                
                //This is the designated space for the user to type in.
                userInput = myKB.nextLine().trim();
                   
            } 
            //The loop will continue until this condition is not true anymore.
            while (!userInput.matches("[a-zA-Z.!,? '\"]+"));
        }
        //I designate the variable to add string methods on my program and make it short.
        upperCase = userInput.substring(0,1).toUpperCase() + userInput.substring(1);
        
        //This friendly output will give your response with a capital letter at the begining 
        //as well as telling you how many characters it has.
        System.out.println("Hello " + upperCase + " nice to meet you.");
        System.out.println("Your name has " + userInput.length() + " characters by the way.");
        
    }
    //This will be the message that will show up in case the program wants to crash.
    catch (Exception e){
          System.out.println("That is not a letter, please try again:");
        System.out.println("Rodrigo Corleto 2024646");
    }
    
}
