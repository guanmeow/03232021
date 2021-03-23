package fju.edu.cust;

public class Tester2 {
    public static void main(String[] args) {
        Customer c = new Customer("0001",500);
        SeliverCustomer sc = new SeliverCustomer("1001",50000);
        c.getTotal();
        sc.getTotal();
    }
}
