import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName;
    private String suit;

    /**
     * This constructor takes 2 arguments, one for the face name and one for the suit.
     * Aces are high, will dynamically establish card value with getCardValue()
     */
    public Card(String faceName, String suit){
        setFaceName(faceName);
        setSuit(suit);  //this uses the setSuit method made below instead of this. methods
    }

    public String getFaceName() {
        return faceName;
    }


    /**
     * This method will validate that the argument is in the normal range of playing cards
     * and will set the instance variable
     * @param faceName - this is a string to represent the name of the card
     */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();//converts to lowercase
        List<String> validFaces = Arrays.asList("two","three","four","five","six","seven",
                "eight","nine","ten","jack","queen","king","ace");
        if (validFaces.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " is not valid. Use one of "+validFaces);
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method will validate that the argument is in the normal range of suits
     * and will set the instance variable
     * @param suit - this is a string to represent the suit of the card
     */
    public void setSuit(String suit) {
        suit = suit.toLowerCase();//converts to lowercase
        List<String> validSuits = Arrays.asList("hearts", "diamonds", "spades", "clubs");
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid. Use one of "+validSuits);
    }


    public String toString(){
        return faceName + " of " + suit;
    }

    /**
     * This method will return the color (red/black)
     * @return
     */
    public String getCardColor(){
        if (suit.equals("hearts")||suit.equals("diamonds"))
            return "red";
        else
            return "black";
    }
}
