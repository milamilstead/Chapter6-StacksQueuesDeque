import org.desu.ch6stackqueue.ArrayQueue;
import org.desu.ch6stackqueue.Queue;

import java.util.ArrayList;

public class QueueTestArray {

    // TODO: replace stack with queue functions
    // Implement functionality from the table in Example 6.2.1
    // similar to code fragment 6.1.3 but NOT exactly the same)

    public static Queue<Integer> test() {
        Queue<Integer> S = new ArrayQueue<>();  // contents: ()
        // Put code here
        return S;
    }

    public static void main(String[] args) {
        Queue<Integer> testQueue;
        testQueue = test();
        ArrayList<Integer> queueList = new ArrayList<>();
        while (!(testQueue.isEmpty())) {
            queueList.add(testQueue.dequeue());
        }
        // Now convert to String
        String queueString = queueList.toString();
        System.out.println("\nFinal queue is: " + queueString);
    }
}
