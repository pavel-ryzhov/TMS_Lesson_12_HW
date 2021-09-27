package task0;

/**
 * Создать три потока Т1, Т2 и Т3
 * Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
 * (используя метод join)
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadPattern("T1"));
        Thread t2 = new Thread(new ThreadPattern("T2"));
        Thread t3 = new Thread(new ThreadPattern("T3"));

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
