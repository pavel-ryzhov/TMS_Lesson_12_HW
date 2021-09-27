package task2;

public class Consumer extends Thread{
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true){
            try {
                buffer.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
