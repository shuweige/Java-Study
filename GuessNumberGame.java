import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guess;
        System.out.println("猜猜这个数字是多少（1-100）：");
        do {
            guess = scanner.nextInt();
            if (guess < target) {
                System.out.println("猜小了，再输入你的猜测：")；
            } else if (guess > target) {
                System.out.print("猜大了，再输入你的猜测：");
            }
        } while (guess != target);
        System.out.println("猜对了！");
        scanner.close();
    }
}