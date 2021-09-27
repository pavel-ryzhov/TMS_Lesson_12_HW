package task1;

public class Consumer extends Thread{
    private Buffer buffer;

    public Consumer(Buffer storage) {
        this.buffer = storage;
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
