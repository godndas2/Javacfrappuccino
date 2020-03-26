package collection.test;

import java.util.Iterator;
import java.util.Vector;


public class IteratorVector {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        System.out.println("���� ��:" + v);

        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();

        System.out.println("���� ��:" + v);

    }

}
