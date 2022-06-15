package chapter6.q6;

public class Card {
    private int cardNum;
    static int serialNum = 1;

    public Card() {
        this.cardNum = serialNum;
        serialNum++;
    }
    
    public int getCardNum() {
        return this.cardNum;
    }
}
