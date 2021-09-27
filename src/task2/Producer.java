package task2;

public class Producer extends Thread{
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
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
