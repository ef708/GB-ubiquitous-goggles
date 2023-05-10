/* 2. Реализуйте очередь с помощью LinkedList со следующими методами:
	enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
	first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;
import java.util.Random;

public class p2 {
    public static void main(String[] args) {
        System.out.println("Исходный LinkedList: ");
        LinkedList<Integer> sourceLst= MkRndList(10);
        System.out.println(sourceLst);
        
        System.out.print("enqueue(5): ");
        enqueue(sourceLst, 5);
        System.out.println(sourceLst);
        
        System.out.println("dequeue(): " + dequeue(sourceLst) + '\n');
        
        System.out.print("first(): " + first(sourceLst) + '\n');
        System.out.println(sourceLst);

    }

    public static LinkedList<Integer> MkRndList(int len) {
        Random rnd = new Random();
        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            lst.add(rnd.nextInt(1001));
        }
        return lst;
    }

    public static void enqueue(LinkedList<Integer> ll, int e) {
        ll.addLast(e);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        if (ll.isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        } else {
            return ll.pollFirst();
        }
    }

    public static int first(LinkedList<Integer> ll) {
        if (ll.isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        } else {
            return ll.getFirst();
        }
    }
}