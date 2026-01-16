package DataStructures.DoublyLinkedList;

public class DoublyLinkedListImplementation {
    Node head;
    private int size = 0;
    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.back = current;
        }
        size += 1;
    }
    public void printDoublyLinkedList() {
        Node current = head;
        System.out.print("[");
        while(current != null) {
            if(current.next == null) {
                System.out.print(current.val);
            } else {
                System.out.print(current.val + ", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    //delete first node in the doubly linked list
    public void deleteFirstNode() {
        if(head == null) {
            System.out.println("Doubly linked list is empty!");
        } else if(head.next == null) {
            head = null;
        } else {
            Node prev = head;
            head = head.next;
            head.back = null;
            prev.next = null;
        }
        size -= 1;
    }

    // delete last node
    public void deleteAtLast() {
        if(head == null) {
            System.out.println("Doubly linked list is empty!");
        } else if(head.next == null) {
            head = null;
        } else {
            Node current = head;
            Node prev = null;
            while(current.next != null) {
                current = current.next;
            }
            prev = current.back;
            prev.next = null;
            current.back = null;
        }
    }

    public void deleteByK(int k) {
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        } else if(head.next == null) {
            head = null;
            return;
        } else {
            Node current = head, prev = null;
            int cnt = 0;
            while(current != null) {
                cnt += 1;
                if(cnt == k) {
                    prev = current.back;
                    if(current.next == null) { // it must be last node
                        prev.next = null;
                    } else if(prev == null) { // it must be a first node
                        head = head.next;
                        head.back = null;
                        current.next = null;

                    }else {
                        prev.next = current.next;
                        current.next.back = prev;
                        // removing the address of the deleted node
                        current.next = null;
                    }
                    current.back = null;
                    return;
                }
                current = current.next;
            }
            System.out.println("IndexOutOfBound: Please provide the proper Kth value");
        }
    }
    public void deleteByNode(Node node) {
        if(node == null) {
            System.out.println("NullPointerException: Please provide proper node!");
            return;
        }
        Node prevNode = node.back;
        Node backNode = node.next;
        if(backNode == null) {
            prevNode.next = null;
            node.back = null;
        } else {
            prevNode.next = backNode;
            backNode.back = prevNode;
            node.next = node.back = null;
        }
    }

    // functions - implementing by before the node
    public void insertHead(int num) {
        Node node = new Node(num);
        if(head == null) {
            head = node;
        } else {
            head.back = node;
            node.next = head;
            head = node;
        }
    }

    public void insertTail(int num) {
        Node node = new Node(num);
        Node current = head, prev = null;
        if(head == null) {
            head = node;
            return;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            prev = current.back;
            if (prev != null) {
                prev.next = node;
                node.back = prev;
                node.next = current;
                current.back = node;
            } else { // it's a single node
                current.back = node;
                node.next = current;
                head = node;
            }
        }

    }

    public void insertByKth(int k, int num) {
        Node node = new Node(num);
        if(head == null) {
            head = node;
            System.out.println("Doubly linked list is empty!");

            return;
        } else if(head.next == null) {
            head.next = node;
            node.back = head;
            return;
        } else {
            Node current = head, prev = null;
            int cnt = 0;
            while(current != null) {
                cnt += 1;
                if(cnt == k) {
                    prev = current.back;
                    prev.next = node;
                    node.next = current;
                    node.back = prev;
                    current.back = node;
                    return;
                }
                current = current.next;
            }
        }
        System.out.println("IndexOutOfBound: Please provide a proper Kth value!");
    }

    public void insertByNode(Node current, int num) {
        Node node = new Node(num);
        
        Node prev = current.back;
        prev.next = node;
        node.next = current;
        current.back = node;
        node.back = prev;

    }
}
