import org.desu.ch6stackqueue.*;

import java.util.ArrayList;
import java.util.Collections;

public class StackTestArray {

    public static Stack<Integer> test() {
        Stack<Integer> S = new ArrayStack<>();
        S.push(7);
        S.push(3);
        S.pop();
        S.push(7);
        S.pop();
        S.push(9);
        S.push(1);
        S.pop();
        S.push(6);
        S.push(8);
        S.pop();
        return S;
    }

    public static void main(String[] args) {
        Stack<Integer> testStack = test();
        ArrayList<Integer> stackList = new ArrayList<>();
        while (!testStack.isEmpty()) {
            stackList.add(testStack.pop());
        }
        Collections.reverse(stackList);
        String stackString = stackList.toString();
        System.out.println("\nFinal stack is: " + stackString);
    }
}
