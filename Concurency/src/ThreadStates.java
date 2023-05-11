public class ThreadStates implements Runnable {
    @Override
    public void run() {
        int counter = 1;
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(300);
                System.out.println(i);
                if (counter % 10 == 0) {
                    System.out.println("Other 10 numbers");
                }
                counter += 1;
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadStates());
        t1.start();
    }
}
