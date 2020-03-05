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
enum Value{ Zero , One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Skip, Draw2, Reverse, Wild, Wild4 }

public class Card {
    
    //Instance Variables
    private Color color;
    private Value value;
    
    //Constructor
    public Card(Color color, Value value){
        this.color = color;
        this.value = value;
    }
    
    //Accessors
    public Color getColor(){ //Use this to get the color of the card object at array position
        return color;
    }
    public Value getValue(){ //Use this to get the value of the card object at array position
        return value;
    }
    
    /*
    First 4 cards are 0 of each colour
    Order of Colours are: Red -> Green -> Blue -> Yellow
    Order of Values are: 0 -> 9, With Skip -> Draw2 -> Reverse.
    Action cards are put after the numeric cards
    Wilds are in the last 8 positions
    */
    public Card[] getDeck(boolean action){
        Card[] a = new Card[108];
        for (int i = 0; i < 108; i++){
            a[i] = new Card(null, null);
        }
        Value value = Value.Zero;
        Color color = null;
        a[0].color = Color.Red;
        a[0].value = value;
        a[1].color = Color.Green;
        a[1].value = value;
        a[2].color = Color.Blue;
        a[2].value = value;
        a[3].color = Color.Yellow;
        a[3].value = value;
        
        int count = 0;
        int cnum = -1;
        int vnum = 0;
        
        for (int i = 4; i < 76; i++){
            if (count % 18 == 0){
                cnum++;
                vnum = 0;
            }
            if (count % 2 == 0)
                vnum++;
            
            switch (cnum){
                case 0:
                    color = Color.Red;
                break;
                case 1:
                    color = Color.Green;
                break;
                case 2:
                    color = Color.Blue;
                break;
                case 3:
                    color = Color.Yellow;
                break;
            }
            
            a[i].color = color;
            
            switch (vnum){
                case 1:
                    a[i].value = Value.One;
                break;
                case 2:
                    a[i].value = Value.Two;
                break;
                case 3:
                    a[i].value = Value.Three;
                break;
                case 4:
                    a[i].value = Value.Four;
                break;
                case 5:
                    a[i].value = Value.Five;
                break;
                case 6:
                    a[i].value = Value.Six;
                break;
                case 7:
                    a[i].value = Value.Seven;
                break;
                case 8:
                    a[i].value = Value.Eight;
                break;
                case 9:
                    a[i].value = Value.Nine;
                break;
                
            }
            count++;
            
        }
        
        if (action){
            count = 0;
            cnum = -1;
            vnum = -1;
        
            for (int i = 76; i < 100; i++){
                if (count % 6 == 0){
                    cnum++;
                    vnum = -1;
                }
                if (count % 2 == 0)
                    vnum++;
                
                switch (cnum){
                    case 0:
                        color = Color.Red;
                    break;
                    case 1:
                        color = Color.Green;
                    break;
                    case 2:
                        color = Color.Blue;
                    break;
                    case 3:
                        color = Color.Yellow;
                    break;
                }           
                a[i].color = color;
                
                switch (vnum){
                    case 0:
                        a[i].value = Value.Skip;
                    break;
                    case 1:
                        a[i].value = Value.Draw2;
                    break;
                    case 2:
                        a[i].value = Value.Reverse;
                    break;                
                }
                
                count++;
            }
            
            color = Color.Wild;
            for (int i = 100; i < 108; i+=2){
                a[i].color = color;
                a[i].value = Value.Wild;
                a[i + 1].color = color;
                a[i + 1].value = Value.Wild4;
            }
            
        }
        return a;
    }
}
