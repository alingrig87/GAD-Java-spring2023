public class MyThread2 extends Thread{
    private String name;

    public MyThread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.name + " is running");
        try {
            Thread.sleep(500);
        } catch( InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + this.name + " is done");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread2("Thread 1"));
        Thread thread2 = new Thread(new MyThread2("Thread 2"));
        Thread thread3 = new Thread(new MyThread2("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
