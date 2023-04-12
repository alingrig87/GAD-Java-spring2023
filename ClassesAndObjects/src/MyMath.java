public class MyMath {

    public int add(int x, int y) {
        return x + y;
    }

    public float add(float f1, float f2) {
        System.out.println("S-a apelat metoda care intoarce float");
        return f1 + f2;
    }

    public float add(int a, float b) {
        return a + b;
    }

    public float add(float a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int square(int n) {
        return n*n;
    }

    public double average(int...arr) {
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]);
        }

        return 0;
    }
}
