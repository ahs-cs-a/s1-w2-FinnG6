public class CardMain {
    public static void main(String[] args) {
        Card card1 = new Card(8,0);
        Card card2 = new Card(3,3);
        Card card3 = new Card(1,4);

        System.out.println(card1.getSuit());
        System.out.println(card2.getSuit());
        System.out.println(card3.getRank());

        card2.setSuit(3);
        System.out.println(card2.getSuit());
        
    }
}
