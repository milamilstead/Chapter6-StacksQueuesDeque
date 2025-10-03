import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class QueueTestArrayJavaDeque {

    // Implement functionality similar to Example 6.2.1
    public static Queue<Integer> test() {
        Queue<Integer> S = new ArrayDeque<>();  // Using ArrayDeque as a queue
        S.add(5);      // contents: (5)
        S.add(3);      // contents: (5, 3)
        S.remove();    // removes 5, contents: (3)
        S.add(7);      // contents: (3, 7)
        S.remove();    // removes 3, contents: (7)
        S.add(9);      // contents: (7, 9)
        S.add(1);      // contents: (7, 9, 1)
        S.remove();    // removes 7, contents: (9, 1)
        S.add(2);      // contents: (9, 1, 2)
        S.add(8);      // contents: (9, 1, 2, 8)
        S.remove();    // removes 9, contents: (1, 2, 8)
        return S;
    }

    public static void main(String[] args) { Queue<Integer> testQueue = test();
        ArrayList<Integer> queueList = new ArrayList<>();
        while (!testQueue.isEmpty()) {
            queueList.add(testQueue.remove());
        }
        String queueString = queueList.toString();
        System.out.println("\nFinal queue is: " + queueString);
    }
}

