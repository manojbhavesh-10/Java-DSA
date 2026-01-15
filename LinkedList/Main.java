package DataStructures.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedListImplementation list = new LinkedListImplementation();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.printLinkedList();
        System.out.println( list.getSize() );
        System.out.println( list.isValPresent(-1) );
//        list.deleteHeadNode();
//        list.deleteHeadNode();
//        list.deleteLastNode();
//        list.deleteLastNode();

//        list.deleteByKthValue(10);
//        list.deleteByValue(-1);
//        list.insertAtFirst(-9);
//        list.insertAtFirst(-40);
//        list.insertAtFirst(-3);
//        list.insertAtLast(-7);
//        list.insertAtLast(-5);
//        list.insertByKth(6, -1);
        list.insertBeforeValue(-1, 10);
        list.printLinkedList();



    }
}
