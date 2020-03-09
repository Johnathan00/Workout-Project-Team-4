package group_uno_workout;

/**
 * Main Author: Meghan Engert
 * Secondary Author: Cierra Ditmore
 */
public class TestCase {

    /**
     * Tests all methods in deck class
     */
    public static void testDeck() {
        //creating deck to test functions (Using: 2 deck, yes to action cards)
        Deck testDeck = new Deck(2, true);
        // shuffles decks together
        testDeck.ShuffleDeck(1);
        
        // testing get_end_position
        int endPosTest = testDeck.get_end_position();
        System.out.println("The end position is: " + endPosTest);
        
        // testing getCards
        String cardsGetTest = testDeck.getCards(10);
        System.out.println("Testing cardsGetTest output: " + cardsGetTest);
        
        // testing setCards()
        testDeck.setCards("B4", 10);
        System.out.println("Testing setCards output: " + testDeck.getCards(10));
        // testing start_increment
        
        
        System.out.println("The start before is: " + testDeck.getStart());
        testDeck.start_increment();
        System.out.println("The start after is: " + testDeck.getStart());
        
        // testing Get_cards_left
        int cardsLeftTest = testDeck.Get_cards_left();
        System.out.println("The cards left are: " + cardsLeftTest);
        
        //testing cards_left_decrement
        testDeck.cards_left_decrement();
        System.out.println("The cards left after decrement is: " + testDeck.Get_cards_left());
        

        // testing draw_card
        String drawCardTest = testDeck.draw_card();
        System.out.println("The card drawn is: " + drawCardTest);
        
        // testing cards_left_increment 
        testDeck.cards_left_increment();
        testDeck.cards_left_increment();
        System.out.println("The cards left after increment is: " + testDeck.Get_cards_left());
        testDeck.cards_left_decrement();
        
        // testing return_card
        testDeck.return_card(drawCardTest);
        System.out.println("The cards put back on the deck is: " + testDeck.getCards(testDeck.Get_cards_left()));
    }
     
