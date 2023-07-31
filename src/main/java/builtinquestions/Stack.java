package builtinquestions;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    //Implement a stack data structure in Java with push, pop and peek operations
    private ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get( stack.size()-1 );
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek:" + stack.peek());
        System.out.println("Size:" + stack.size());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Is Empty: " + stack.isEmpty());

        stack.push(40);
        System.out.println("Peek: " + stack.peek());
    }
}
