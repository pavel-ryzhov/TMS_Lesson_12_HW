package task1;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;
    private ReentrantLock lock = new ReentrantLock();

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public void put() throws InterruptedException {
        try {
            lock.lock();
            if (buffer.size() >= capacity) return;
            buffer.add(new Random().nextInt());
            System.out.println("Добавлен один элемент, количество хранимых элементов: " + buffer.size());
        }finally {
            lock.unlock();
        }
    }
    public void get() throws InterruptedException{
        try {
            lock.lock();
            if (buffer.isEmpty()) return;
            buffer.removeFirst();
            System.out.println("Удалён один элемент, количество хранимых элементов: " + buffer.size());
            Thread.sleep(new Random().nextInt(10));
        }finally {
            lock.unlock();
        }
    }
}
