package August.ex24082024;

import java.util.Stack;

public class Lab235 {
    public static void main(String[] args) {
        //Vector, Stack - Legacy - 95% of time we are not going to use it in automation
        //legacy - old

        Stack s = new Stack();
        s.push("Karthik");
        s.push(123);
        s.push("Kumar");
        s.add("Reddy");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search(123));
    }
}
