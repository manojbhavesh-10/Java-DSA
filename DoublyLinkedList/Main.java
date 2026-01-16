package DataStructures.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListImplementation list = new DoublyLinkedListImplementation();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.printDoublyLinkedList();
//        list.deleteAtLast();
//        list.printDoublyLinkedList();
//        list.deleteAtLast();
//        list.printDoublyLinkedList();
//        list.deleteAtLast();
//        list.printDoublyLinkedList();
//        list.deleteAtLast();
//        list.printDoublyLinkedList();
//        list.deleteAtLast();
//        list.printDoublyLinkedList();
//        list.deleteAtLast();
//        list.deleteAtLast();
//        list.deleteAtLast();
//        list.deleteByK(1);
//        list.deleteByK(1);
//
//        list.deleteByK(2);
//        list.deleteByNode(list.head.next.next);
//        list.insertHead(-1);
//        list.insertHead(-3);
//        list.insertHead(-7);
//        list.insertTail(-5);
//        list.insertTail(-7);
//        list.insertTail(-3);
//        list.insertByKth(3, -1);
//        list.insertByKth(5, -8);
//        list.insertByKth(10, -4);
        list.insertByNode(list.head.next.next.next.next.next, -1);
        list.printDoublyLinkedList();






    }
}
