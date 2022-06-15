package chapter6.q6;

public class CardCompanyTest {
    public static void main(String[] args) {
        CardCompany oneashCompany = new CardCompany();

        Card card1 = oneashCompany.createCard();
        Card card2 = oneashCompany.createCard();

        System.out.println(card1.getCardNum());
        System.out.println(card2.getCardNum());
    }
}
