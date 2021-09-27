package task1;

public class Producer extends Thread{
    private Buffer buffer;

    public Producer(Buffer storage) {
        this.buffer = storage;
    }

    @Override
    public void run() {
        while (true){
            try {
                buffer.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
