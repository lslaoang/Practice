public class LinkeLIst {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    Node reverseList(Node node){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node){

        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static  void main(String[]args){

        LinkeLIst thisList = new LinkeLIst();

        thisList.head = new Node(12);
        thisList.head.next = new Node(13);
        thisList.head.next.next = new Node(14);
        thisList.head.next.next.next = new Node(15);

        thisList.printList(head);
        head = thisList.reverseList(head);

        thisList.printList(head);

    }

}
