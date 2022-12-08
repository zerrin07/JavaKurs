package deitelCalisma;
import java.security.SecureRandom;
public class DeckOfCards {
private static final SecureRandom randomNumbers = new SecureRandom();
private static final int NUMBER_OF_CARDS =52;

private Card[] deck =new Card[NUMBER_OF_CARDS];
private int currentCard = 0;

//constructer diziyi doldurur.
public DeckOfCards()
{
	String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
			 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 
	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

//desteyi kart nesneleri ile doldur.
for (int count = 0; count < deck.length; count++) { 
	 deck[count] = 
	 new Card(faces[count % 13], suits[count / 13]);
	 
	}
}
public void shuffle()
{
	currentCard =0;
//her Kart için başka bir rastgele Kart (0-51) seçin ve değiştirin
	for (int first = 0; first < deck.length; first++) {
	 int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
//mevcut Kartı rastgele seçilmiş Kart ile değiştir
	 Card temp = deck[first]; 
	 deck[first] = deck[second];
	 deck[second] = temp; 
	
}
}
//tek kart dağıt
public Card dealCard()
{
	if (currentCard <deck.length ) {
		return deck[currentCard++]; // return current Card in array
		} 
		else {
		return null; // return null to indicate that all Cards were dealt
	 }
}
}