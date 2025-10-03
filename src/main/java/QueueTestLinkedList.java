import org.desu.ch6stackqueue.LinkedQueue;
import org.desu.ch6stackqueue.Queue;

import java.util.ArrayList;

public class QueueTestLinkedList {

    // Implement functionality from the table in Example 6.2.1
    // similar to code fragment 6.1.3 but NOT exactly the same

    public static Queue<Integer> test() {
        Queue<Integer> S = new LinkedQueue<>();  // changed to LinkedQueue
        S.enqueue(5);      // contents: (5)
        S.enqueue(3);      // contents: (5, 3)
        S.dequeue();       // removes 5, contents: (3)
        S.enqueue(7);      // contents: (3, 7)
        S.dequeue();       // removes 3, contents: (7)
        S.enqueue(9);      // contents: (7, 9)
        S.enqueue(7);      // contents: (7, 9, 1)
        S.dequeue();       // removes 7, contents: (9, 1)
        S.enqueue(9);      // contents: (9, 1, 2)
        S.enqueue(4);      // contents: (9, 1, 2, 8)
        S.dequeue();       // removes 9, contents: (1, 2, 8)
        return S;
    }

    public static void main(String[] args) {
        Queue<Integer> testQueue;
        testQueue = test();
        ArrayList<Integer> queueList = new ArrayList<>();
        while (!testQueue.isEmpty()) {
            queueList.add(testQueue.dequeue());
        }
        // Now convert to String
        String queueString = queueList.toString();
        System.out.println("\nFinal queue is: " + queueString);
    }
}

