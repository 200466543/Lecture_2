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

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();//converts to lowercase
        List<String> validFaces = Arrays.asList(
    }

    public String getSuit() {
        return suit;
    }

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
}
