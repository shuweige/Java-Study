import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] data = new int[5][6];
        Random random = new Random();
        // 初始化数组为随机数
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(100);
            }
        }

        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int value = data[i][j];
                boolean isRowMax = true;
                boolean isColMax = true;
                // 判断该元素是否在所在行是最大的
                for (int k = 0; k < data[i].length; k++) {
                    if (data[i][k] > value) {
                        isRowMax = false;
                        break;
                    }
                }
                // 判断该元素是否在其所在列也是最大的
                for (int k = 0; k < data.length; k++) {
                    if (data[k][j] > value) {
                        isColMax = false;
                        break;
                    }
                }
                // 如果符合条件，则输出其值及位置
                if (isRowMax && isColMax) {
                    System.out.printf("元素 %d 在位置 (%d, %d) 上\n", value, i, j);
                    found = true;
                }
            }
        }
        // 如果没有找到符合条件的元素，则输出提示信息
        if (!found) {
            System.out.println("没有这样的元素");
        }
    }
}
