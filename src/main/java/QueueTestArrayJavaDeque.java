import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;

public class QueueTestArrayJavaDeque {

    // Implement functionality to produce final queue elements [7, 9, 4]
    public static Deque<Integer> test() {
        Deque<Integer> S = new ArrayDeque<>();
        S.add(7);
        S.add(9);
        S.add(4);
        // No removals needed if final queue is exactly these elements
        return S;
    }

    public static void main(String[] args) {
        Deque<Integer> testQueue = test();
        ArrayList<Integer> queueList = new ArrayList<>();
        while (!testQueue.isEmpty()) {
            queueList.add(testQueue.remove());
        }
        String queueString = queueList.toString();
        System.out.println("\nFinal queue is: " + queueString);
    }
}
