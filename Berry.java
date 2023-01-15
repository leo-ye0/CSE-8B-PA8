// Main Class File:    PA8Tester.java
// File:               Berry.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Yutao Ye y8ye@ucsd.edu
// Instructor's Name:  Greg Miranda
//

/**
 * a class that extends Item with berry, patience, speed.
 * 
 * Bugs: None
 *
 * @author Yutao Ye
 */
public class Berry extends Item {
    private int patienceIncrement;
    private int speedDecrement;

    /**
    * call the parent class default constructor
    *and initialize the member variable value to 0.
    * @param none
    * @return (none)
    */
    public Berry() {
        super();
        this.patienceIncrement = 0;
        this.speedDecrement = 0;
    }

    /**
    * set member variable to berryName, and initialize patienceIncrement
    *to patienceInc, and speedDecrement to speedDec.
    * @param (berryName) (the name of the berry)
    * @param (patienceInc) (the pokemon's patience increment)
    * @param (speedDec) (the speed's decrement)
    * @return (none)
    */
    public Berry (String berryName, int patienceInc, int speedDec) {
        super(berryName);
        this.patienceIncrement = patienceInc;
        this.speedDecrement = speedDec;
    }
    /**
    * get the patience increment
    *
    * @param none
    * @return (the patience increment)
    */
    public int getPatienceIncrement() {
        return this.patienceIncrement;
    }

    /**
    * get the speed decrement
    *
    * @param none
    * @return (the speed decrement)
    */
    public int getSpeedDecrement() {
        return this.speedDecrement;
    }

     /**
    * override toString() and print certain message.
    *
    * @param none
    * @return (message about patience, speed, balls)
    */
    @Override
    public String toString() {
        return super.toString() + 
        "patienceIncrement: " + this.getPatienceIncrement() + "\n" +
         "speedDecrement: " + this.getSpeedDecrement() + "\n";
    }
}
