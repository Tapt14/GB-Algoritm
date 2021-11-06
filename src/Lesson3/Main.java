package Lesson3;

import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*
      Тест Reverse Sentences
      System.out.println(new ReverseSentences(new Scanner(System.in).nextLine()).reversingResult());
      */


        // Тест MyDeque
        MyDeque<Integer> myDeque = new MyDeque<>();

        myDeque.addRear(4);
        myDeque.addFront(3);
        myDeque.addFront(2);
        myDeque.addFront(1);
        myDeque.addRear(5);
        myDeque.addRear(6);
        myDeque.addRear(7);
        myDeque.addRear(8);
        myDeque.addRear(9);
        myDeque.addRear(10);

        System.out.println(myDeque.peekFront());
        System.out.println(myDeque.peekRear());
        System.out.println(myDeque.size());
        System.out.println(myDeque.getFront());
        System.out.println(myDeque.getRear());
        System.out.println(myDeque);

        myDeque.addFront(11);
        myDeque.addFront(12);
        myDeque.addRear(13);
        myDeque.addRear(14);

        System.out.println(myDeque.peekFront());
        System.out.println(myDeque.peekRear());
        System.out.println(myDeque.size());
        System.out.println(myDeque.getFront());
        System.out.println(myDeque.getRear());
        System.out.println(myDeque);

        myDeque.removeFront();
        myDeque.removeFront();
        myDeque.removeFront();
        myDeque.removeFront();
        myDeque.removeFront();
        myDeque.removeRear();
        myDeque.removeRear();
        //myDeque.removeRear();

        System.out.println(myDeque.peekFront());
        System.out.println(myDeque.peekRear());
        System.out.println(myDeque.size());
        System.out.println(myDeque.getFront());
        System.out.println(myDeque.getRear());
        System.out.println(myDeque);

    }
}
