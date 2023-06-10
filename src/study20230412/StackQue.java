package study20230412;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQue {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("hi");
        System.out.println(stack.push("jii"));
        stack.push("hwiw");

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        Queue<Integer> que = new LinkedList<Integer>();
        que.offer(12);
        que.offer(132);
        que.offer(10);
        System.out.println(que.poll());;
        System.out.println(que);
    }
}
