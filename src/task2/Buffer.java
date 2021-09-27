package task2;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put() throws InterruptedException {
        try {
            if (buffer.size() >= capacity) wait();
            buffer.add(new Random().nextInt());
            System.out.println("Добавлен один элемент, количество хранимых элементов: " + buffer.size());
        }finally {
            notify();
        }
    }
    public synchronized void get() throws InterruptedException{
        try {
            if (buffer.isEmpty()) wait();
            buffer.removeFirst();
            System.out.println("Удалён один элемент, количество хранимых элементов: " + buffer.size());
            Thread.sleep(new Random().nextInt(10));
        }finally {
            notify();
        }
    }
}
