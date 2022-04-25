import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fibonacci(N));
    }

    static int fibonacci(int N ){
        if(N == 0) return 0;
        if(N == 1) return 1;
        int result = fibonacci(N - 1) + fibonacci(N - 2);

        return result;
    }
}
