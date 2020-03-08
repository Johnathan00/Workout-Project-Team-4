
package group_uno_workout;

/**
 *
 * @author Cierra Ditmore
 */

public class Output {

    /**
     * returns string for header with integer given in input
     * 
     * @param i integer indicating the round number
     * @return string with html tags to print in header format
     */
    public String print_header(int i){
        String header="<h1><u>Round " + i + "</u></h1>\n";
        return header;
    }

    /**
     * returns string of card with input of condensed version of card
     * 
     * @param card the card from the hand, written in shorthand
     * @return the card type written in more detail
     */
    public String print_card(String card){
        
        if(null == card){
            return "";
        }
        else switch (card) {
            case "B0":
                return "Blue 0";
            case "B1":
                return "Blue 1";
            case "B2":
                return "Blue 2";
            case "B3":
                return "Blue 3";
            case "B4":
                return "Blue 4";
            case "B5":
                return "Blue 5";
            case "B6":
                return "Blue 6";
            case "B7":
                return "Blue 7";
            case "B8":
                return "Blue 8";
            case "B9":
                return "Blue 9";
            case "BD":
                return "Blue Draw 2";
            case "BS":
                return "Blue Skip ";
            case "BR":
                return "Blue Reverse";
            case "G0":
                return "Green 0";
            case "G1":
                return "Green 1";
            case "G2":
                return "Green 2";
            case "G3":
                return "Green 3";
            case "G4":
                return "Green 4";
            case "G5":
                return "Green 5";
            case "G6":
                return "Green 6";
            case "G7":
                return "Green 7";
            case "G8":
                return "Green 8";
            case "G9":
                return "Green 9";
            case "GS":
                return "Green Skip";
            case "GD":
                return "Green Draw 2";
            case "GR":
                return "Green Reverse";
            case "R0":
                return "Red 0";
            case "R1":
                return "Red 1";
            case "R2":
                return "Red 2";
            case "R3":
                return "Red 3";
            case "R4":
                return "Red 4";
            case "R5":
                return "Red 5";
            case "R6":
                return "Red 6";
            case "R7":
                return "Red 7";
            case "R8":
                return "Red 8";
            case "R9":
                return "Red 9";
            case "RS":
                return "Red Skip";
            case "RD":
                return "Red Draw 2";
            case "RR":
                return "Red Reverse";
            case "Y0":
                return "Yellow 0";
            case "Y1":
                return "Yellow 1";
            case "Y2":
                return "Yellow 2";
            case "Y3":
                return "Yellow 3";
            case "Y4":
                return "Yellow 4";
            case "Y5":
                return "Yellow 5";
            case "Y6":
                return "Yellow 6";
            case "Y7":
                return "Yellow 7";
            case "Y8":
                return "Yellow 8";
            case "Y9":
                return "Yellow 9";
            case "YR":
                return "Yellow Reverse";
            case "YD":
                return "Yellow Draw 2";
            case "YS":
                return "Yellow Skip";
            case "W1":
                return "Wild";
            case "W4":
                return "Wild 4";
            default:
                return "";
        }
    }
}
