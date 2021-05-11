package Interface;

public class Tester {
    public static void main(String[] args) {
//        Reporter r = new Reporter();
//        r.print();
//        Reporter2 r2 = new Reporter2();
//        r2.sayhi();
        Print p = new Print() {
            @Override
            public void print() {
                System.out.println("say hi");
            }
        };
        Print p1 = new Print() {
            @Override
            public void print() {
                System.out.println("hi");
            }
        };
        p.print();
        p1.print();
    }


}
