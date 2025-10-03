import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class StackTestArrayJavaDeque {

    // Test method using ArrayDeque as a stack
    public static ArrayDeque<Integer> test() {
        ArrayDeque<Integer> S = new ArrayDeque<>();  // contents: ()
        S.push(5);                              // contents: (5)
        S.push(3);                              // contents: (5, 3)
        S.pop();                               // removes 3, contents: (5)
        S.push(7);                              // contents: (5, 7)
        S.pop();                               // removes 7, contents: (5)
        S.push(9);                              // contents: (5, 9)
        S.push(1);                              // contents: (5, 9, 1)
        S.pop();                               // removes 1, contents: (5, 9)
        S.push(2);                              // contents: (5, 9, 2)
        S.push(8);                              // contents: (5, 9, 2, 8)
        S.pop();                               // removes 8, contents: (5, 9, 2)
        return S;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> testStack = test();
        ArrayList<Integer> stackList = new ArrayList<>();
        while (!testStack.isEmpty()) {
            stackList.add(testStack.pop());
        }
        // Reverse stackList to reflect prior stack order
        Collections.reverse(stackList);
        String stackString = stackList.toString();
        System.out.println("\nFinal stack is: " + stackString);
    }
}
