import java.util.Scanner;

public class even_watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input < 4) {
            System.out.println("NO");
        } else if (input % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
