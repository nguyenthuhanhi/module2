package bai10.baitap.trienkhailinketlist;

public class MyLinked {
    public class MyLinkedList <E> {
        private Node head;
        private int numNodes = 0;

        private class Node {
            private Node next;
            private Object data;

            public Node(Object data) {
                this.data = data;
            }

            public Object getData() {
                return this.data;
            }
        }

        public MyLinkedList() {
        }

        public void addFirst(E element) {
            Node temp = head;
            head = new Node(element);
            head.next = temp;
            numNodes++;
        }

        public void addLast(E element) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(element);
            numNodes++;
        }

        public void add(int index, E element) {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        }

        public Object get(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        @Override
        public String toString() {
            String str = "";
            for (int i = 0; i < numNodes - 1; i++) {
                str += get(i) + ", ";
            }
            str += get(numNodes - 1);
            return str;
        }

        public E remove(int index) {
            if (index < 0 || index > numNodes) {
                throw new IllegalArgumentException("Error index: " + index);
            }
            Node temp = head;

            Object data;

            if (index == 0) {
                data = temp.data;
                head = head.next;
                numNodes--;
            } else {
                for (int i = 0; i < index - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                data = temp.next.data;
                temp.next = temp.next.next;
                numNodes--;
            }
            return (E) data;
        }

        public boolean remove(E element) {
            if (head.data.equals(element)) {
                remove(0);
            } else {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.data.equals(element)) {
                        temp.next = temp.next.next;
                        numNodes--;
                        return true;
                    }
                    temp = temp.next;
                }
            }
            return false;
        }
    }
}
