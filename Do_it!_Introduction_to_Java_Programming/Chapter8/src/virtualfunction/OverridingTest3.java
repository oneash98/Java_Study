package virtualfunction;

import inheritance.Customer;
import inheritance.VIPCustomer;

public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;

        Customer customerLee = new Customer(10010, "이순신");
        System.out.println(customerLee.calcPrice(price));

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
        System.out.println(customerKim.calcPrice(price));

        Customer vc = new VIPCustomer(10030, "나몰라", 2000);
        System.out.println(vc.calcPrice(price));
    }
}
