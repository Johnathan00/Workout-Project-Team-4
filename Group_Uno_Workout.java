/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_uno_workout;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author torti
 */
public class Group_Uno_Workout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Deck d = new Deck(3,true);
        d.ShuffleDeck(1);
       FileWriter writer=new FileWriter("HTML_Output.html");
       writer.write("<html>\n");
       int round=1;
       int total_push_ups=0;
       int total_burpees=0;
       int total_lunges=0;
       int total_squats=0;
       int total_sit_ups=0;
       Output o=new Output();
        while(d.Get_cards_left()>0){
            writer.write(o.print_header(round));
            round+=1;
            String[]hand={"0","0","0","0","0","0","0"};
            for(int i=0;i<hand.length;i++){
                if(d.Get_cards_left()>0){
                hand[i]=d.draw_card();
                }
            }
            Hand h=new Hand(hand);
            h.Sort_Hand();
            writer.write("<p>Hand is: | ");
            for(int i=0;i<hand.length;i++){
                if(!"0".equals(hand[i])){
                writer.write(o.print_card(hand[i])+" | ");
                System.out.print(hand[i]+", ");
                }
            }
            writer.write("</p>\n");
            System.out.print("\n");
            String[]deletions={"0","0","0","0","0","0","0"};
            if(h.contains_blue_skip()){
                 deletions=h.delete_blues();
                 writer.write("<p>Hand contains Blue Skip (Removes Blue Cards)<br> Removing Cards: | Blue Skip | ");
                 for(int i=0;i<deletions.length;i++){
                     if(!"0".equals(deletions[i])){
                         writer.write(o.print_card(deletions[i]) + " | ");
                     }
                     else{
                         break;
                     }
                 }
                 writer.write("</p>\n");
                 for(int i=0;i<deletions.length;i++){
                     deletions[i]="0";
                }
            }
            if(h.contains_green_skip()){
                deletions=h.delete_greens();
                writer.write("<p>Hand contains Green Skip (Removes Green Cards)<br> Removing Cards: | Green Skip | ");
                 for(int i=0;i<deletions.length;i++){
                     if(!"0".equals(deletions[i])){
                         writer.write(o.print_card(deletions[i]) + " | ");
                     }
                     else{
                         break;
                     }
                 }
                 writer.write("</p>\n");
                for(int i=0;i<deletions.length;i++){
                deletions[i]="0";
                }
            }
            if(h.contains_red_skip()){
                deletions=h.delete_reds();
                writer.write("<p>Hand contains Red Skip (Removes Red Cards)<br> Removing Cards: | Red Skip | ");
                 for(int i=0;i<deletions.length;i++){
                     if(!"0".equals(deletions[i])){
                         writer.write(o.print_card(deletions[i]) + " | ");
                     }
                     else{
                         break;
                     }
                 }
                 writer.write("</p>\n");
                for(int i=0;i<deletions.length;i++){
                deletions[i]="0";
                }
            }
            if(h.contains_yellow_skip()){
                deletions=h.delete_yellows();
                writer.write("<p>Hand contains Yellow Skip (Removes Yellow Cards)<br> Removing Cards: | Yellow Skip | ");
                 for(int i=0;i<deletions.length;i++){
                     if(!"0".equals(deletions[i])){
                         writer.write(o.print_card(deletions[i]) + " | ");
                     }
                     else{
                         break;
                     }
                 }
                 writer.write("</p>\n");
                for(int i=0;i<deletions.length;i++){
                deletions[i]="0";
                }
            }
            int[]contains={0,0,0,0,0,0};
            contains[0]=h.contains_blue_draw2();
            if(contains[0]!=0){
                writer.write("<p>Hand Contains " + contains[0] + " Blue Draw 2s (Multiplies by 2 the amount of Push Ups)</p>\n");
            }
            contains[1]=h.contains_green_draw2();
            if(contains[1]!=0){
                writer.write("<p>Hand Contains " + contains[1] + " Green Draw 2s (Multiplies by 2 the amount of Lunges)</p>\n");
            }
            contains[2]=h.contains_red_draw2();
            if(contains[2]!=0){
                writer.write("<p>Hand Contains: " + contains[2] + " Red Draw 2s (Multiplies by 2 the amount of Sit Ups)</p>\n");
            }
            contains[3]=h.contains_yellow_draw2();
            if(contains[3]!=0){
                writer.write("<p>Hand Contains " + contains[3] + " Yellow Draw 2s (Multiplies by 2 the amount of Squats)</p>\n");
            }
            if(h.contains_blue_reverse()){
                deletions=h.delete_blues();
                int blue_cards=0;
                writer.write("<p>Hand contains Blue Reverse (Returns Blue Cards to bottom of deck + Discards Blue Reverse)<br>");
                 for(int i=0;i<deletions.length;i++){
                     if(!"0".equals(deletions[i])){
                         blue_cards+=1;
                         if(blue_cards==1){
                             writer.write(" Returning Cards: | ");
                         }
                         writer.write(o.print_card(deletions[i]) + " | ");
                     }
                     else{
                         break;
                     }
                 }
                 writer.write("</p>\n");
                for(int i=0;i<deletions.length;i++){
                if(!"0".equals(deletions[i])){
                    d.return_card(deletions[i]);
                    deletions[i]="0";
                }
            }
            }
            if(h.contains_green_reverse()){
                deletions=h.delete_greens();
                int green_cards=0;
                writer.write("<p>Hand contains Green Reverse (Returns Green Cards to bottom of deck + Discards Green Reverse)<br>");
                 for(int i=0;i<deletions.length;i++){
                     if(!"0".equals(deletions[i])){
                         green_cards+=1;
                         if(green_cards==1){
                             writer.write(" Returning Cards: | ");
                         }
                         writer.write(o.print_card(deletions[i]) + " | ");
                     }
                     else{
                         break;
                     }
                 }
                 writer.write("</p>\n");
                for(int i=0;i<deletions.length;i++){
                if(!"0".equals(deletions[i])){
                    d.return_card(deletions[i]);
                    deletions[i]="0";
                }
            }
            }
            if(h.contains_red_reverse()){
                deletions=h.delete_reds();
                int red_cards=0;
                writer.write("<p>Hand contains Red Reverse (Returns Red Cards to bottom of deck + Discards Red Reverse)<br>");
                 for(int i=0;i<deletions.length;i++){
                     if(!"0".equals(deletions[i])){
                         red_cards+=1;
                         if(red_cards==1){
                             writer.write(" Returning Cards: | ");
                         }
                         writer.write(o.print_card(deletions[i]) + " | ");
                     }
                     else{
                         break;
                     }
                 }
                 writer.write("</p>\n");
                for(int i=0;i<deletions.length;i++){
                if(!"0".equals(deletions[i])){
                    d.return_card(deletions[i]);
                    deletions[i]="0";
                }
            }
            }
            if(h.contains_yellow_reverse()){
                deletions=h.delete_yellows();
                int yellow_cards=0;
                writer.write("<p>Hand contains Yellow Reverse (Returns Yellow Cards to bottom of deck + Discards Yellow Reverse)<br>");
                 for(int i=0;i<deletions.length;i++){
                     if(!"0".equals(deletions[i])){
                         yellow_cards+=1;
                         if(yellow_cards==1){
                             writer.write(" Returning Cards: | ");
                         }
                         writer.write(o.print_card(deletions[i]) + " | ");
                     }
                     else{
                         break;
                     }
                 }
                 writer.write("</p>\n");
                for(int i=0;i<deletions.length;i++){
                if(!"0".equals(deletions[i])){
                    d.return_card(deletions[i]);
                    deletions[i]="0";
                }
            }
            }
            contains[4]=h.contains_wild();
            if(contains[4]!=0){
                writer.write("<p>Hand Contains " + contains[4] + " Wild Cards (Adds 10 Burpees to Workout)</p>\n");
            }
            contains[5]=h.contains_wild4();
            if(contains[5]!=0){
                writer.write("<p>Hand Contains " + contains[5] + " Wild Draw 4 Cards (Adds 10 Burpees to Workout + Multiplies the number of repetitions in every workout by 4)</p>\n");
            }
            writer.write("<p>New Hand after action cards are applied is: | ");
                for(int i=0;i<hand.length;i++){
                    if(!("0".equals(hand[i])) && !("00".equals(hand[i]))){
                        writer.write(o.print_card(hand[i]) + " | ");
                    }
                }
                writer.write("</p>\n");
            int[]workout_values={0,0,0,0,0};
            workout_values=h.workout_values();
            if(contains[0]!=0){
                workout_values[0]=workout_values[0]*(int)Math.pow(2,contains[0]);
            }
            if(contains[1]!=0){
                workout_values[1]=workout_values[1]*(int)Math.pow(2,contains[1]);
            }
            if(contains[2]!=0){
                workout_values[2]=workout_values[2]*(int)Math.pow(2,contains[2]);
            }
            if(contains[3]!=0){
                workout_values[3]=workout_values[3]*(int)Math.pow(2,contains[3]);
            }
            if(contains[4]!=0){
                workout_values[4]=workout_values[4]+(10*contains[4]);
            }
            if(contains[5]!=0){
                workout_values[4]=workout_values[4]+(10*contains[5]);
                workout_values[0]=workout_values[0]*(int)Math.pow(4,contains[5]);
                workout_values[1]=workout_values[1]*(int)Math.pow(4,contains[5]);
                workout_values[2]=workout_values[2]*(int)Math.pow(4,contains[5]);
                workout_values[3]=workout_values[3]*(int)Math.pow(4,contains[5]);
            }
            total_push_ups+=workout_values[0];
            total_lunges+=workout_values[1];
            total_sit_ups+=workout_values[2];
            total_squats+=workout_values[3];
            total_burpees+=workout_values[4];
            writer.write("<p>Values for each workout are:<br>");
            writer.write("Push Ups = " + workout_values[0] + "<br>");
            writer.write("Lunges = " + workout_values[1] + "<br>");
            writer.write("Sit Ups = " + workout_values[2] + "<br>");
            writer.write("Squats = " + workout_values[3] + "<br>");
            writer.write("Burpees = " + workout_values[4] + "</p>\n");
            
            for(int i=0;i<workout_values.length;i++){
                System.out.print(workout_values[i]+", ");
            }
            System.out.print("\n");
            writer.write("<p> Cards Left: " + d.Get_cards_left() + "</p>\n");
        }
        writer.write("<h1><u>Summary</u></h1>\n");
         writer.write("<p>Total Values for each workout are:<br>");
            writer.write("Push Ups = " + total_push_ups + "<br>");
            writer.write("Lunges = " + total_lunges + "<br>");
            writer.write("Sit Ups = " + total_sit_ups + "<br>");
            writer.write("Squats = " + total_squats + "<br>");
            writer.write("Burpees = " + total_burpees + "</p>\n");
        writer.write("</html>\n");
        writer.close();
    }
    
}
