// Main Class File:    PA8Tester.java
// File:               WildPokemon.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Yutao Ye y8ye@ucsd.edu
// Instructor's Name:  Greg Miranda
//

/**
 * a class that extends Pokemon with sound, type, ball's name.
 * patience, and speed.
 * Bugs: None
 *
 * @author Yutao Ye
 */
public class WildPokemon extends Pokemon {
    private int patience;
    private int speed;
    private int timesEscapedFromBall;

    /**
    * call the parent class default constructor
    *and initialize the member variable value.
    * @param none
    * @return (none)
    */
    public WildPokemon () {
        super();
        this.patience = 100;
        this.speed = 0;
        this.timesEscapedFromBall = 0;
    }

    /**
    * set member variable to pokemonName, pokemonSound, and pokemonType
    * and initialize member variables
    *
    * @param (pokemonName) (the name of the pokemon)
    * @param (pokemonSound) (the sound of the pokemon)
    * @param (pokemonType) (the type of the pokemon)
    * @param (patienceIn) (increment of patience)
    * @param (speedIn) (increment of speed)
    * @return (none)
    */
    public WildPokemon(String pokemonName, String pokemonSound, 
    String pokemonType, int patienceIn, int speedIn) {
        super(pokemonName, pokemonSound, pokemonType);
        this.patience = patienceIn;
        this.speed = speedIn;
        this.timesEscapedFromBall = 0;
    }

    /**
    * get the patience of the wild pokemon
    *
    * @param none
    * @return (patience of the wild pokemon)
    */
    public int getPatience() {
        return this.patience;
    }

    /**
    * get the speed of the wild pokemon
    *
    * @param none
    * @return (speed of the wild pokemon)
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * get the times of the wild pokemon escaped
    *
    * @param none
    * @return (times of the wild pokemon escaped)
    */
    public int getTimesEscapedFromBall() {
        return this.timesEscapedFromBall;
    }

    /**
    * set new patience.
    *
    * @param (newPatience) (the patience at the certain time)
    * @return (none)
    */
    public void setPatience(int newPatience) {
        this.patience = newPatience;
    }

    /**
    * set new speed.
    *
    * @param (newSpeed) (the speed at the certain time)
    * @return (none)
    */
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    /**
    * count the time of escape.
    *
    * @param none
    * @return (none)
    */
    public void incrementTimeEscapedFromBall() {
        this.timesEscapedFromBall += 1;
    }

    /**
    * print message for finding wild pokemon
    *
    * @param none
    * @return (none)
    */
    public void appear() {
        System.out.println("You encounter a wild " 
        + this.getName() + " !");
        this.speak();
    }

    /**
    * find if the wild pokemon disappeared.
    *
    * @param none
    * @return true if patience<=0, orescape more than 3 times.
    */
    public boolean disappear() {
        if (this.patience <= 0) {
            System.out.println(this.getName() + " disappears...");
            return true;
        }
        else if (this.timesEscapedFromBall > 3) {
            System.out.println(this.getName() + " disappears...");
            return true;
        }
        else {
            return false;
        }
    }

    /**
    * find if the pokemon is being caught.
    *
    * @param (berry) (berry)
    * @param (pokeball) (pokeball)
    * @return true
    */
    public boolean isCaught(Berry berry, Pokeball pokeball) {
        return true;
    }
    /**
    * override toString() and print certain message.
    *
    * @param none
    * @return (message about type, ball's name, name, escape times)
    */
    @Override
    public String toString() {
        String message;
        message = this.getName() + ", WildPokemon" + "\n" +
        "type: " + this.getType() +"\n" + "patience: " +
        this.getPatience() + "\n" + "speed: " + this.getSpeed() +
        "\n" + "timeEscapedFromBall: " + this.getTimesEscapedFromBall()
         + "\n";
        return message;
    }
}
