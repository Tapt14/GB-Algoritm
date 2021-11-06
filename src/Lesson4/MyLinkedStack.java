package Lesson4;

public class MyLinkedStack<T> {

    private final MyLinkedList<T> list;

    public MyLinkedStack() {
        list = new MyLinkedList<>();
    }

    public void push(T item) {
        list.insertFirst(item);
    }

    public void pop () {
        list.getFirst();
        list.deleteFirst();
    }

    public T peek() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
