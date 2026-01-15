package DataStructures.LinkedList;

public class LinkedListImplementation {
    Node head;
    private int size = 0;

    // create a new node and inserting into a linked list
    public void insert(int val) {
        Node node = new Node(val); // create a new node
        if (head == null) {
            head = node; // Head pointer should always pointing to a First node of a LinkedList
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        size += 1;
    }
    // display the linked list
    public void printLinkedList() {
        Node currentNode = head;
        System.out.print("[");
        while(currentNode != null) {
            if(currentNode.next != null)
                System.out.print(currentNode.val + ", ");
            else
                System.out.print(currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }
    // size of the linked list
    public int getSize() {
        return size;
    }

    // check if the give value is present or not
    public boolean isValPresent(int target) {
        if(head == null) {
            System.out.println("Linked list is empty!");
            return false;
        }
        Node current = head;
        while(current != null) {
            if(current.val == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // delete the head or first node of linked list
    public void deleteHeadNode() {
        if(head == null) {
            System.out.println("Linked list is empty!");
        } else {
            head = head.next;
        }
        size -= 1;
    }

    // delete the last node of the linked list
    public void deleteLastNode() {
        if(head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        Node current = head;
        if(head.next == null) {
            head = null;
        } else {
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size -= 1;
    }

    public void deleteByKth(int k) {
        if(head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        if(k == 1) {
            deleteHeadNode();
        } else {
            Node current = head;
            Node prev = null;
            int cnt = 0;
            while(current != null) {
                cnt += 1;
                if(cnt == k) {
                    prev.next = prev.next.next;
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
        System.out.println("IndexOutOfBound: Please provide proper kth value!");

    }

    public void deleteByValue(int target) {
        if(head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        if(head.val == target) {
            head = head.next;
        } else {
            Node current = head;
            Node prev = null;
            while(current != null) {
                if(current.val == target) {
                    prev.next = prev.next.next;
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
        System.out.println("Target item not found!");
    }

    public void insertAtFirst(int num) {
        Node node = new Node(num);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void insertAtLast(int num) {
        Node node = new Node(num);
        if(head == null) {
            head = node;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insertByKth(int k, int num) {
        if(head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        if(k == 1) {
            insertAtFirst(num);
            return;
        } else {
            Node node = new Node(num);
            Node current = head, prev = null;
            int cnt = 0;
            while(current != null) {
                cnt += 1;
                if(cnt == k) {
                    prev.next = node;
                    node.next = current;
                    return;
                }
                prev = current;
                current = current.next;
            }
            if((cnt + 1) == k) { // add at the last
                insertAtLast(num);
                return;
            }
        }
        System.out.println("IndexOutOfBound: Please provide proper kth value!");

    }

    public void insertBeforeValue(int target, int num) {
        Node node = new Node(target);
        if(head == null) {
            head = node;
            return;
        }
        if(head.val == num) {
            insertAtFirst(target);
            return;
        } else {
            Node current = head, prev = null;
            while(current != null) {
                if(current.val == num) {
                    prev.next = node;
                    node.next = current;
                    return;
                }
                prev = current;
                current = current.next;
            }
        }


    }
}
