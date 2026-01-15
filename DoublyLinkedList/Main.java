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
        list.deleteByNode(list.head.next.next);
        list.printDoublyLinkedList();






    }
}