    /**
     * tests all methods in hand class
     */
    public static void testHand(){
        Deck testDeck = new Deck(2, true);
        testDeck.ShuffleDeck(1);
        
        // creating a test hand array
        String[]hand={"0","0","0","0","0","0","0"};
            //draws cards then throws them into a hand object
            for(int i=0;i<hand.length;i++){
                if(testDeck.Get_cards_left()>0){
                    hand[i]=testDeck.draw_card();
                }
            }
        Hand testHand = new Hand(hand);
        System.out.println("The original hand is: ");
        for(int i=0;i<hand.length;i++){
            if(!"0".equals(hand[i])){
                System.out.print(hand[i]+", ");
            }
        }
        
        
        // sorting test hand by color and rank
        testHand.Sort_Hand();
        System.out.println("\nThe hand sorted is: ");
        for(int i=0;i<hand.length;i++){
            if(!"0".equals(hand[i])){
                System.out.print(hand[i]+", ");
            }
        }
        
        // finds card at position in hand
        System.out.println("\nThe card at position 0 is: " + testHand.get_card(0));
        
        
        
        // testing if any skip red cards are in hand
        boolean redSkipTest = testHand.contains_red_skip();
        System.out.println ("Does the hand contain any red skips?: " + redSkipTest);
        
        // testing to delete reds in hand if skip reds exist in hand
        String[] deleteRedsTest = testHand.delete_reds();
        System.out.println("\nThe reds deleted from the hand are: ");
        for(int i=0;i<hand.length;i++){
            System.out.print(deleteRedsTest[i]+", ");
        }
        
        // testing if any skip blue cards are in hand
        boolean blueSkipTest = testHand.contains_blue_skip();
        System.out.println ("\nDoes the hand contain any blue skips?: " + blueSkipTest);
        
        // testing to delete blue in hand if skip blues exist in hand
        String[] deleteBluesTest = testHand.delete_blues();
        System.out.println("\nThe blues deleted from the hand are: ");
        for(int i=0;i<hand.length;i++){
            System.out.print(deleteBluesTest[i]+", ");
        }
        
        // testing if any skip green cards are in hand
        boolean greenSkipTest = testHand.contains_green_skip();
        System.out.println ("\nDoes the hand contain any green skips?: " + greenSkipTest);
        
        // testing to delete greens in hand if skip greens exist in hand
        String[] deleteGreensTest = testHand.delete_greens();
        System.out.println("\nThe greens deleted from the hand are: ");
        for(int i=0;i<hand.length;i++){
            System.out.print(deleteGreensTest[i]+", ");
        }
        
        // testing if any skip yellow cards are in hand
        boolean yellowSkipTest = testHand.contains_yellow_skip();
        System.out.println ("\nDoes the hand contain any yellow skips?: " + yellowSkipTest);
        
        // testing to delete yellow in hand if skip yellow exist
        String[] deleteYellowsTest = testHand.delete_yellows();
        System.out.println("\nThe yellows deleted from the hand are: ");
        for(int i=0;i<hand.length;i++){
            System.out.print(deleteYellowsTest[i]+", ");
        }
        
        int[]contains={0,0,0,0,0,0};
        for(int i=0;i<hand.length;i++){
            if(testDeck.Get_cards_left()>0){
                hand[i]=testDeck.draw_card();
            }
        }
        testHand = new Hand(hand);
        System.out.println("\n\nThe new hand is: ");
        for(int i=0;i<hand.length;i++){
            if(!"0".equals(hand[i])){
                System.out.print(hand[i]+", ");
            }
        }
        
        // testing to see if hand contains red draw 2
        contains[2] = testHand.contains_red_draw2();
        System.out.println ("\nDoes the hand contain any red draw 2s?: " + contains[2]);
        
        // testing to see if hand contains blue draw 2
        contains[0] = testHand.contains_blue_draw2();
        System.out.println ("\nDoes the hand contain any blue draw 2s?: " + contains[0]);
        
        // testing to see if hand contains green draw 2
        contains[1] = testHand.contains_green_draw2();
        System.out.println ("\nDoes the hand contain any green draw 2s?: " + contains[1]);
        
        // testing to see if hand contains yellow draw 2
        contains[3] = testHand.contains_yellow_draw2();
        System.out.println ("\nDoes the hand contain any yellow draw 2s?: " + contains[3]);
        
        // testing to see if hand contains red reverse cards
        boolean redReverseTest = testHand.contains_red_reverse();
        System.out.println ("\nDoes the hand contain any red reverses?: " + redReverseTest);
        
        // testing to see if hand contains blue reverse cards
        boolean blueReverseTest = testHand.contains_blue_reverse();
        System.out.println ("\nDoes the hand contain any blue reverses?: " + blueReverseTest);
        
        // testing to see if hand contains green reverse cards
        boolean greenReverseTest = testHand.contains_green_reverse();
        System.out.println ("\nDoes the hand contain any green reverses?: " + greenReverseTest);
        
        // testing to see if hand contains yellow reverse cards
        boolean yellowReverseTest = testHand.contains_yellow_reverse();
        System.out.println ("\nDoes the hand contain any yellow reverses?: " + yellowReverseTest);
        
        // testing to see if hand contains zero cards
        int zerosTest = testHand.contains_zeros();
        System.out.println ("\nDoes the hand contain any 0s?: " + zerosTest);
        
        // testing to see if hand contains wild cards
        contains[4] = testHand.contains_wild();
        System.out.println ("\nDoes the hand contain any wilds?: " + contains[4]);
        
        // testing to see if hand contains wild 4 cards
        contains[5] = testHand.contains_wild();
        System.out.println ("\nDoes the hand contain any +4 wilds?: " + contains[5]);
        
        // testing to see if user skipped workouts in hand
        String[]deletions={"B4","B6","0","0","0","0","0"};
        int skippedWOTest = testHand.skipped_workouts(deletions);
        System.out.println ("The amount of workouts skipped is: " + skippedWOTest);
        
        // testing to check values of the workout in the hand
        int[] workoutValsTest = {0,0,0,0,0};
        workoutValsTest = testHand.workout_values();
        System.out.println ("The amount of workouts is: " + workoutValsTest[0]);
    }
    
    /**
     * tests all methods in output class
     */
    public static void testOutput(){
        // testing header output
        Output o = new Output();
        int round = 1;
        System.out.println(o.print_header(round));
        
        // testing print_card
        System.out.println(o.print_card("B3"));
    }
}
