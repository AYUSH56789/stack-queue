import java.util.*;
public class QueueImp {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // add()->Add is used to insert a specified element into the queue. It returns true when the task is successful or else it throws an exception.
        q.add(1);
        q.add(2);
        q.add(3);
        // [O(n)]offer()->Offer is used to insert a specified element into the queue. It returns true when the task is successful or else its return false.
        q.offer(4);
        q.offer(5);
        q.offer(6);
        System.out.println(q);
        // [O(1)] remove()
        q.remove();
        System.out.println(q);
        q.add(45);
        System.out.println(q);
        // [O(n)]size()
        System.out.println(q.size());
        // [O(1)] isEmpty()
        System.out.println(q.isEmpty());
        // [O(n)]contains()
        System.out.println(q.contains(89));
        // [O(n)]clear()
        q.clear();
        System.out.println(q);
    }
}
