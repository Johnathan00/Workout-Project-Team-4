/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_uno_workout;
import java.util.Arrays;

/**
 *
 * @author 
 */
public class HandTest {
     public static void main(String[] args) {
         // creating a test hand array
        String[]handTest={"1","3","4","3","2","4","1"};
        // creating test hand
        Hand testHand = new Hand(handTest);
        // sorting test hand by color and rank
        testHand.Sort_Hand();
        // finds card at position in hand
        testHand.get_card(0);
        // testing if any skip red cards are in hand
        boolean redSkipTest = testHand.contains_red_skip();
        // testing to delete reds in hand if skip reds exist in hand
        String[] deleteRedsTest = testHand.delete_reds();
        // testing if any skip blue cards are in hand
        boolean blueSkipTest = testHand.contains_blue_skip();
        // testing to delete blue in hand if skip blues exist in hand
        String[] deleteBluesTest = testHand.delete_blues();
        // testing if any skip green cards are in hand
        boolean greenSkipTest = testHand.contains_green_skip();
        // testing to delete greens in hand if skip greens exist in hand
        String[] deleteGreensTest = testHand.delete_greens();
        // testing if any skip yellow cards are in hand
        boolean yellowSkipTest = testHand.contains_yellow_skip();
        // testing to delete yellow in hand if skip yellow exist
        String[] deleteYellowsTest = testHand.delete_yellows();
        // testing to see if hand contains red draw 2
        int redDraw2Test = testHand.contains_red_draw2();
        // testing to see if hand contains blue draw 2
        int blueDraw2Test = testHand.contains_blue_draw2();
        // testing to see if hand contains green draw 2
        int greenDraw2Test = testHand.contains_green_draw2();
        // testing to see if hand contains yellow draw 2
        int yellowDraw2Test = testHand.contains_yellow_draw2();
        // testing to see if hand contains red reverse cards
        boolean redReverseTest = testHand.contains_red_reverse();
        // testing to see if hand contains blue reverse cards
        boolean blueReverseTest = testHand.contains_blue_reverse();
        // testing to see if hand contains green reverse cards
        boolean greenReverseTest = testHand.contains_green_reverse();
        // testing to see if hand contains yellow reverse cards
        boolean yellowReverseTest = testHand.contains_yellow_reverse();
        // testing to see if hand contains zero cards
        int zerosTest = testHand.contains_zeros();
        // testing to see if hand contains wild cards
        int wildTest = testHand.contains_wild();
        // testing to see if hand contains wild 4 cards
        int wild4Test = testHand.contains_wild4();
        // testing to see if user skipped workouts in hand
        int skippedWOTest = testHand.skipped_workouts(handTest);
        // testing to check values of the workout in the hand
        int[] workoutValsTest = testHand.workout_values();
        
    }
}
