/*
Name: Kennedy Keyes
Date: October 24, 2021
Program: CartoonCharacterArray.java
Description: This program will create and initialize an array of cartoon 
characters and print how many elements are in the array.
 */
package cartoon.character.array;
import java.util.Arrays;

/**
 *
 * @author codingken
 */
public class CartoonCharacterArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create an array of cartoon characters
        String[] cartoonCharacters = {"Patrick Star", "Bugs Bunny", 
            "Johnny Bravo", "Omni Man", "Ash Ketchum", "Peppa Pig", "Beast Boy",
            "Starfire", "Eda Clawthorne", "Rarity"};
        
        // Print the array
        System.out.println(Arrays.toString(cartoonCharacters));
        
        // Print to the user how many elements are in the array
        System.out.printf("I have %d elements stored in my array.%n", 
                cartoonCharacters.length);
    }
    
}
