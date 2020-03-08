package group_uno_workout;

import java.util.Arrays;

/**
 *
 * @author Sadman Ahmed Shanto
 * @project 2
 * @course CS 2365
 *
 */
public class Hand {
   private String[]hand;
//constructor for hand
    public Hand(String[]hand1){
        hand=hand1;
    } 
//sorts the hand
    public void Sort_Hand(){
        Arrays.sort(hand);
    }
//gets card at position in hand
    public String get_card(int position){
        return hand[position];
    } 
//returns true if hand contains red skip, false otherwise
    public boolean contains_red_skip(){
        for(int i=0;i<hand.length;i++){
            if("RS".equals(hand[i])){
                hand[i]="0";
                return true;
            }
        }
        return false;
    }
//deletes all red cards from hand
    public String[] delete_reds(){
        String[]Red_Cards={"0","0","0","0","0","0","0"};
        int reds=0;
        for(int i=0;i<hand.length;i++){
            if(hand[i]!=null && 'R'==hand[i].charAt(0)){
                Red_Cards[reds]=hand[i];
                hand[i]="00";
                reds+=1;
            }
        }
        return Red_Cards;
    }
//returns true if hand contains blue skip, false otherwise
    public boolean contains_blue_skip(){
        for(int i=0;i<hand.length;i++){
            if("BS".equals(hand[i])){
                hand[i]="0";
                return true;
            }
        }
        return false;
    }
//deletes all blue cards from hand
    public String[] delete_blues(){
        String[]Blue_Cards={"0","0","0","0","0","0","0"};
        int blues=0;
        for(int i=0;i<hand.length;i++){
            if(hand[i]!=null && 'B'==(hand[i].charAt(0))){
                Blue_Cards[blues]=hand[i];
                hand[i]="00";
                blues+=1;
            }
        }
        return Blue_Cards;
    }
//returns true if hand contains green skip, false otherwise
    public boolean contains_green_skip(){
        for(int i=0;i<hand.length;i++){
            if("GS".equals(hand[i])){
                hand[i]="0";
                return true;
            }
        }
        return false;
    }
//deletes all green cards from hand
    public String[] delete_greens(){
        String[]Green_Cards={"0","0","0","0","0","0","0"};
        int greens=0;
        for(int i=0;i<hand.length;i++){
            if(hand[i]!=null && hand[i].charAt(0)=='G'){
                Green_Cards[greens]=hand[i];
                hand[i]="00";
                greens+=1;
            }
        }
        return Green_Cards;
    }
//returns true if hand contains yellow skip, false otherwise
    public boolean contains_yellow_skip(){
        for(int i=0;i<hand.length;i++){
            if("YS".equals(hand[i])){
                hand[i]="0";
                return true;
            }
        }
        return false;
    }
//deletes all yellow cards from hand
    public String[] delete_yellows(){
        String[]Yellow_Cards={"0","0","0","0","0","0","0"};
        int yellows=0;
        for(int i=0;i<hand.length;i++){
            if(hand[i]!=null && (hand[i].charAt(0))=='Y'){
                Yellow_Cards[yellows]=hand[i];
                hand[i]="00";
                yellows+=1;
            }
        }
        return Yellow_Cards;
    }
//returns true if hand contains red draw 2, false otherwise
    public int contains_red_draw2(){
        int red_draw2s=0;
        for(int i=0;i<hand.length;i++){
            if("RD".equals(hand[i])){
                red_draw2s+=1;
                hand[i]="0";
            }
        }
        return red_draw2s;
    }
//returns true if hand contains blue draw 2, false otherwise
    public int contains_blue_draw2(){
        int blue_draw2s=0;
        for(int i=0;i<hand.length;i++){
            if("BD".equals(hand[i])){
                blue_draw2s+=1;
                hand[i]="0";
            }
        }
        return blue_draw2s;
    }
//returns true if hand contains green draw 2, false otherwise
    public int contains_green_draw2(){
        int green_draw2s=0;
        for(int i=0;i<hand.length;i++){
            if("GD".equals(hand[i])){
                green_draw2s+=1;
                hand[i]="0";
            }
        }
        return green_draw2s;
    }
//returns true if hand contains yellow draw 2, false otherwise
    public int contains_yellow_draw2(){
        int yellow_draw2s=0;
        for(int i=0;i<hand.length;i++){
            if("YD".equals(hand[i])){
                yellow_draw2s+=1;
                hand[i]="0";
            }
        }
        return yellow_draw2s;
    }
//returns true if hand contains red reverse, false otherwise
    public boolean contains_red_reverse(){
        for(int i=0;i<hand.length;i++){
            if("RR".equals(hand[i])){
                hand[i]="0";
                return true;
            }
        }
        return false;
    }
//returns true if hand contains blue reverse, false otherwise
    public boolean contains_blue_reverse(){
        for(int i=0;i<hand.length;i++){
            if("BR".equals(hand[i])){
                hand[i]="0";
                return true;
            }
        }
        return false;
    }
//returns true if hand contains green reverse, false otherwise
    public boolean contains_green_reverse(){
        for(int i=0;i<hand.length;i++){
            if("GR".equals(hand[i])){
                hand[i]="0";
                return true;
            }
        }
        return false;
    }
//returns true if hand contains yellow reverse, false otherwise
    public boolean contains_yellow_reverse(){
        for(int i=0;i<hand.length;i++){
            if("YR".equals(hand[i])){
                hand[i]="0";
                return true;
            }
        }
        return false;
    }
//returns an int for how many zero cards are in the hand
    public int contains_zeros(){
        int zeros=0;
        for(int i=0;i<hand.length;i++){
            if("B0".equals(hand[i]) || "G0".equals(hand[i]) || "R0".equals(hand[i]) || "Y0".equals(hand[i])){
                zeros+=1;
                hand[i]="0";
            }
        }
        return zeros;
    }
//returns an int for how many wilds are in the hand
    public int contains_wild(){
        int wilds=0;
        for(int i=0;i<hand.length;i++){
            if("W1".equals(hand[i])){
                wilds+=1;
                hand[i]="0";
            }
        }
        return wilds;
    }
//returns an int for how many wild draw 4s are in the hand
    public int contains_wild4(){
        int wild4s=0;
        for(int i=0;i<hand.length;i++){
            if("W4".equals(hand[i])){
                wild4s+=1;
                hand[i]="0";
            }
        }
        return wild4s;
    }
//returns an int for computation of workouts given in string input, only one color of 
//card should be in string since it takes input straight from delete functions
    public int skipped_workouts(String[]deletions){
        int skips=0;
        for(int i=0;i<deletions.length;i++){
            if(deletions[i]!=null && (deletions[i].charAt(0))=='B'){
                skips+=Character.getNumericValue(deletions[i].charAt(1));
            }
            if(deletions[i]!=null && deletions[i].charAt(0)=='G'){
                skips+=Character.getNumericValue(deletions[i].charAt(1));
            }
            if(deletions[i]!=null && deletions[i].charAt(0)=='R'){
                skips+=Character.getNumericValue(deletions[i].charAt(1));
            }
            if(deletions[i]!=null && deletions[i].charAt(0)=='Y'){
                skips+=Character.getNumericValue(deletions[i].charAt(1));
            }
        }
        return skips;
}
//returns in array of ints the workout values for each color of
//card, adds number values of cards in hand
    public int[]workout_values(){
        int[]workout_values={0,0,0,0,0};
        for(int i=0;i<hand.length;i++){
            if(hand[i]!=null && (hand[i].charAt(0))=='B'){
                workout_values[0]+=Character.getNumericValue(hand[i].charAt(1));
            }
            if(hand[i]!=null && hand[i].charAt(0)=='G'){
                workout_values[1]+=Character.getNumericValue(hand[i].charAt(1));
            }
            if(hand[i]!=null && hand[i].charAt(0)=='R'){
                workout_values[2]+=Character.getNumericValue(hand[i].charAt(1));
            }
            if(hand[i]!=null && hand[i].charAt(0)=='Y'){
                workout_values[3]+=Character.getNumericValue(hand[i].charAt(1));
            }
        }
        return workout_values;
    }
}