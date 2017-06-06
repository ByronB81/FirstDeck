import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
  List<String> fullDeck = new ArrayList<>();
  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
  String[] cards = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

  public void buildDeck() {
    for (String suit : suits){
      for (String card : cards){
        fullDeck.add(String.format("The %s of %s", card, suit));
      }
    }
  }

  public String randomCard() {
    Random rando = new Random();
    int randomNumberPick = rando.nextInt(52);
    return fullDeck.get(randomNumberPick);
  }

  public void displayDeck(){
    for (String card : fullDeck){
      System.out.println(card);
    }
  }

}
