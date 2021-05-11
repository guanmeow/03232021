package chen.collect;

import java.util.TreeSet;

public class Set {
    public Set() {
    }

    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(2);
        System.out.println(num.size());

        TreeSet<String> s = new TreeSet<>();
        s.add("Hey");
        s.add("How");
        s.add("Are");
        s.add("You");
//        System.out.println(s);
        for (String ss : s) {
            System.out.println(ss);
        }

    }
}
