// Main Class File:    PA8Tester.java
// File:               Pokeball.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Yutao Ye y8ye@ucsd.edu
// Instructor's Name:  Greg Miranda
//

/**
 * a class that extends Item with performance.
 * 
 * Bugs: None
 *
 * @author Yutao Ye
 */
public class Pokeball extends Item {
    private int performance;

    /**
    * call the parent class default constructor
    *and initialize the member variable value to 0.
    * @param none
    * @return (none)
    */
    public Pokeball() {
        super();
        this.performance = 0;
    }
    /**
    * set member variable to pokeballName, and initialize performance
    *to performanceIn.
    * @param (pokeballName) (the name of the pokeball)
    * @param (performanceIn) (the performance of the ball)
    * @return (none)
    */
    public Pokeball(String pokeballName, int performanceIn) {
        super(pokeballName);
        this.performance = performanceIn;
    }
    /**
    * get the performance data.
    *
    * @param none
    * @return ( the value of the performance variable)
    */
    public int getPerformance() {
        return this.performance;
    }
     /**
    * override toString() and print certain message.
    *
    * @param none
    * @return (message about ball and performance)
    */
    @Override
    public String toString() {
        return super.toString() + 
        "performance: " + this.getPerformance() + "\n";
    }


    
}