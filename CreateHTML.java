/*
 * Cierra Ditmore
 * CS 2365
 */
package classproject2testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author cmdma
 */
public class CreateHTML {
    
    //called at beginning of program to create file
    //no inputs
    public static void createFile () throws FileNotFoundException {
        File outputFile = new File("output.html");
        PrintStream output = new PrintStream (outputFile);
        
        output.println("<!DOCTYPE html>");
        output.println("<html>");
        output.println("<body>");
    }

    //generic method to append a string to the file as a header
    //takes string as input
    public static void writeHeader (String str) throws IOException{
        String tempLine = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<h1>" + str + "</h1>");
            print.write(tempLine);
        }
    }
    
    //generic method to append string to file as normal paragraph text
    //takes string as input
    public static void writeParagraph (String str) throws IOException{
        String tempLine = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<p>" + str + "</p>");
            print.write(tempLine);
        }
    }
    
    //used to write round number
    //takes int as input
    public static void writeRound (int num) throws IOException{
        String tempLine = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<h1>" + "Round " + num + ":" + "</h1>");
            print.write(tempLine);
        }
    }
    
    //NOT EDITED TO WORK WITH HAND CLASS YET
    //used to write hand to file
    //takes hand as an array
    public static void writeHand (String hand[]) throws IOException{
        String tempLine = "<p>";
        int i;
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            print.write("The current hand is: ");
            
            for (i = 0; i < 7; i++){
                tempLine = tempLine.concat("[" + hand[i] + "] ");
            }
            
            tempLine = tempLine.concat("</p><br>");
            print.write(tempLine);
        }
    }
    
    //used to write exercie amounts to file
    //input is an array with format [color, exercise, number, True/False]
    //true/flase is used to indicate if there is a break
    public static void writeExercises (String [] exercises) throws IOException{
        String tempLine = "";        
        
        for (int i = 0; i < 4; i ++){
            exercises[i] = exercises[i].replace("'", "");
        }
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<p>The number of " + exercises[1] + " to be completed is: " + exercises[2] + "</p>");
            print.write(tempLine);
            
            if ("True".equals(exercises[3])){
                print.write("<p>Then, take a 1 minute break after completing these exercises!</p>");
            }
        }
    }
    
    /*
    public static void writeExercises (int blue, int green, int red, int yellow) throws IOException{
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            print.write("<p>The number of exercises to be completed is: </p>");
            print.write("<table><table border = '1'>");
            print.write("<tr><tr align = 'center'>");
            
            print.write("<th width = '25%'>  Blue  </th>");
            print.write("<th width = '25%'>  Green  </th>");
            print.write("<th width = '25%'>  Red  </th>");
            print.write("<th width = '25%'>  Yellow  </th>");
            
            print.write("</tr><tr><tr align = 'center'>");
            
            print.write("<td>" + blue + "</td>");
            print.write("<td>" + green + "</td>");
            print.write("<td>" + red + "</td>");
            print.write("<td>" + yellow + "</td>");
            
            print.write("</tr></table>");
        }
    }
    
    */
    
    //used to write how many cards are left on the deck
    //takes int as input
    public static void writeDeck (int num) throws IOException{
        String tempLine = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<p>" + "The number of cards left on the deck is: " + num + "</p>");
            print.write(tempLine);
            print.write("------------------------------------------------------------------------------------------<br>");
            
        }
    }
    
    //used to write totals needed at the end of file
    //currently takes each item as an int
    //order is:  total number of exercises, total numver of exercises skipped, max amount of blue exercises completed in one hand,
    //   max amount of green, max amount of red, and max amount of yellow
    public static void writeTotals (int total, int skipped, int maxblue, int maxgreen, int maxred, int maxyellow) throws IOException{
        String tempLineTotal = "";
        String tempLineSkipped = "";
        String tempLineBlue = "";
        String tempLineGreen = "";
        String tempLineRed = "";
        String tempLineYellow = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLineTotal = tempLineTotal.concat("<p>" + "The total number of exercises completed is: " + total + "</p>");
            tempLineSkipped = tempLineSkipped.concat("<p>" + "The total number of exercises skipped is: " + skipped + "</p>");
            tempLineBlue = tempLineBlue.concat("<p>" + "The largest number of Blue completed in one hand was: " + maxblue + "</p>");
            tempLineGreen = tempLineGreen.concat("<p>" + "The largest number of Green completed in one hand was: " + maxgreen + "</p>");
            tempLineRed = tempLineRed.concat("<p>" + "The largest number of Red completed in one hand was: " + maxred + "</p>");
            tempLineYellow = tempLineYellow.concat("<p>" + "The largest number of Yellow completed in one hand was: " + maxyellow + "</p>");
            
            print.write(tempLineTotal);
            print.write(tempLineSkipped);
            print.write(tempLineBlue);
            print.write(tempLineGreen);
            print.write(tempLineRed);
            print.write(tempLineYellow);
            
            print.write("</body>");
            print.write("</html>");
        }
    }
    
    /*
    public static void finishFile () throws IOException{
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            print.write("</body>");
            print.write("</html>");
        }
    }
    */


}
