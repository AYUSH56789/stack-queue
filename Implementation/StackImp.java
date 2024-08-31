import java.util.*;
public class StackImp{


    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        // push()
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println(stack);
        // [O(1)]pop()
        stack.pop();
        System.out.println(stack);
        // [O(N)]size()
        System.out.println(stack.size());
        // [O(N)]contains()
        System.out.println(stack.contains(78));
        // [O(1)]isEmpty()
        System.out.println(stack.isEmpty());
        // [O(1)]peek()
        System.out.println(stack.peek());
        // [O(N)]clear();
        stack.clear();
    }
}