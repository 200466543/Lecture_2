import java.util.Scanner;

public class CardTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card aceOfSpades = new Card("ace", "spades");
        Card nineOfHearts = new Card("nine","hearts");

        System.out.println(aceOfSpades);
        System.out.printf("%s is a %s card with a value of %d%n", aceOfSpades,
                aceOfSpades.getCardColor(), aceOfSpades.getFaceValue());
        System.out.printf("%s is a %s card with a value of %d%n", nineOfHearts,
                nineOfHearts.getCardColor(), nineOfHearts.getFaceValue());

        //Create an instance of a DeckOfCards
        DeckOfCards deck = new DeckOfCards();


    }
}
