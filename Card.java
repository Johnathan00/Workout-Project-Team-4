/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout;

/**
 *
 * @author Johnathan
 */
enum Colour{ Red, Green, Blue, Yellow, Wild }
enum Value{ Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Skip, Draw2, Reverse, Wild, WildDraw4 }

public class Card {
    
    //Instance Variables
    private Colour colour;
    private Value value;
    
    //Constructor
    public Card(Colour colour, Value value){
        this.colour = colour;
        this.value = value;
    }
    
    //Mutators
    public void setColour(Colour colour){
        this.colour = colour;
    }
    public void setValue(Value value){
        this.value = value;
    }
    
    //Accessors
    public Colour getColour(){
        return colour;
    }
    public Value getValue(){
        return value;
    }
    
    
}
