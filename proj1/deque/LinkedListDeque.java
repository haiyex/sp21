package deque;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class LinkedListDeque<T> {

    private int size = 0;

    private Node<T> first;

    private Node<T> last;

    public LinkedListDeque() {
    }

    public void addFirst(T item) {

    }

    public void addLast(T item) {

    }

    public T removeFirst() {
        return null;
    }
    public T removeLast() {
        if (last != null) {
            Node<T> oldLast = last;
            if (last.prev != null) {
                this.last = oldLast.prev;
            } else {
                this.last = null;
            }
            return oldLast.getItem();
        }
        return null;
    }

    public T get(int index) {
        return null;
    }

    /**
     * 递归方法获取元素
     * @param index 对应元素的下表
     * @return 查找到元素
     */
    public T getRecursive(int index) {
        return null;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public int size() {
        return size;
    }

    
    public boolean isEmpty() {
        return size() > 0;
    }

    public boolean equals(Object o) {
        return false;
    }

    
    public Iterator<T> iterator() {
        return null;
    }

    public void printDeque() {

    }

    private static class Node<T> {
        T item;

        Node<T> prev;
        Node<T> next;

        public Node(T item, Node<T> prev, Node<T> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }

}
