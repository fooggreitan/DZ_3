public class dz_3 {
    Node root;
    private int size;

    public void print(){
        Node curNode = root;
        System.out.print("[ ");
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public void add(int value){
        if(root == null){
            root = new Node(value);
            size = 1;
            return;
        }
        Node curNode = root;
        while (curNode.next != null) curNode = curNode.next;
        curNode.next = new Node(value);
        size++;
    }

    public void revert(){
        if(root == null || root.next == null) return;

        Node prevNode = root;
        Node curNode = root.next;
        while (curNode != null){
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        root.next = null;
        root = prevNode;
    }

    private class Node {
        int value;
        Node next;
        Node previous;

        public Node(){}
        public Node (int _value){this.value = _value;}
        public Node (int _value, Node _next){this.value = _value; this.next = _next;}
    }
}
