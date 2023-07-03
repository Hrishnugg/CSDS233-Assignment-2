public class Stack<T extends Comparable<? super T>> {

    private class Node<T>{
        private T elem;
        private Node next;
        Node(T element){
            elem = element;
            next = null;
        }
        public T getElem() {
            return elem;
        }

        public void setElem(T elem) {
            this.elem = elem;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    private Node<T> top;
    public Stack() {
        top = null;
    }

        // pushes a value into the stack
        public boolean push(T value) {
            Node<T> newElem = new Node<T>(value);
            newElem.setNext(top);
            top = newElem;
            return true;
        }

        // deletes and returns the value at the front of the stack
        public T pop() {
            if (top == null) {
                return null;
            }
            Node<T> next = top.getNext();
            T value = top.getElem();
            top = next;
            return value;
        }

        // returns the value at the front of the stack without deleting it
        public T peek() {
            if (top == null){
                return null;
            }
            return top.getElem();
        }
    public boolean isEmpty() {
        return top == null;
    }

}
