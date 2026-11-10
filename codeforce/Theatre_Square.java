import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int num1 = (m / a) + 1;
        int num2 = (n / a) + 1;
        System.out.println(num1 * num2);
    }
}
