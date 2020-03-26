package collection.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest02 {

    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("ģ��", "ȫ�浿", "010-1111-1111");
        addPhoneNo("ģ��", "ȫ�浿2", "010-1234-1111");
        addPhoneNo("ģ��", "ȫ�浿3", "010-4567-1111");
        addPhoneNo("ȸ��", "ȫ�浿4", "010-8910-1111");
        addPhoneNo("������", "ȫ�浿5", "010-1313-1111");
        addPhoneNo("ģ��", "ȫ�浿6", "010-8585-1111");
        addPhoneNo("��������", "010-4548-4519");
        printList();
    }

    // �׷쿡 ��ȭ��ȣ�� �߰�
    static void addPhoneNo(String grpName, String name, String tel) {
        addGrp(grpName);
        HashMap grp = (HashMap) phoneBook.get(grpName);
        grp.put(tel, name);
    }

    // �׷� �߰�
    static void addGrp(String grpName) {
        if (!phoneBook.containsKey(grpName)) {
            phoneBook.put(grpName, new HashMap());
        }
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("��Ÿ", name, tel);
    }

    // ��ȭ��ȣ�� ��ü ���
    static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();

            Set subSet = ((HashMap) e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while (subIt.hasNext()) {
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }

}
