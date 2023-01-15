///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment8.java
// File:               Item.java
// Quarter:            CSE 8B Winter 2022
// Author:             Yutao Ye y8ye@ucsd.edu
// Instructor's Name:  Greg Miranda
//
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * Tests written to check if other classes work as intended
 *
 * Bugs: None known
 *
 */
public class PA8Tester {
    public static void main (String[] args) {
        System.out.println("\n-------------------------------------------\n");

        /* PART 1 */
        
        Pokeball ball1 = new Pokeball("Regular Ball", 0);
        Pokeball ball2 = new Pokeball("Ultra Ball", 30);
    
        System.out.println(ball1.getName());
        System.out.println("performance: " + ball1.getPerformance());
        
        System.out.println();

        System.out.println(ball2.getName());
        System.out.println("performance: " + ball2.getPerformance());




        System.out.println("\n-------------------------------------------\n");
        
        /* PART 2 */
        
        Berry berry1 = new Berry("Razz Berry", 10, 0);
        Berry berry2 = new Berry("Naanap Berry", 0, 10);

        System.out.println(berry1.getName());
        System.out.println("patienceIncrement: " + 
        berry1.getPatienceIncrement());
        System.out.println("speedDecrement: " + berry1.getSpeedDecrement());

        System.out.println();

        System.out.println(berry2.getName());
        System.out.println("patienceIncrement: " + 
        berry2.getPatienceIncrement());
        System.out.println("speedDecrement: " + berry2.getSpeedDecrement());




        System.out.println("\n-------------------------------------------\n");

        /* PART 3 */
        
        PalPokemon pal1 = new PalPokemon("Bulbasaur", "bulb", "grass", 
        "Great Ball");
        PalPokemon pal2 = new PalPokemon("Mew", "mew", "psychic", 
        "Ultra Ball");

        System.out.println(pal1.getName());
        System.out.println("sound: " + pal1.getSound());
        System.out.println("type: " + pal1.getType());
        System.out.println("pokeballName: " + pal1.getPokeballName());

        System.out.println();

        System.out.println(pal2.getName());
        System.out.println("sound: " + pal2.getSound());
        System.out.println("type: " + pal2.getType());
        System.out.println("pokeballName: " + pal2.getPokeballName());

        System.out.println();
        
        pal1.comesOutFromBall();
        pal2.comesOutFromBall();



        System.out.println("\n-------------------------------------------\n");

        /* PART 4 */
        
        WildPokemon wild1 = new WildPokemon("Pikachu", "pikapika", "electric",
        60, 25);
        WildPokemon wild2 = new WildPokemon("Charmander", "char", "fire", 
        50, 20);

        System.out.println(wild1.getName());
        System.out.println("sound: " + wild1.getSound());
        System.out.println("type: " + wild1.getType());
        System.out.println("patience: " + wild1.getPatience());
        System.out.println("speed: " + wild1.getSpeed());
        System.out.println("timesEscapedFroBall" + 
        wild1.getTimesEscapedFromBall());

        System.out.println();

        System.out.println(wild2.getName());
        System.out.println("sound: " + wild2.getSound());
        System.out.println("type: " + wild2.getType());
        System.out.println("patience: " + wild2.getPatience());
        System.out.println("speed: " + wild2.getSpeed());
        System.out.println("timesEscapedFroBall: " + 
        wild2.getTimesEscapedFromBall());

        System.out.println();

        wild1.appear();
        wild2.appear();

        wild1.disappear();
        wild2.disappear();





        System.out.println("\n-------------------------------------------\n");

        /* PART 5 */
        
        // Create and display the empty backpack
        Backpack Items1 = new Backpack();
        Items1.display();


        // TODO2: Add 2 pokeballs that were created in part 1 
        //       to the backpack and display the backpack
        Items1.add(ball1);
        Items1.add(ball2);
        Items1.display();

        // TODO3: Add 2 berries that were created in part 2 
        //       to the backpack and display the backpack
        Items1.add(berry1);
        Items1.add(berry2);
        Items1.display();

        // TODO4: Create and display the empty pokedex
        Pokedex poke1 = new Pokedex();
        poke1.display();

        // TODO5: Add 2 pal pokemons that were created in part 3
        //        to the pokedex and display the backpack
        poke1.add(pal1);
        poke1.add(pal2);
        poke1.display();

        // TODO6: Add 2 wild pokemons that were created in part 4
        //        to the pokedex and display the backpack
        poke1.add(wild1);
        poke1.add(wild2);
        poke1.display();
    }
}
