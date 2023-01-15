package bai10.baitap.trienkhaiarraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;// so luong phan tu co trong arrlist
    private static final int DEFAULT_CAPACITY = 10;// suc chua
    private Object elements[];// mang chua cac phan tu

    // pthuc constructor ko tham so voi suc chua mac dinh la 10
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // pthuc contructor voi suc chua duoc truyen vao
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //pthuc tra ve so luong co trong arrlist
    public int size() {
        return this.size;
    }

    public void cleanr() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        } else
            throw new IndexOutOfBoundsException("minCapacity :" + minCapacity);
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size++] = e;
        return true;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    //    pthuc lấy được vị trí của 1 phần tử trong arrlist
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //    pthuc tìm xem có phần tử trong arrlist không nếu có thì true
    public boolean contains(E elenment) {
        return this.indexOf(elenment) >= 0;
    }

    //    pthuc xóa 1 phan tử tại 1 vị trí index
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
// dùng for chạy từ index tới size -1...dồn phần tử  bên phải về 1 đơn vị để giá trị tại index bị ghi đè
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

}
