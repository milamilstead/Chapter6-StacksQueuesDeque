
import org.desu.ch6stackqueue.LinkedStack;
import org.desu.ch6stackqueue.Stack;

import java.util.ArrayList;
import java.util.Collections;

public class StackTestLinkedList {

    // TODO: in the test function below, place
    // the statements from Code Fragment 6.1.3
    // from the book - read and understand what each
    // statement does
    // NOTE: we are returning an interface Stack<Integer>
    // so the implementation object may be of different types
    // as long as they implement the stack interface
    public static Stack<Integer> test() {
        Stack<Integer> S = new LinkedStack<>();  // changed to LinkedStack
        S.push(5);                              // contents: (5)
        S.push(3);                              // contents: (5, 3)
        S.pop();                               // contents: (5)
        S.push(7);                              // contents: (5, 7)
        S.pop();                               // contents: (5)
        S.push(9);                              // contents: (5, 9)
        S.push(1);                              // contents: (5, 9, 1)
        S.pop();                               // contents: (5, 9)
        S.push(2);                              // contents: (5, 9, 2)
        S.push(8);                              // contents: (5, 9, 2, 8)
        S.pop();                               // contents: (5, 9, 2)
        return S;
    }

    public static void main (String[] args) {
        Stack<Integer> testStack;
        testStack = test();
        // Now convert stack contents to String
        ArrayList<Integer> stackList = new ArrayList<>();
        while (!(testStack.isEmpty())) {
            stackList.add(testStack.pop());
        }
        // Reverse stackList to reflect prior stack
        Collections.reverse(stackList);
        // Now convert to String
        String stackString = stackList.toString();
        System.out.println("\nFinal stack is: " + stackString);
    }
}
