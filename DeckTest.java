/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_uno_workout;

/**
 *
 * @author Meghan Engert
 * @Course CS 2365
 * @Project 2
 */
public class DeckTest {
     public static void main(String[] args) {
        //creating deck to test functions (Using: 2 deck, yes to action cards)
        Deck testDeck = new Deck(2, true);
        // shuffles decks together
        testDeck.ShuffleDeck(1);
        // testing get_end_position
        int endPosTest = testDeck.get_end_position();
        // testing getCards
        String cardsGetTest = testDeck.getCards(10);
        // testing setCards()
        testDeck.setCards("B4", 10);
        // testing start_increment
        testDeck.start_increment();
        // testing Get_cards_left
        int cardsLeftTest = testDeck.Get_cards_left();
        testDeck.cards_left_decrement();
        // testing draw_card
        String drawCardTest = testDeck.draw_card();
        // testing cards_left_increment 
        testDeck.cards_left_increment();
        // testing return_card
        testDeck.return_card();
    }
     
}
