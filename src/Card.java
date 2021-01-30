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
     * This returns a list of valid face names in lowercase
     * @return
     */
    public static List<String> getFaceNames(){
        return Arrays.asList("two","three","four","five","six","seven",
                "eight","nine","ten","jack","queen","king","ace");
    }

    /**
     * This method will validate that the argument is in the normal range of playing cards
     * and will set the instance variable
     * @param faceName - this is a string to represent the name of the card
     */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();//converts to lowercase
        List<String> validFaces = getFaceNames();
        if (validFaces.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " is not valid. Use one of "+validFaces);
    }

    public String getSuit() {
        return suit;
    }

    public static List<String> getSuits(){
        return Arrays.asList("hearts", "diamonds", "spades", "clubs");
    }

    /**
     * This method will validate that the argument is in the normal range of suits
     * and will set the instance variable
     * @param suit - this is a string to represent the suit of the card
     */
    public void setSuit(String suit) {
        suit = suit.toLowerCase();//converts to lowercase
        List<String> validSuits = getSuits();
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

    /**
     * This method will return the value of the card. 1=1, 2=2, 3=3...10=10, jack=11,
     * queen=12, king=13, ace=14
     */
    public int getFaceValue(){
        //the first face name in position 0 is "two". Adding 2 to the position/index
        //of each card makes its value
        return getFaceNames().indexOf(faceName) + 2;
    }
}
