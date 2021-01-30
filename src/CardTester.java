import java.util.Scanner;

public class CardTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card aceOfSpades = new Card("ace", "spades");
        Card nineOfHearts = new Card("nine","hearts");

        System.out.println(aceOfSpades);
        System.out.printf("%s is a %s card%n", aceOfSpades, aceOfSpades.getCardColor());
        System.out.printf("%s is a %s card%n", nineOfHearts, nineOfHearts.getCardColor());

    }
}
