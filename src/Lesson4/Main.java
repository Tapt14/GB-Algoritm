package Lesson4;

public class Main {

    public static void main(String[] args) {

        MyLinkedStack<Integer> myLinkedStack = new MyLinkedStack<>();

        myLinkedStack.push(1);
        myLinkedStack.push(2);
        myLinkedStack.push(3);
        myLinkedStack.push(4);

        System.out.println(myLinkedStack.size());
        System.out.println(myLinkedStack.peek());
        myLinkedStack.pop();
        System.out.println(myLinkedStack.size());
        System.out.println(myLinkedStack.peek());

    }
}
