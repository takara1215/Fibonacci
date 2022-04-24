public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    static int fibonacci(int N ){
        if(N == 0) return 0;
        if(N == 1) return 1;
        int result = fibonacci(N - 1) + fibonacci(N - 2);

        return result;
    }
}