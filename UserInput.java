/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinputGameState;

import java.util.Scanner;
//import card
// import deck 
// import hand
// import HTML output

/**
 *
 * @author megst
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        userInteraction();
        
    }
    
   
    
    public static void userInteraction() {
        
        //do {} while (pile != 0) 
        // ask user how many decks of cards they want to use
        Scanner deckNoInp = new Scanner(System.in);
        System.out.print("Enter the number of decks you would like to play with (1-3): ");
        int deckNum = deckNoInp.nextInt();
        switch(deckNum) {
            case 1: {
                // one deck of cards
                /* d1 = Deck(); */
            }
            case 2: {
                // two decks of cards
                /* d1 = Deck();
                d2 = Deck() + d1; */
            }
            case 3: {
                // three decks of cards
                /* d1 = Deck();
                d2 = Deck() + d1;
                d3 = Deck() + d2; */
            }
        }
        
        Scanner shuffToge = new Scanner(System.in);
        System.out.print("Would you like to shuffle the decks together or individually? (T or I): ");
        String TorI = shuffToge.nextLine();
        switch(TorI) {
            case "T": {
                // shuffle deck(s) together
                //shufCardsIndivid(deckNum, TorI);
            }
            case "I": {
                // shuffle deck(s) individually
                //shufCardsTogeth(deckNum, TorI);
            }
            case "t": {
                // together
                //shufCardsIndivid(deckNum, TorI);
            }
            case "i": {
                // individually
                //shufCardsTogeth(deckNum, TorI);
            }
        }
        
        Scanner remAc = new Scanner(System.in);
        System.out.print("Would you like to remove action cards? (Y or N): ");
        String YorN = remAc.nextLine();
        switch(YorN) {
            case "Y": {
                // remove action cards
                // removeAction();
            }
            case "N": {
                break;
            }
            case "y": {
                // remove action cards
                // removeAction();
            }
            case "n": {
                break;
            }
        }
    }  
}