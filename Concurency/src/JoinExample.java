import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JoinExample {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        List<Randomizer> randomizers = new ArrayList<>();
        List<Integer> numbers =  new ArrayList<>();

        for(int i = 1; i <= 5; i++) {
            Randomizer randomizer = new Randomizer("Thread " + i, numbers);
            Thread thread = new Thread(randomizer);
            threads.add(thread);
            randomizers.add(randomizer);
            thread.start();
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
        }

        int sum = 0;
        for (int number: numbers) {
            System.out.println("Test " +  number);
            sum = sum + number;
        }
        System.out.println("Sum = " + sum);
    }
}

class Randomizer implements Runnable {
    private int number;
    private String name;
    private List<Integer> numbers;

    public Randomizer(String name, List<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Random rand = new Random();
        number = rand.nextInt(10) + 1;
        numbers.add(number);
        System.out.println("Randomized number " + number + " in thread " + name);
    }

    public int getNumber() {
        return number;
    }
}