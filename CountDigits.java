import java.util.Random;

public class CountDigits {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[30];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        } // numbers.length表示数组的长度 即数组中元素的个数

        int[] count = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%d出现了%d次%n", i, count[i]); // or  System.out.println(i + "出现了" + count[i] + "次");
        }
    }
}