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
    
    public static void createFile () throws FileNotFoundException {
        File outputFile = new File("output.html");
        PrintStream output = new PrintStream (outputFile);
        
        output.println("<!DOCTYPE html>");
        output.println("<html>");
        output.println("<body>");
    }

    public static void writeHeader (String str) throws IOException{
        String tempLine = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<h1>" + str + "</h1>");
            print.write(tempLine);
        }
    }
    
    public static void writeParagraph (String str) throws IOException{
        String tempLine = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<p>" + str + "</p>");
            print.write(tempLine);
        }
    }
    
    public static void writeRound (int num) throws IOException{
        String tempLine = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<h1>" + "Round " + num + ":" + "</h1>");
            print.write(tempLine);
        }
    }
    
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
    
    /*
    public static void writeExercises (int blue, int green, int red, int yellow) throws IOException{
        String tempLineB = "";
        String tempLineG = "";
        String tempLineR = "";
        String tempLineY = "";
        
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLineB = tempLineB.concat("<p>" + "Number of Blue exercise: " + blue + "</p>");
            tempLineG = tempLineG.concat("<p>" + "Number of Green exercise: " + green + "</p>");
            tempLineR = tempLineR.concat("<p>" + "Number of Red exercise: " + red + "</p>");
            tempLineY = tempLineY.concat("<p>" + "Number of Yellow exercise: " + yellow + "</p>");
            
            print.write(tempLineB);
            print.write(tempLineG);
            print.write(tempLineR);
            print.write(tempLineY);
        }
    }
    */
    
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
    
    public static void writeDeck (int num) throws IOException{
        String tempLine = "";
        
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            tempLine = tempLine.concat("<p>" + "The number of cards left on the deck is: " + num + "</p>");
            print.write(tempLine);
            print.write("------------------------------------------------------------------------------------------<br>");
            
        }
    }
    
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
        }
    }
    
    public static void finishFile () throws IOException{
        try (BufferedWriter print = new BufferedWriter(new FileWriter("output.html",true))) {
            print.write("</body>");
            print.write("</html>");
        }
    }


}
