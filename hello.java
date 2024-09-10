import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int a, b;
        try (Scanner in = new Scanner(System.in)) {
            a = in.nextInt();
            b = in.nextInt();
        }
        System.out.println(a * b);
    }
}