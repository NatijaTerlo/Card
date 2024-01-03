public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    public boolean beats(Card otherCard) {

        if (this.suit.equals(otherCard.suit)) {
            return this.value > otherCard.value;
        } else {
            // Hearts > Diamonds > clubs > Spades

            return  (this.suit.equals("hearts")) ||
                    (this.suit.equals("diamonds") && otherCard.suit.equals("hearts")) ||
                    (this.suit.equals("clubs") && otherCard.suit.equals("spades"));


            }
        }
    }


