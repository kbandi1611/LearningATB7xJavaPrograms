package August.ex24082024;

import com.sun.security.jgss.GSSUtil;

import java.util.PriorityQueue;

public class Lab241 {
    public static void main(String[] args) {
        //Queue - < 1% in Automation
        //
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");
        pq.offer("2");
        pq.offer("4");
        pq.offer("3");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
