package lesson3.deque;

import java.util.Arrays;
import java.util.Objects;

public class DequeImpl<E> implements Deque<E> {

    protected final E[] data;
    private final int HEAD_DEFAULT = 0;
    private final int TAIL_DEFAULT = -1;
    protected int size;

    protected int tail;
    protected int head;


    public DequeImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        head = HEAD_DEFAULT;
        tail = TAIL_DEFAULT;
    }

    //Добавление в начало
    @Override
    public boolean insertLeft(E value) {
        if(isFull()) {
            return false;
        }
        if (--head < 0) {
            head = size - 1;
        }
        data[head] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        return insert(value);
    }


    @Override
    public E removeLeft() {
        return remove();
    }

    @Override
    public E removeRight() {
        if(isEmpty()) {
            return  null;
        }

        E value = data[--tail];
        size--;
        return value;
    }

    //Добавление в конец
    @Override
    public boolean insert(E value) {
        if(isFull()) {
            return false;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if(isEmpty()) {
            return  null;
        }

        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = head; i < tail; i++) {
            sb.append(data[i]);
            if(i != tail) {
                sb.append(", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }
}
