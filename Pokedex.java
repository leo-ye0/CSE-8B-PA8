///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment8.java
// File:               Pokedex.java
// Quarter:            CSE 8B Winter 2022
// Author:             Yutao Ye y8ye@ucsd.edu
// Instructor's Name:  Greg Miranda
//
//////////////////////////// 80 columns wide //////////////////////////////////

import java.util.ArrayList;

/**
 * This is Pokedex class that you can add pokemons which can be wild or pal
 * pokemons. You can display your pokedex with display() method
 *
 * Bugs: None known
 *
 * @author Yutao Ye
 */

public class Pokedex {

    // ArrayList for pokemons (WildPokemons, PalPokemons)
    ArrayList<Pokemon> myPokedex;
    
    /**
     * Creates a resizable-array ArrayLists of Pokemons
     * 
     */
    public Pokedex() {
        myPokedex = new ArrayList<>();
    }

    /**
     * Adds the pokemon to myPokedex
     * 
     */
    public void add(Pokemon pokemon) {
        this.myPokedex.add(pokemon);
    }

    /**
     * Displays the elements in the myPokedex ArrayList
     * 
     */
    public void display() {
        System.out.println("Pokemons in the pokedex:");
        if (this.myPokedex.size() == 0) {
            System.out.println("None");
            System.out.println();
        }
        else {
            for(Pokemon pokeDex : myPokedex) {
                System.out.println(pokeDex);
                System.out.println();
            }
        }
    }    
}
