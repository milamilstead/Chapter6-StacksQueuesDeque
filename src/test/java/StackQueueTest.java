//import org.desu.answermap.AnswerMap;
import org.desu.ch6stackqueue.Queue;
import org.desu.ch6stackqueue.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

class StackQueueTest {

    // Part 1
    @Test
    void test1() {
        Stack<Integer> testStack;
        testStack = StackTestArray.test();
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
        Assertions.assertEquals(stackString, "[7, 9, 6]");
    }

    @Test
    void test2() {
        Stack<Integer> testStack;
        testStack = StackTestLinkedList.test();
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
        Assertions.assertEquals(stackString, "[7, 9, 6]");
    }

    @Test
    void test3() {
        Queue<Integer> testQueue;
        testQueue = QueueTestArray.test();
        System.out.println("\nFinal queue in dequeue order is: ");
        ArrayList<Integer> queueList = new ArrayList<>();
        while (!(testQueue.isEmpty())) {
            queueList.add(testQueue.dequeue());
        }
        // Now convert to String
        String queueString = queueList.toString();
        System.out.println("\nFinal queue is: " + queueString);
        Assertions.assertEquals(queueString, "[7, 9, 4]");
    }

    @Test
    void test4() {
        Queue<Integer> testQueue;
        testQueue = QueueTestLinkedList.test();
        System.out.println("\nFinal queue in dequeue order is: ");
        ArrayList<Integer> queueList = new ArrayList<>();
        while (!(testQueue.isEmpty())) {
            queueList.add(testQueue.dequeue());
        }
        // Now convert to String
        String queueString = queueList.toString();
        System.out.println("\nFinal queue is: " + queueString);
        Assertions.assertEquals(queueString, "[7, 9, 4]");
    }

    @Test
    void test5() {
        Deque<Integer> testStack;
        testStack = StackTestArrayJavaDeque.test();
        // Now convert to String
        String stackString = testStack.toString();
        System.out.println("\nFinal stack is: " + stackString);
        Assertions.assertEquals(stackString, "[7, 9, 6]");
    }

    @Test
    void test6() {
        Deque<Integer> testQueue;
        testQueue = QueueTestArrayJavaDeque.test();
        // Now convert to String
        String queueString = testQueue.toString();
        System.out.println("\nFinal queue is: " + queueString);
        Assertions.assertEquals(queueString, "[7, 9, 4]");
    }

}