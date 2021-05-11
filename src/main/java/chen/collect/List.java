package chen.collect;

import chen.Box1;

import java.util.ArrayList;

public class List  {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Boxbox");
        list.add(456789);
        Box1 b1 = new Box1();
        list.add(b1);
        Integer n = new Integer(12);
        list.add(n);
        Short s = new Short(n.shortValue());
        list.add(s);
        Float f = new Float(2.56);
        list.add(f);
        Long l = new Long(f.longValue());
        list.add(l);
        Double d = new Double(555);
        list.add(d);
        Byte b = new Byte(d.byteValue());
        list.add(b);
        Boolean bl = new Boolean(true);
        list.add(bl);
        Character c = new Character('a');
        list.add(c);
        System.out.println("123");



    }
}
