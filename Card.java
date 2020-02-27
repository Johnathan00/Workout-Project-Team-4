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
enum Color{ Red, Green, Blue, Yellow, Wild }
enum Value{ Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Skip, Draw2, Reverse, Wild, WildDraw4 }

public class Card {
    
    //Instance Variables
    private Color color;
    private Value value;
    
    //Constructor
    public Card(Color color, Value value){
        this.color = color;
        this.value = value;
    }
    
    //Mutators
    public void setColor(Color color){
        this.color = color;
    }
    public void setValue(Value value){
        this.value = value;
    }
    
    //Accessors
    public Color getColor(){
        return color;
    }
    public Value getValue(){
        return value;
    }
    
    
}
