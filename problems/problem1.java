import java.util.*;
public class problem1 {
    // time complexity O(N) with space complexity O(N) -> we can't improve it's comeplxity
    public static boolean solution(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            // step1 -> if opening brackets -> push to stack
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            // step2 -> if closing brackets -> pop from stack and match
            else{
                // step3-> before pop and match .check stack is empty [corner case]-> if yes then return false
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top=stack.pop();
                    // step4 -> if top of stack is not matching with current closing bracket-> return false
                    if((c==')' && top!='(') || (c==']' && top!='[') || (c=='}' && top!='{')){
                        return false;
                    }
                }
            }
        }
        // step5: check stack is empty or not . if enpty means all opening and closing match with each other.
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="()[{}()]";
        System.out.println(solution(s));
    }
}
