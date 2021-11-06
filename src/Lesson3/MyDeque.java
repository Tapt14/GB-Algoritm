package Lesson3;

public class MyDeque<T> {

    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;


    private int front;
    private int rear;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {
        if ((index - 1) < 0) {
            return list.length - 1;
        } else {
            return index - 1;
        }
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        return list[front];
    }

    public T peekRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        return list[rear];
    }

    public void addFront(T item) {
        if (isFull()) {
            reCapacity(size + size / 2);
        } else if (isEmpty()) {
            addIfIsEmpty(item);
        } else {
            size++;
            front = prevIndex(front);
            list[front] = item;
        }
    }

    public void addRear(T item) {
        if (isFull()) {
            reCapacity(size + size / 2);
        } else if (isEmpty()) {
            addIfIsEmpty(item);
        } else {
            size++;
            rear = nextIndex(rear);
            list[rear] = item;
        }
    }

    private void addIfIsEmpty(T item) {
        size++;
        list[rear] = item;
    }

    public void removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        } else {
            list[front] = null;
            front = nextIndex(front);
            size--;
            if (size < list.length / 2) {
                reCapacity(list.length / 2);
            }
        }
    }

    public void removeRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        } else {
            list[rear] = null;
            rear = prevIndex(rear);
            size--;
            if (size < list.length / 2) {
                reCapacity(list.length / 2);
            }
        }
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    private void shiftArrayToZeroIndex() {
        T[] tempList = (T[]) new Object[list.length];
        for (int i = 0; i < list.length; i++) {
            tempList[i] = list[(front + i) % list.length];
        }
        front = 0;
        rear = size - 1;
        list = tempList;
        tempList = null;
    }

    private void reCapacity(int newCapacity) {
        shiftArrayToZeroIndex();
        T[] tempArr = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
        tempArr = null;
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < list.length; i++) {
            sb.append(list[i]).append(", ");
        }

        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
