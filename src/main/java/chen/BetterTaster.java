package chen;

import java.util.ArrayList;
import java.util.List;

public class BetterTaster {
    public static void main(String[] args) {
        List boxes = new ArrayList();
        boxes.add(new Box1());
        boxes.add(new Box2());
        boxes.add(new Box3());
        boxes.add(new Box4());

        Box box = (Box) boxes.get(2);
        System.out.println(box.name);

        ArrayList list = new ArrayList();
        list.add("Boxbox");
        list.add(456789);
        Box1 b1 = new Box1();
        list.add(b1);
        System.out.println(list);
    }
}
