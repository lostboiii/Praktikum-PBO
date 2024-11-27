public class test {
    
    public static class DoublyLinkedList<T> {
        private Node<T> head;
        private Node<T> tail;
        private int size;

        private static class Node<T> {
            T data;
            Node<T> prev;
            Node<T> next;

            Node(T data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }

        public DoublyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        public void addFirst(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void addLast(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public T removeFirst() {
            if (isEmpty()) {
                throw new IllegalStateException("List is empty");
            }
            T data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            return data;
        }

        public T removeLast() {
            if (isEmpty()) {
                throw new IllegalStateException("List is empty");
            }
            T data = tail.data;
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            size--;
            return data;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void clear() {
            head = null;
            tail = null;
            size = 0;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Node<T> current = head;
            while (current != null) {
                sb.append(current.data);
                if (current.next != null) {
                    sb.append(", ");
                }
                current = current.next;
            }
            sb.append("]");
            return sb.toString();
        }

        public String print() {
            if (isEmpty()) {
                return "Linked List is empty";
            }
            StringBuilder sb = new StringBuilder();
            Node<T> temp = head;
            while (temp != null) {
                sb.append(temp.data).append(" ");
                temp = temp.next;
            }
            return sb.toString().trim();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        int[] data = {65, 90, 43, 49, 98, 14};

        try {
            dll.addFirst(data[0]);
            System.out.println("Success add: " + data[0]);
            System.out.println("Success add: " + data[1]);
            dll.addLast(data[1]);
            System.out.println("Success add: " + data[2]);
            dll.addLast(data[2]);
            System.out.println("Success add: " + data[3]);
            dll.addFirst(data[3]);
            System.out.println("Success add: " + data[4]);
            dll.addLast(data[4]);
            System.out.println("Success add: " + data[5]);
            dll.addFirst(data[5]);
            System.out.println();
            System.out.println("Success remove: " + dll.remove());
            System.out.println("Linked List: " + dll.print());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
