

public class App {
  public static void main(String[] args) {
    Deck gameDeck = new Deck();

    //gameDeck.displayDeck();
    gameDeck.buildDeck();
    gameDeck.randomCard();
    gameDeck.randomCard();
    System.out.println("//////////////");
    gameDeck.displayDeck();
    System.out.println("//////////////");

    System.out.println(gameDeck.randomCard());


  }
}
