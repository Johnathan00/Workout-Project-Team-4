
package group_uno_workout;

import java.util.Random;

/**
 *
 * @author Garrett Olsen
 */
public class Deck {
    private int end_position,start,cards_left,number_of_decks;
    private boolean is_action_cards;
    private String[]deck;
//creates Deck based on number of them user wants and if user wants action cards
    public Deck(int number_of_decks,boolean is_action_cards){
        this.number_of_decks=number_of_decks;
        this.is_action_cards=is_action_cards;
        deck=filldeck(number_of_decks,is_action_cards);
        if(number_of_decks==1 && is_action_cards==true){
            start=0;
            end_position=107;
            cards_left=108;
        }
        else if(number_of_decks==1 && is_action_cards==false){
            start=0;
            end_position=75;
            cards_left=76;
        }
         else if(number_of_decks==2 && is_action_cards==true){
            start=0;
            end_position=215;
            cards_left=216;
        }
        else if(number_of_decks==2 && is_action_cards==false){
            start=0;
            end_position=151;
            cards_left=152;
        }
        else if(number_of_decks==3 && is_action_cards==true){
            start=0;
            end_position=323;
            cards_left=324;
        }
        else if(number_of_decks==3 && is_action_cards==false){
            start=0;
            end_position=227;
            cards_left=228;
        }
        else{
            start=0;
            end_position=0;
            cards_left=0;
        }
        
        }
//actually makes the decks
    public String[]filldeck(int decks,boolean action_cards){
        String[]Deck=new String[600];
        String[]colors={"B","G","R","Y"};
        String[]values={"1","2","3","4","5","6","7","8","9","D","S","R"};
        String[]values_no_action={"1","2","3","4","5","6","7","8","9"};
        String[]wilds={"W1","W1","W1","W1","W4","W4","W4","W4"};
        if(decks==1 && action_cards==true){
            int deck_spot=0;
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<wilds.length;i++){
                Deck[deck_spot]=wilds[i];
                deck_spot+=1;
            }
        }
       else if(decks==1 && action_cards==false){
           int deck_spot=0;
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
        }
        else if(decks==2 && action_cards==true){
            int deck_spot=0;
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<wilds.length;i++){
                Deck[deck_spot]=wilds[i];
                deck_spot+=1;
            }
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<wilds.length;i++){
                Deck[deck_spot]=wilds[i];
                deck_spot+=1;
            }
        }
        else if(decks==2 && action_cards==false){
            int deck_spot=0;
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
        }
        else if(decks==3 && action_cards==true){
            int deck_spot=0;
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<wilds.length;i++){
                Deck[deck_spot]=wilds[i];
                deck_spot+=1;
            }
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<wilds.length;i++){
                Deck[deck_spot]=wilds[i];
                deck_spot+=1;
            }
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values.length;j++){
                    Deck[deck_spot]=colors[i]+values[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<wilds.length;i++){
                Deck[deck_spot]=wilds[i];
                deck_spot+=1;
            }
        }
        else if(decks==3 && action_cards==false){
            int deck_spot=0;
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<4;i++){
                Deck[deck_spot]=colors[i]+"0";
                deck_spot+=1;
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
            for(int i=0;i<colors.length;i++){
                for(int j=0;j<values_no_action.length;j++){
                    Deck[deck_spot]=colors[i]+values_no_action[j];
                    deck_spot+=1;
                }
            }
        }
        for(int j=0;j<Deck.length;j++){
            if(Deck[j]==null){
                Deck[j]="0";
            }
        }
        return Deck;
    }
//shuffles the deck based on if user wants them shuffled together or
//individually
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
                rand_int=rand.nextInt(76);
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
            for(int i=0;i<=107;i++){
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
                rand_int=rand.nextInt(152);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            } 
        }
        if(number_of_decks==2 && is_action_cards==false && together==0){
            for(int i=0;i<=75;i++){
                rand_int=rand.nextInt(76);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
            for(int i=76;i<=get_end_position();i++){
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
            for(int i=0;i<=107;i++){
                rand_int=rand.nextInt(108);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            } 
            for(int i=108;i<=215;i++){
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
                rand_int=rand.nextInt(228);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            } 
        }
        if(number_of_decks==3 && is_action_cards==false && together==0){
            for(int i=0;i<=75;i++){
                rand_int=rand.nextInt(76);
                String temp1=getCards(rand_int);
                String temp2=getCards(i);
                setCards(temp1,i);
                setCards(temp2,rand_int);
            }
            for(int i=77;i<=153;i++){
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
//gets and returns card at position in deck
    public String getCards(int position){
        return deck[position];
    }
//changes card at position in deck
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
//returns card at start of deck and increments start
    public String draw_card(){
        int start=getStart();
        start_increment();
        cards_left_decrement();
        return getCards(start);
    }
    public void cards_left_increment(){
        cards_left=cards_left+1;
    }
//puts card back in deck, increments end
    public void return_card(String card){
        setCards(card,get_end_position()+1);
        increment_end_position();
        cards_left_increment();
    }
}

