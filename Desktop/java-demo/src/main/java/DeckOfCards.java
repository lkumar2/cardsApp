package DeckOfCards;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


class Card
{
	public static enum Face {
		Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	};
	public static enum Suit {
		Clubs, Diamonds, Hearts, Spades
	};
	private final Face face;
	private final Suit suit;

	public Card(Face cardFace, Suit cardSuit)
	{
		face = cardFace;
		suit = cardSuit;
	}

	public Face getFace()
	{
		return face;
	}

	public Suit getSuit()
	{
		return suit;
	}

	public String toString()
	{
		return suit + " " +face;
	}


}



   public class DeckOfCards
   {

   	List<Card> list ;
   	int remainingCards;
   	public static final int D_SIZE =52;

   	public DeckOfCards()
   	{
   		remainingCards = D_SIZE;
   		Card [] deck = new Card[52];
   		int count = 0;
   		for (Card.Suit suit : Card.Suit.values())
   		{
   			for(Card.Face face : Card.Face.values())
   			{
   				deck[count] = new Card(face, suit);
   				count++;
   		
   			}
   		}
   		list = Arrays.asList(deck);	
   		Collections.shuffle(list);	
   	}
   



   	public void dealOneCard()
   	{
   		if(remainingCards == 0 )
   		{
   			System.out.println("No cards to deal");
   		}

   		else {
   		
   			remainingCards = remainingCards -1;
   			System.out.printf("%-20s%s", list.get(remainingCards), ((remainingCards+1)%2==0) ? "\n" : "" );
   		}

   	}

	public static void main (String [] arg)	{
		DeckOfCards cards = new DeckOfCards();

		for(int i =0; i<52; i++)
		{
		cards.dealOneCard();
	}

	System.out.println("Deal 53rd card:");
	cards.dealOneCard();

	}
}

