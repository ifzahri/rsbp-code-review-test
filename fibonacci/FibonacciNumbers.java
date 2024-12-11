public class FibonacciNumbers {
    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return(fibonacci(n-1) + fibonacci(n-2));
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci numbers up to 10,000 in Java:");
        for (int i = 0; i < 10000; i++) {
            if (fibonacci(i) < 10000) {
                System.out.println(fibonacci(i));
            }
        }
    }
}