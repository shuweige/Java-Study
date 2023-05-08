import java.util.Scanner; //调用Scanner方法

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入投入金额（2元或3元）：");
        int money = scanner.nextInt();
        if (money == 2) {
            System.out.print("选择净净矿泉水(1),甜甜矿泉水(2)和美美矿泉水(3)之一：");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("净净矿泉水");
            } else if (choice == 2) {
                System.out.println("甜甜矿泉水");
            } else if (choice == 3) {
                System.out.println("美美矿泉水");
            } else {
                System.out.println("选择错误");
            }
        } else if (money == 3) {
            System.out.print("选择爽口可乐(1)，清凉雪碧(2)，和雪山果汁(3)之一：");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("爽口可乐");
            } else if (choice == 2) {
                System.out.println("清凉雪碧");
            } else if (choice == 3) {
                System.out.println("雪山果汁");
            } else {
                System.out.println("选择错误");
            }
        } else {
            System.out.println("输入的钱币不符合要求");
        }
        scanner.close();
    }
}
