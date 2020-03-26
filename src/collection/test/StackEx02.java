package collection.test;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx02 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : Java StackEx02 \"EXPRESSION\"");
            System.out.println("Example : Java StackEx02 \"(2+3)*1\"");
            System.exit(0);
        }

        Stack st = new Stack();
        String exp = args[0];

        System.out.println("EXPRESSION : " + exp);

        try {
            for (int i = 0; i < exp.length(); i++) {
                char c = exp.charAt(i);
                if (c == '(') {
                    st.push(c + "");
                } else if (c == ')') {
                    st.pop();
                }
            }
            if (st.isEmpty()) {
                System.out.println("��ȣ�� ��ġ�մϴ�.");
            } else {
                System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�");
            }
        } catch (EmptyStackException e) {
            System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
        }
    }

}
