package deitelCalisma;

public class Card {
 private final String face;
 private final String suit;
 // / two-argument constructor 
 public Card(String cardFace,String cardSuit) 
 {
	 this.face = cardFace;
	 this.suit = cardSuit;
	 
	
 }
 //kartın Dize gösterimini döndür
 public String toString()
 {
	 return face + "of" + suit;
 }
 
}
