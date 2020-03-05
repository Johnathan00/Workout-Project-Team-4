/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_uno_workout;

import java.util.Random;

/**
 *
 * @author torti
 */
public class Deck {
    private int end_position,start,end_position1,end_position2,start_position2,start_position3,cards_left,number_of_decks;
    boolean is_action_cards;
    private String[]deck;
    public Deck(int number_of_decks,boolean is_action_cards){
        this.number_of_decks=number_of_decks;
        this.is_action_cards=is_action_cards;
        deck=filldeck(number_of_decks,is_action_cards);
        if(number_of_decks==1 && is_action_cards==true){
            start=0;
            end_position=107;
            end_position1=0;
            end_position2=0;
            start_position2=0;
            start_position3=0;
            cards_left=108;
        }
        else if(number_of_decks==1 && is_action_cards==false){
            start=0;
            end_position=75;
            end_position1=0;
            end_position2=0;
            start_position2=0;
            start_position3=0;
            cards_left=76;
        }
         else if(number_of_decks==2 && is_action_cards==true){
            start=0;
            end_position=215;
            end_position1=107;
            end_position2=215;
            start_position2=108;
            start_position3=0;
            cards_left=216;
        }
        else if(number_of_decks==2 && is_action_cards==false){
            start=0;
            end_position=151;
            end_position1=75;
            end_position2=151;
            start_position2=76;
            start_position3=0;
            cards_left=152;
        }
        else if(number_of_decks==3 && is_action_cards==true){
            start=0;
            end_position=323;
            end_position1=107;
            end_position2=215;
            start_position2=108;
            start_position3=216;
            cards_left=324;
        }
        else if(number_of_decks==3 && is_action_cards==false){
            start=0;
            end_position=227;
            end_position1=75;
            end_position2=151;
            start_position2=76;
            start_position3=152;
            cards_left=228;
        }
        else{
             start=0;
            end_position=0;
            end_position1=0;
            end_position2=0;
            start_position2=0;
            start_position3=0;
        }
        
        }
    public String[]filldeck(int i,boolean action_cards){
        String[]Deck=new String[600];
        if(i==1 && action_cards==true){
                    Deck[0]="R0";Deck[1]="R1";Deck[2]="R2";Deck[3]="R3";Deck[4]="R4";Deck[5]="R5";
                    Deck[6]="R6";Deck[7]="R7";Deck[8]="R8";Deck[9]="R9";Deck[10]="RS";Deck[11]="RD";Deck[12]="RR";
                    Deck[13]="G0";Deck[14]="G1";Deck[15]="G2";Deck[16]="G3";Deck[17]="G4";Deck[18]="G5";Deck[19]="G6";
                    Deck[20]="G7";Deck[21]="G8";Deck[22]="G9";Deck[23]="GS";Deck[24]="GD";Deck[25]="GR";Deck[26]="B0";
                    Deck[27]="B1";Deck[28]="B2";Deck[29]="B3";Deck[30]="B4";Deck[31]="B5";Deck[32]="B6";Deck[33]="B7";
                    Deck[34]="B8";Deck[35]="B9";Deck[36]="BS";Deck[37]="BD";Deck[38]="BR";Deck[39]="Y0";Deck[40]="Y1";
                    Deck[41]="Y2";Deck[42]="Y3";Deck[43]="Y4";Deck[44]="Y5";Deck[45]="Y6";Deck[46]="Y7";Deck[47]="Y8";
                    Deck[48]="Y9";Deck[49]="YS";Deck[50]="YD";Deck[51]="YR";Deck[52]="W1";Deck[53]="W1";Deck[54]="W1";
                    Deck[107]="W1";Deck[55]="W4";Deck[56]="W4";Deck[57]="W4";Deck[58]="W4";Deck[59]="R1";Deck[60]="R2";
                    Deck[61]="R3";Deck[62]="R4";Deck[63]="R5";Deck[64]="R6";Deck[65]="R7";Deck[66]="R8";Deck[67]="R9";
                    Deck[68]="RS";Deck[69]="RD";Deck[70]="RR";Deck[71]="G1";Deck[72]="G2";Deck[73]="G3";Deck[74]="G4";
                    Deck[75]="G5";Deck[76]="G6";Deck[77]="G7";Deck[78]="G8";Deck[79]="G9";Deck[80]="GS";Deck[81]="GD";
                    Deck[82]="GR";Deck[83]="B1";Deck[84]="B2";Deck[85]="B3";Deck[86]="B4";Deck[87]="B5";Deck[88]="B6";
                    Deck[89]="B7";Deck[90]="B8";Deck[91]="B9";Deck[92]="BS";Deck[93]="BD";Deck[94]="BR";Deck[95]="Y1";
                    Deck[96]="Y2";Deck[97]="Y3";Deck[98]="Y4";Deck[99]="Y5";Deck[100]="Y6";Deck[101]="Y7";Deck[102]="Y8";
                    Deck[103]="Y9";Deck[104]="YS";Deck[105]="YD";Deck[106]="YR";
        }
       else if(i==1 && action_cards==false){
                    Deck[0]="R0";Deck[1]="R1";Deck[2]="R2";Deck[3]="R3";Deck[4]="R4";Deck[5]="R5";
                    Deck[6]="R6";Deck[7]="R7";Deck[8]="R8";Deck[9]="R9";
                    Deck[10]="G0";Deck[11]="G1";Deck[12]="G2";Deck[13]="G3";Deck[14]="G4";Deck[15]="G5";Deck[16]="G6";
                    Deck[17]="G7";Deck[18]="G8";Deck[19]="G9";Deck[20]="B0";
                    Deck[21]="B1";Deck[22]="B2";Deck[23]="B3";Deck[24]="B4";Deck[25]="B5";Deck[26]="B6";Deck[27]="B7";
                    Deck[28]="B8";Deck[29]="B9";Deck[30]="Y0";Deck[31]="Y1";
                    Deck[32]="Y2";Deck[33]="Y3";Deck[34]="Y4";Deck[35]="Y5";Deck[36]="Y6";Deck[37]="Y7";Deck[38]="Y8";
                    Deck[39]="Y9";Deck[40]="R1";Deck[41]="R2";
                    Deck[42]="R3";Deck[43]="R4";Deck[44]="R5";Deck[45]="R6";Deck[46]="R7";Deck[47]="R8";Deck[48]="R9";
                    Deck[49]="G1";Deck[50]="G2";Deck[51]="G3";Deck[52]="G4";
                    Deck[53]="G5";Deck[54]="G6";Deck[55]="G7";Deck[56]="G8";Deck[57]="G9";
                    Deck[58]="B1";Deck[59]="B2";Deck[60]="B3";Deck[61]="B4";Deck[62]="B5";Deck[63]="B6";
                    Deck[64]="B7";Deck[65]="B8";Deck[66]="B9";Deck[67]="Y1";
                    Deck[68]="Y2";Deck[69]="Y3";Deck[70]="Y4";Deck[71]="Y5";Deck[72]="Y6";Deck[73]="Y7";Deck[74]="Y8";
                    Deck[75]="Y9";
        }
        else if(i==2 && action_cards==true){
                  Deck[0]="R0";Deck[1]="R1";Deck[2]="R2";Deck[3]="R3";Deck[4]="R4";Deck[5]="R5";
                    Deck[6]="R6";Deck[7]="R7";Deck[8]="R8";Deck[9]="R9";Deck[10]="RS";Deck[11]="RD";Deck[12]="RR";
                    Deck[13]="G0";Deck[14]="G1";Deck[15]="G2";Deck[16]="G3";Deck[17]="G4";Deck[18]="G5";Deck[19]="G6";
                    Deck[20]="G7";Deck[21]="G8";Deck[22]="G9";Deck[23]="GS";Deck[24]="GD";Deck[25]="GR";Deck[26]="B0";
                    Deck[27]="B1";Deck[28]="B2";Deck[29]="B3";Deck[30]="B4";Deck[31]="B5";Deck[32]="B6";Deck[33]="B7";
                    Deck[34]="B8";Deck[35]="B9";Deck[36]="BS";Deck[37]="BD";Deck[38]="BR";Deck[39]="Y0";Deck[40]="Y1";
                    Deck[41]="Y2";Deck[42]="Y3";Deck[43]="Y4";Deck[44]="Y5";Deck[45]="Y6";Deck[46]="Y7";Deck[47]="Y8";
                    Deck[48]="Y9";Deck[49]="YS";Deck[50]="YD";Deck[51]="YR";Deck[52]="W1";Deck[53]="W1";Deck[54]="W1";
                    Deck[107]="W1";Deck[55]="W4";Deck[56]="W4";Deck[57]="W4";Deck[58]="W4";Deck[59]="R1";Deck[60]="R2";
                    Deck[61]="R3";Deck[62]="R4";Deck[63]="R5";Deck[64]="R6";Deck[65]="R7";Deck[66]="R8";Deck[67]="R9";
                    Deck[68]="RS";Deck[69]="RD";Deck[70]="RR";Deck[71]="G1";Deck[72]="G2";Deck[73]="G3";Deck[74]="G4";
                    Deck[75]="G5";Deck[76]="G6";Deck[77]="G7";Deck[78]="G8";Deck[79]="G9";Deck[80]="GS";Deck[81]="GD";
                    Deck[82]="GR";Deck[83]="B1";Deck[84]="B2";Deck[85]="B3";Deck[86]="B4";Deck[87]="B5";Deck[88]="B6";
                    Deck[89]="B7";Deck[90]="B8";Deck[91]="B9";Deck[92]="BS";Deck[93]="BD";Deck[94]="BR";Deck[95]="Y1";
                    Deck[96]="Y2";Deck[97]="Y3";Deck[98]="Y4";Deck[99]="Y5";Deck[100]="Y6";Deck[101]="Y7";Deck[102]="Y8";
                    Deck[103]="Y9";Deck[104]="YS";Deck[105]="YD";Deck[106]="YR";Deck[214]="R0";Deck[108]="R1";Deck[109]="R2";Deck[110]="R3";Deck[111]="R4";Deck[112]="R5";
                    Deck[113]="R6";Deck[114]="R7";Deck[115]="R8";Deck[116]="R9";Deck[117]="RS";Deck[118]="RD";Deck[119]="RR";
                    Deck[120]="G0";Deck[121]="G1";Deck[122]="G2";Deck[123]="G3";Deck[124]="G4";Deck[125]="G5";Deck[126]="G6";
                    Deck[127]="G7";Deck[128]="G8";Deck[129]="G9";Deck[130]="GS";Deck[131]="GD";Deck[132]="GR";Deck[133]="B0";
                    Deck[134]="B1";Deck[135]="B2";Deck[136]="B3";Deck[137]="B4";Deck[138]="B5";Deck[139]="B6";Deck[140]="B7";
                    Deck[141]="B8";Deck[142]="B9";Deck[143]="BS";Deck[144]="BD";Deck[145]="BR";Deck[146]="Y0";Deck[147]="Y1";
                    Deck[148]="Y2";Deck[149]="Y3";Deck[150]="Y4";Deck[151]="Y5";Deck[152]="Y6";Deck[153]="Y7";Deck[154]="Y8";
                    Deck[155]="Y9";Deck[156]="YS";Deck[157]="YD";Deck[158]="YR";Deck[159]="W1";Deck[160]="W1";Deck[161]="W1";
                    Deck[162]="W1";Deck[163]="W4";Deck[164]="W4";Deck[165]="W4";Deck[166]="W4";Deck[167]="R1";Deck[168]="R2";
                    Deck[169]="R3";Deck[170]="R4";Deck[171]="R5";Deck[172]="R6";Deck[173]="R7";Deck[174]="R8";Deck[175]="R9";
                    Deck[176]="RS";Deck[177]="RD";Deck[178]="RR";Deck[179]="G1";Deck[180]="G2";Deck[181]="G3";Deck[182]="G4";
                    Deck[183]="G5";Deck[184]="G6";Deck[185]="G7";Deck[186]="G8";Deck[187]="G9";Deck[188]="GS";Deck[189]="GD";
                    Deck[190]="GR";Deck[191]="B1";Deck[192]="B2";Deck[193]="B3";Deck[194]="B4";Deck[195]="B5";Deck[196]="B6";
                    Deck[197]="B7";Deck[198]="B8";Deck[199]="B9";Deck[200]="BS";Deck[201]="BD";Deck[202]="BR";Deck[203]="Y1";
                    Deck[204]="Y2";Deck[205]="Y3";Deck[206]="Y4";Deck[207]="Y5";Deck[208]="Y6";Deck[209]="Y7";Deck[210]="Y8";
                    Deck[211]="Y9";Deck[212]="YS";Deck[213]="YD";Deck[215]="YR";
        }
        else if(i==2 && action_cards==false){
                    Deck[0]="R0";Deck[1]="R1";Deck[2]="R2";Deck[3]="R3";Deck[4]="R4";Deck[5]="R5";
                    Deck[6]="R6";Deck[7]="R7";Deck[8]="R8";Deck[9]="R9";
                    Deck[10]="G0";Deck[11]="G1";Deck[12]="G2";Deck[13]="G3";Deck[14]="G4";Deck[15]="G5";Deck[16]="G6";
                    Deck[17]="G7";Deck[18]="G8";Deck[19]="G9";Deck[20]="B0";
                    Deck[21]="B1";Deck[22]="B2";Deck[23]="B3";Deck[24]="B4";Deck[25]="B5";Deck[26]="B6";Deck[27]="B7";
                    Deck[28]="B8";Deck[29]="B9";Deck[30]="Y0";Deck[31]="Y1";
                    Deck[32]="Y2";Deck[33]="Y3";Deck[34]="Y4";Deck[35]="Y5";Deck[36]="Y6";Deck[37]="Y7";Deck[38]="Y8";
                    Deck[39]="Y9";Deck[40]="R1";Deck[41]="R2";
                    Deck[42]="R3";Deck[43]="R4";Deck[44]="R5";Deck[45]="R6";Deck[46]="R7";Deck[47]="R8";Deck[48]="R9";
                    Deck[49]="G1";Deck[50]="G2";Deck[51]="G3";Deck[52]="G4";
                    Deck[53]="G5";Deck[54]="G6";Deck[55]="G7";Deck[56]="G8";Deck[57]="G9";
                    Deck[58]="B1";Deck[59]="B2";Deck[60]="B3";Deck[61]="B4";Deck[62]="B5";Deck[63]="B6";
                    Deck[64]="B7";Deck[65]="B8";Deck[66]="B9";Deck[67]="Y1";
                    Deck[68]="Y2";Deck[69]="Y3";Deck[70]="Y4";Deck[71]="Y5";Deck[72]="Y6";Deck[73]="Y7";Deck[74]="Y8";
                    Deck[75]="Y9"; Deck[76]="R0";Deck[77]="R1";Deck[78]="R2";Deck[79]="R3";Deck[80]="R4";Deck[81]="R5";
                    Deck[82]="R6";Deck[83]="R7";Deck[84]="R8";Deck[85]="R9";
                    Deck[86]="G0";Deck[87]="G1";Deck[88]="G2";Deck[89]="G3";Deck[90]="G4";Deck[91]="G5";Deck[92]="G6";
                    Deck[93]="G7";Deck[94]="G8";Deck[95]="G9";Deck[96]="B0";
                    Deck[97]="B1";Deck[98]="B2";Deck[99]="B3";Deck[100]="B4";Deck[101]="B5";Deck[102]="B6";Deck[103]="B7";
                    Deck[104]="B8";Deck[105]="B9";Deck[106]="Y0";Deck[107]="Y1";
                    Deck[108]="Y2";Deck[109]="Y3";Deck[110]="Y4";Deck[111]="Y5";Deck[112]="Y6";Deck[113]="Y7";Deck[114]="Y8";
                    Deck[115]="Y9";Deck[116]="R1";Deck[117]="R2";
                    Deck[118]="R3";Deck[119]="R4";Deck[120]="R5";Deck[121]="R6";Deck[122]="R7";Deck[123]="R8";Deck[124]="R9";
                    Deck[125]="G1";Deck[126]="G2";Deck[127]="G3";Deck[128]="G4";
                    Deck[129]="G5";Deck[130]="G6";Deck[131]="G7";Deck[132]="G8";Deck[133]="G9";
                    Deck[134]="B1";Deck[135]="B2";Deck[136]="B3";Deck[137]="B4";Deck[138]="B5";Deck[139]="B6";
                    Deck[140]="B7";Deck[141]="B8";Deck[142]="B9";Deck[143]="Y1";
                    Deck[144]="Y2";Deck[145]="Y3";Deck[146]="Y4";Deck[147]="Y5";Deck[148]="Y6";Deck[149]="Y7";Deck[150]="Y8";
                    Deck[151]="Y9";
        }
        else if(i==3 && action_cards==true){
                    Deck[0]="R0";Deck[1]="R1";Deck[2]="R2";Deck[3]="R3";Deck[4]="R4";Deck[5]="R5";
                    Deck[6]="R6";Deck[7]="R7";Deck[8]="R8";Deck[9]="R9";Deck[10]="RS";Deck[11]="RD";Deck[12]="RR";
                    Deck[13]="G0";Deck[14]="G1";Deck[15]="G2";Deck[16]="G3";Deck[17]="G4";Deck[18]="G5";Deck[19]="G6";
                    Deck[20]="G7";Deck[21]="G8";Deck[22]="G9";Deck[23]="GS";Deck[24]="GD";Deck[25]="GR";Deck[26]="B0";
                    Deck[27]="B1";Deck[28]="B2";Deck[29]="B3";Deck[30]="B4";Deck[31]="B5";Deck[32]="B6";Deck[33]="B7";
                    Deck[34]="B8";Deck[35]="B9";Deck[36]="BS";Deck[37]="BD";Deck[38]="BR";Deck[39]="Y0";Deck[40]="Y1";
                    Deck[41]="Y2";Deck[42]="Y3";Deck[43]="Y4";Deck[44]="Y5";Deck[45]="Y6";Deck[46]="Y7";Deck[47]="Y8";
                    Deck[48]="Y9";Deck[49]="YS";Deck[50]="YD";Deck[51]="YR";Deck[52]="W1";Deck[53]="W1";Deck[54]="W1";
                    Deck[107]="W1";Deck[55]="W4";Deck[56]="W4";Deck[57]="W4";Deck[58]="W4";Deck[59]="R1";Deck[60]="R2";
                    Deck[61]="R3";Deck[62]="R4";Deck[63]="R5";Deck[64]="R6";Deck[65]="R7";Deck[66]="R8";Deck[67]="R9";
                    Deck[68]="RS";Deck[69]="RD";Deck[70]="RR";Deck[71]="G1";Deck[72]="G2";Deck[73]="G3";Deck[74]="G4";
                    Deck[75]="G5";Deck[76]="G6";Deck[77]="G7";Deck[78]="G8";Deck[79]="G9";Deck[80]="GS";Deck[81]="GD";
                    Deck[82]="GR";Deck[83]="B1";Deck[84]="B2";Deck[85]="B3";Deck[86]="B4";Deck[87]="B5";Deck[88]="B6";
                    Deck[89]="B7";Deck[90]="B8";Deck[91]="B9";Deck[92]="BS";Deck[93]="BD";Deck[94]="BR";Deck[95]="Y1";
                    Deck[96]="Y2";Deck[97]="Y3";Deck[98]="Y4";Deck[99]="Y5";Deck[100]="Y6";Deck[101]="Y7";Deck[102]="Y8";
                    Deck[103]="Y9";Deck[104]="YS";Deck[105]="YD";Deck[106]="YR";Deck[214]="R0";Deck[108]="R1";Deck[109]="R2";Deck[110]="R3";Deck[111]="R4";Deck[112]="R5";
                    Deck[113]="R6";Deck[114]="R7";Deck[115]="R8";Deck[116]="R9";Deck[117]="RS";Deck[118]="RD";Deck[119]="RR";
                    Deck[120]="G0";Deck[121]="G1";Deck[122]="G2";Deck[123]="G3";Deck[124]="G4";Deck[125]="G5";Deck[126]="G6";
                    Deck[127]="G7";Deck[128]="G8";Deck[129]="G9";Deck[130]="GS";Deck[131]="GD";Deck[132]="GR";Deck[133]="B0";
                    Deck[134]="B1";Deck[135]="B2";Deck[136]="B3";Deck[137]="B4";Deck[138]="B5";Deck[139]="B6";Deck[140]="B7";
                    Deck[141]="B8";Deck[142]="B9";Deck[143]="BS";Deck[144]="BD";Deck[145]="BR";Deck[146]="Y0";Deck[147]="Y1";
                    Deck[148]="Y2";Deck[149]="Y3";Deck[150]="Y4";Deck[151]="Y5";Deck[152]="Y6";Deck[153]="Y7";Deck[154]="Y8";
                    Deck[155]="Y9";Deck[156]="YS";Deck[157]="YD";Deck[158]="YR";Deck[159]="W1";Deck[160]="W1";Deck[161]="W1";
                    Deck[162]="W1";Deck[163]="W4";Deck[164]="W4";Deck[165]="W4";Deck[166]="W4";Deck[167]="R1";Deck[168]="R2";
                    Deck[169]="R3";Deck[170]="R4";Deck[171]="R5";Deck[172]="R6";Deck[173]="R7";Deck[174]="R8";Deck[175]="R9";
                    Deck[176]="RS";Deck[177]="RD";Deck[178]="RR";Deck[179]="G1";Deck[180]="G2";Deck[181]="G3";Deck[182]="G4";
                    Deck[183]="G5";Deck[184]="G6";Deck[185]="G7";Deck[186]="G8";Deck[187]="G9";Deck[188]="GS";Deck[189]="GD";
                    Deck[190]="GR";Deck[191]="B1";Deck[192]="B2";Deck[193]="B3";Deck[194]="B4";Deck[195]="B5";Deck[196]="B6";
                    Deck[197]="B7";Deck[198]="B8";Deck[199]="B9";Deck[200]="BS";Deck[201]="BD";Deck[202]="BR";Deck[203]="Y1";
                    Deck[204]="Y2";Deck[205]="Y3";Deck[206]="Y4";Deck[207]="Y5";Deck[208]="Y6";Deck[209]="Y7";Deck[210]="Y8";
                    Deck[211]="Y9";Deck[212]="YS";Deck[213]="YD";Deck[215]="YR";Deck[216]="R0";Deck[217]="R1";Deck[218]="R2";Deck[219]="R3";Deck[220]="R4";Deck[221]="R5";
                    Deck[222]="R6";Deck[223]="R7";Deck[224]="R8";Deck[225]="R9";Deck[226]="RS";Deck[227]="RD";Deck[228]="RR";
                    Deck[229]="G0";Deck[230]="G1";Deck[231]="G2";Deck[232]="G3";Deck[233]="G4";Deck[234]="G5";Deck[235]="G6";
                    Deck[236]="G7";Deck[237]="G8";Deck[238]="G9";Deck[239]="GS";Deck[240]="GD";Deck[241]="GR";Deck[242]="B0";
                    Deck[243]="B1";Deck[244]="B2";Deck[245]="B3";Deck[246]="B4";Deck[247]="B5";Deck[248]="B6";Deck[249]="B7";
                    Deck[250]="B8";Deck[251]="B9";Deck[252]="BS";Deck[253]="BD";Deck[254]="BR";Deck[255]="Y0";Deck[256]="Y1";
                    Deck[257]="Y2";Deck[258]="Y3";Deck[259]="Y4";Deck[260]="Y5";Deck[261]="Y6";Deck[262]="Y7";Deck[263]="Y8";
                    Deck[264]="Y9";Deck[265]="YS";Deck[266]="YD";Deck[267]="YR";Deck[268]="W1";Deck[269]="W1";Deck[270]="W1";
                    Deck[271]="W1";Deck[272]="W4";Deck[273]="W4";Deck[274]="W4";Deck[275]="W4";Deck[276]="R1";Deck[277]="R2";
                    Deck[278]="R3";Deck[279]="R4";Deck[280]="R5";Deck[281]="R6";Deck[282]="R7";Deck[283]="R8";Deck[284]="R9";
                    Deck[285]="RS";Deck[286]="RD";Deck[287]="RR";Deck[288]="G1";Deck[289]="G2";Deck[290]="G3";Deck[291]="G4";
                    Deck[292]="G5";Deck[293]="G6";Deck[294]="G7";Deck[295]="G8";Deck[296]="G9";Deck[297]="GS";Deck[298]="GD";
                    Deck[299]="GR";Deck[300]="B1";Deck[301]="B2";Deck[302]="B3";Deck[303]="B4";Deck[304]="B5";Deck[305]="B6";
                    Deck[306]="B7";Deck[307]="B8";Deck[308]="B9";Deck[309]="BS";Deck[310]="BD";Deck[311]="BR";Deck[312]="Y1";
                    Deck[313]="Y2";Deck[314]="Y3";Deck[315]="Y4";Deck[316]="Y5";Deck[317]="Y6";Deck[318]="Y7";Deck[319]="Y8";
                    Deck[320]="Y9";Deck[321]="YS";Deck[322]="YD";Deck[323]="YR";
        }
        else if(i==3 && action_cards==false){
                    Deck[0]="R0";Deck[1]="R1";Deck[2]="R2";Deck[3]="R3";Deck[4]="R4";Deck[5]="R5";
                    Deck[6]="R6";Deck[7]="R7";Deck[8]="R8";Deck[9]="R9";
                    Deck[10]="G0";Deck[11]="G1";Deck[12]="G2";Deck[13]="G3";Deck[14]="G4";Deck[15]="G5";Deck[16]="G6";
                    Deck[17]="G7";Deck[18]="G8";Deck[19]="G9";Deck[20]="B0";
                    Deck[21]="B1";Deck[22]="B2";Deck[23]="B3";Deck[24]="B4";Deck[25]="B5";Deck[26]="B6";Deck[27]="B7";
                    Deck[28]="B8";Deck[29]="B9";Deck[30]="Y0";Deck[31]="Y1";
                    Deck[32]="Y2";Deck[33]="Y3";Deck[34]="Y4";Deck[35]="Y5";Deck[36]="Y6";Deck[37]="Y7";Deck[38]="Y8";
                    Deck[39]="Y9";Deck[40]="R1";Deck[41]="R2";
                    Deck[42]="R3";Deck[43]="R4";Deck[44]="R5";Deck[45]="R6";Deck[46]="R7";Deck[47]="R8";Deck[48]="R9";
                    Deck[49]="G1";Deck[50]="G2";Deck[51]="G3";Deck[52]="G4";
                    Deck[53]="G5";Deck[54]="G6";Deck[55]="G7";Deck[56]="G8";Deck[57]="G9";
                    Deck[58]="B1";Deck[59]="B2";Deck[60]="B3";Deck[61]="B4";Deck[62]="B5";Deck[63]="B6";
                    Deck[64]="B7";Deck[65]="B8";Deck[66]="B9";Deck[67]="Y1";
                    Deck[68]="Y2";Deck[69]="Y3";Deck[70]="Y4";Deck[71]="Y5";Deck[72]="Y6";Deck[73]="Y7";Deck[74]="Y8";
                    Deck[75]="Y9"; Deck[76]="R0";Deck[77]="R1";Deck[78]="R2";Deck[79]="R3";Deck[80]="R4";Deck[81]="R5";
                    Deck[82]="R6";Deck[83]="R7";Deck[84]="R8";Deck[85]="R9";
                    Deck[86]="G0";Deck[87]="G1";Deck[88]="G2";Deck[89]="G3";Deck[90]="G4";Deck[91]="G5";Deck[92]="G6";
                    Deck[93]="G7";Deck[94]="G8";Deck[95]="G9";Deck[96]="B0";
                    Deck[97]="B1";Deck[98]="B2";Deck[99]="B3";Deck[100]="B4";Deck[101]="B5";Deck[102]="B6";Deck[103]="B7";
                    Deck[104]="B8";Deck[105]="B9";Deck[106]="Y0";Deck[107]="Y1";
                    Deck[108]="Y2";Deck[109]="Y3";Deck[110]="Y4";Deck[111]="Y5";Deck[112]="Y6";Deck[113]="Y7";Deck[114]="Y8";
                    Deck[115]="Y9";Deck[116]="R1";Deck[117]="R2";
                    Deck[118]="R3";Deck[119]="R4";Deck[120]="R5";Deck[121]="R6";Deck[122]="R7";Deck[123]="R8";Deck[124]="R9";
                    Deck[125]="G1";Deck[126]="G2";Deck[127]="G3";Deck[128]="G4";
                    Deck[129]="G5";Deck[130]="G6";Deck[131]="G7";Deck[132]="G8";Deck[133]="G9";
                    Deck[134]="B1";Deck[135]="B2";Deck[136]="B3";Deck[137]="B4";Deck[138]="B5";Deck[139]="B6";
                    Deck[140]="B7";Deck[141]="B8";Deck[142]="B9";Deck[143]="Y1";
                    Deck[144]="Y2";Deck[145]="Y3";Deck[146]="Y4";Deck[147]="Y5";Deck[148]="Y6";Deck[149]="Y7";Deck[150]="Y8";
                    Deck[151]="Y9";Deck[152]="R0";Deck[153]="R1";Deck[154]="R2";Deck[155]="R3";Deck[156]="R4";Deck[157]="R5";
                    Deck[158]="R6";Deck[159]="R7";Deck[160]="R8";Deck[161]="R9";
                    Deck[162]="G0";Deck[163]="G1";Deck[164]="G2";Deck[165]="G3";Deck[166]="G4";Deck[167]="G5";Deck[168]="G6";
                    Deck[169]="G7";Deck[170]="G8";Deck[171]="G9";Deck[172]="B0";
                    Deck[173]="B1";Deck[174]="B2";Deck[175]="B3";Deck[176]="B4";Deck[177]="B5";Deck[178]="B6";Deck[179]="B7";
                    Deck[180]="B8";Deck[181]="B9";Deck[182]="Y0";Deck[183]="Y1";
                    Deck[184]="Y2";Deck[185]="Y3";Deck[186]="Y4";Deck[187]="Y5";Deck[188]="Y6";Deck[189]="Y7";Deck[190]="Y8";
                    Deck[191]="Y9";Deck[192]="R1";Deck[193]="R2";
                    Deck[194]="R3";Deck[195]="R4";Deck[196]="R5";Deck[197]="R6";Deck[198]="R7";Deck[199]="R8";Deck[200]="R9";
                    Deck[201]="G1";Deck[202]="G2";Deck[203]="G3";Deck[204]="G4";
                    Deck[205]="G5";Deck[206]="G6";Deck[207]="G7";Deck[208]="G8";Deck[209]="G9";
                    Deck[210]="B1";Deck[211]="B2";Deck[212]="B3";Deck[213]="B4";Deck[214]="B5";Deck[215]="B6";
                    Deck[216]="B7";Deck[217]="B8";Deck[218]="B9";Deck[219]="Y1";
                    Deck[220]="Y2";Deck[221]="Y3";Deck[222]="Y4";Deck[223]="Y5";Deck[224]="Y6";Deck[225]="Y7";Deck[226]="Y8";
                    Deck[227]="Y9";
        }
        for(int j=0;j<Deck.length;j++){
            if(Deck[j]==null){
                Deck[j]="0";
            }
        }
        return Deck;
    }
    public void ShuffleDeck(int together){
        Random rand=new Random();
        int rand_int;
        if(number_of_decks==1 && is_action_cards==true){
            for(int i=0;i<=get_end_position();i++){
                rand_int=rand.nextInt(108);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
        }
        if(number_of_decks==1 && is_action_cards==false){
            for(int i=0;i<=get_end_position();i++){
                rand_int=rand.nextInt(77);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
        }
        if(number_of_decks==2 && is_action_cards==true && together==1){
            for(int i=0;i<=get_end_position();i++){
                rand_int=rand.nextInt(216);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
        }
        if(number_of_decks==2 && is_action_cards==true && together==0){
            for(int i=0;i<=get_end_position1();i++){
                rand_int=rand.nextInt(108);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
            for(int i=108;i<=get_end_position();i++){
                rand_int=rand.nextInt(108)+108;
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }   
        }
        if(number_of_decks==2 && is_action_cards==false && together==1){
            for(int i=0;i<=get_end_position();i++){
                rand_int=rand.nextInt(154);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            } 
        }
        if(number_of_decks==2 && is_action_cards==false && together==0){
            for(int i=0;i<=get_end_position1();i++){
                rand_int=rand.nextInt(76);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
            for(int i=77;i<=get_end_position();i++){
                rand_int=rand.nextInt(76)+76;
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            } 
        }
        if(number_of_decks==3 && is_action_cards==true && together==1){
            for(int i=0;i<=get_end_position();i++){
                rand_int=rand.nextInt(324);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            } 
        }
        if(number_of_decks==3 && is_action_cards==true && together==0){
            for(int i=0;i<=get_end_position1();i++){
                rand_int=rand.nextInt(108);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            } 
            for(int i=108;i<=get_end_position2();i++){
                rand_int=rand.nextInt(108)+108;
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
            for(int i=216;i<=get_end_position();i++){
                rand_int=rand.nextInt(108)+216;
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
        }
        if(number_of_decks==3 && is_action_cards==false && together==1){
            for(int i=0;i<=get_end_position();i++){
                rand_int=rand.nextInt(231);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            } 
        }
        if(number_of_decks==3 && is_action_cards==false && together==0){
            for(int i=0;i<=get_end_position1();i++){
                rand_int=rand.nextInt(76);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
            for(int i=77;i<=get_end_position2();i++){
                rand_int=rand.nextInt(76)+76;
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
            for(int i=154;i<=get_end_position();i++){
                rand_int=rand.nextInt(76)+152;
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
        }
        }
    public int get_end_position(){
        return end_position;
    }
    public void increment_end_position(){
        end_position=end_position+1;
    }
    public int get_end_position1(){
        return end_position1;
    }
    public int get_end_position2(){
        return end_position2;
    }
    public String getCards(int position){
        return deck[position];
    }
    public void setCards(String new_value,int position){
        deck[position]=new_value;
    }
    public int getStart(){
        return start;
    }
    public void start_increment(){
        start=start+1;
    }
    public int Get_cards_left(){
        return cards_left;
    }
    public void cards_left_decrement(){
        cards_left=cards_left-1;
    }
    public String draw_card(){
        int start=getStart();
        start_increment();
        cards_left_decrement();
        return getCards(start);
    }
    public void cards_left_increment(){
        cards_left=cards_left+1;
    }
    public void return_card(String card){
        setCards(card,get_end_position()+1);
        increment_end_position();
        cards_left_increment();
    }
}
