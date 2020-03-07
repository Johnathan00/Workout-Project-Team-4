
package group_uno_workout;

/**
 *
 * @author 
 */
public class Output {
//returns string for header with integer given in input
    public String print_header(int i){
        String header="<h1><u>Round " + i + "</u></h1>\n";
        return header;
    }
//returns string of card with input of condensed version of card
    public String print_card(String card){
        
        if("B0".equals(card)){
            return "Blue 0";
        }
        else if("B1".equals(card)){
            return "Blue 1";
        }
        else if("B2".equals(card)){
            return "Blue 2";
        }
        else if("B3".equals(card)){
            return "Blue 3";
        }
        else if("B4".equals(card)){
            return "Blue 4";
        }
        else if("B5".equals(card)){
            return "Blue 5";
        }
        else if("B6".equals(card)){
            return "Blue 6";
        }
        else if("B7".equals(card)){
            return "Blue 7";
        }
        else if("B8".equals(card)){
            return "Blue 8";
        }
        else if("B9".equals(card)){
            return "Blue 9";
        }
        else if("BD".equals(card)){
            return "Blue Draw 2";
        }
        else if("BS".equals(card)){
            return "Blue Skip ";
        }
        else if("BR".equals(card)){
            return "Blue Reverse";
        }
        else if("G0".equals(card)){
            return "Green 0";
        }
        else if("G1".equals(card)){
            return "Green 1";
        }
        else if("G2".equals(card)){
            return "Green 2";
        }
        else if("G3".equals(card)){
            return "Green 3";
        }
        else if("G4".equals(card)){
            return "Green 4";
        }
        else if("G5".equals(card)){
            return "Green 5";
        }
        else if("G6".equals(card)){
            return "Green 6";
        }
        else if("G7".equals(card)){
            return "Green 7";
        }
        else if("G8".equals(card)){
            return "Green 8";
        }
        else if("G9".equals(card)){
            return "Green 9";
        }
        else if("GS".equals(card)){
            return "Green Skip";
        }
        else if("GD".equals(card)){
            return "Green Draw 2";
        }
        else if("GR".equals(card)){
            return "Green Reverse";
        }
        else if("R0".equals(card)){
            return "Red 0";
        }
        else if("R1".equals(card)){
            return "Red 1";
        }
        else if("R2".equals(card)){
            return "Red 2";
        }
        else if("R3".equals(card)){
            return "Red 3";
        }
        else if("R4".equals(card)){
            return "Red 4";
        }
        else if("R5".equals(card)){
            return "Red 5";
        }
        else if("R6".equals(card)){
            return "Red 6";
        }
        else if("R7".equals(card)){
            return "Red 7";
        }
        else if("R8".equals(card)){
            return "Red 8";
        }
        else if("R9".equals(card)){
            return "Red 9";
        }
        else if("RS".equals(card)){
            return "Red Skip";
        }
        else if("RD".equals(card)){
            return "Red Draw 2";
        }
        else if("RR".equals(card)){
            return "Red Reverse";
        }
        else if("Y0".equals(card)){
            return "Yellow 0";
        }
        else if("Y1".equals(card)){
            return "Yellow 1";
        }
        else if("Y2".equals(card)){
            return "Yellow 2";
        }
        else if("Y3".equals(card)){
            return "Yellow 3";
        }
        else if("Y4".equals(card)){
            return "Yellow 4";
        }
        else if("Y5".equals(card)){
            return "Yellow 5";
        }
        else if("Y6".equals(card)){
            return "Yellow 6";
        }
        else if("Y7".equals(card)){
            return "Yellow 7";
        }
        else if("Y8".equals(card)){
            return "Yellow 8";
        }
        else if("Y9".equals(card)){
            return "Yellow 9";
        }
         else if("YR".equals(card)){
            return "Yellow Reverse";
        }
          else if("YD".equals(card)){
            return "Yellow Draw 2";
        }
           else if("YS".equals(card)){
            return "Yellow Skip";
        }
        else if("W1".equals(card)){
            return "Wild";
        }
        else if("W4".equals(card)){
            return "Wild 4";
        }
        else{
            return "";
        }
    }
}
