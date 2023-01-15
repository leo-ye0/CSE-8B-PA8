// Main Class File:    PA8Tester.java
// File:               PalPokemon.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Yutao Ye y8ye@ucsd.edu
// Instructor's Name:  Greg Miranda
//

/**
 * a class that extends Pokemon with sound, type, ball's name.
 * 
 * Bugs: None
 *
 * @author Yutao Ye
 */
public class PalPokemon extends Pokemon {
    private String pokeballName;

     /**
    * call the parent class default constructor
    *and initialize the member variable value to "undefined".
    * @param none
    * @return (none)
    */
    public PalPokemon() {
        super();
        this.pokeballName = "undefined";
    }

     /**
    * set member variable to pokemonName, pokemonSound, and pokemonType
    * and initialize member variables
    *
    * @param (pokemonName) (the name of the pokemon)
    * @param (pokemonSound) (the sound of the pokemon)
    * @param (pokemonType) (the type of the pokemon)
    * @param (pokeballName) (the name of the pokeball)
    * @return (none)
    */
    public PalPokemon (String pokemonName, String pokemonSound, 
    String pokemonType, String pokeballName) {
        super(pokemonName, pokemonSound, pokemonType);
        this.pokeballName = pokeballName;
    }

     /**
    * get the name of the pokeball
    *
    * @param none
    * @return (name of the pokeball)
    */
    public String getPokeballName() {
        return this.pokeballName;
    }

     /**
    * get the message about what's coming out from the ball
    *
    * @param none
    * @return (none)
    */
    public void comesOutFromBall() {
        System.out.print(this.getName() + " in " + this.getPokeballName());
        System.out.println(" , " + this.getType() + " type pokemon.");
        //make the pokemon speak
        this.speak();
    }

    /**
    * override toString() and print certain message.
    *
    * @param none
    * @return (message about type, ball's name, name)
    */
    @Override
    public String toString() {
        String message;
        message = this.getName() + ", PalPokemon" + "\n" + "pokeballName: "
         + this.getPokeballName() + "\n" + "type: " + this.getType()
         + "\n";
        return message;
    }
}
