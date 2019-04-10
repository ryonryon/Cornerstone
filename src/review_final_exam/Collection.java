package review_final_exam;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Collection{
    public static void main(String[] args) {

        HashSet<String> mySet = new HashSet<>();

        mySet.add("A");
        mySet.add("A");
        mySet.add("B");
        mySet.add("A");
        mySet.add("C");

        System.out.println(mySet);

        Stack<String> myStack = new Stack<>();
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("ddddd");

        System.out.println(myStack.peek());

        System.out.println(myStack);

        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("A");
        myQueue.add("B");
        myQueue.add("A");
        myQueue.add("C");

        System.out.println(myQueue);

    }
}