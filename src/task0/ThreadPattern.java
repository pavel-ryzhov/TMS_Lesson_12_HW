package task0;

public class ThreadPattern implements Runnable {
    private String name;

    public ThreadPattern(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " started execution");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " is completed");
    }
}
