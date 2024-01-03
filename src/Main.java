public class Main {
    public static void main(String[] args) {


        Card myCard = new Card("hearts",10);
        Card otherCard = new Card("diamonds", 8);

        System.out.println("MyCard beats otherCard: " + myCard.beats(otherCard));


    }
}