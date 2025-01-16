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
		Node<T> f = first;
		if (f == null) {
			last = new Node<T>(item, null, null);
			first = last;
		} else {
			first = new Node<T>(item, null, f);
		}
		size++;
    }

    public void addLast(T item) {
		Node<T> l = last;
		if (l == null) {
			last = new Node<T>(item, null, null);
			first = last;
		} else {
			last = new Node<T>(item, l, null);
		}
		size++;
    }

    public T removeFirst() {
        if (first != null) {
            Node<T> f = first;
			first = f.next;
            if (f.next == null) {
                last = null;
            }
            return f.getItem();
        }
        return null;
    }
    public T removeLast() {
        if (last != null) {
            Node<T> oldLast = last;
			last = oldLast.prev;
            if (last.prev == null) {
                first = null;
            }
            return oldLast.getItem();
        }
        return null;
    }

    public T get(int index) {
		int start = 0;
		
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
