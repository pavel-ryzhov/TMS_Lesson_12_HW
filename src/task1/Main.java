package task1;

/**
 * Напишите многопоточный ограниченный буфер с использованием ReentrantLock.
 */
public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);
        new Producer(buffer).start();
        new Consumer(buffer).start();
    }
}
