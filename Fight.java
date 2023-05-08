class Tank {
    // 声明double型变量speed,刻画速度
    private double speed;
    // 声明int型变量bulletAmount,刻画炮弹数量
    private int bulletAmount;

    public void speedUp(int s) {
        // 将s+speed赋值给speed
        speed = s + speed;
    }

    public void speedDown(int d) {
        if (speed - d >= 0)
            // 将speed-d赋值给speed
            speed = speed - d;
        else
            speed = 0;
    }

    public void setBulletAmount(int m) {
        bulletAmount = m;
    }

    public int getBulletAmount() {
        return bulletAmount;
    }

    public double getSpeed() {
        return speed;
    }

    public void fire() {
        if (bulletAmount >= 1) {
            // 将bulletAmount-1赋值给bulletAmount
            bulletAmount = bulletAmount - 1;
            System.out.println("打出一发炮弹");
        } else {
            System.out.println("没有炮弹了,无法开火");
        }
    }
}

public class Fight {
    public static void main(String args[]) {
        Tank tank1, tank2;
        tank1 = new Tank();
        tank2 = new Tank();
        tank1.setBulletAmount(10);
        tank2.setBulletAmount(10);
        System.out.println("tank1的炮弹数量：" + tank1.getBulletAmount());
        System.out.println("tank2的炮弹数量：" + tank2.getBulletAmount());
        tank1.speedUp(80);
        tank2.speedUp(90);
        System.out.println("tank1目前的速度：" + tank1.getSpeed());
        System.out.println("tank2目前的速度：" + tank2.getSpeed());
        tank1.speedDown(15);
        tank2.speedDown(30);
        System.out.println("tank1目前的速度：" + tank1.getSpeed());
        System.out.println("tank2目前的速度：" + tank2.getSpeed());
        System.out.println("tank1开火：");
        tank1.fire();
        System.out.println("tank2开火：");
        tank2.fire();
        tank2.fire();
        System.out.println("tank1的炮弹数量：" + tank1.getBulletAmount());
        System.out.println("tank2的炮弹数量：" + tank2.getBulletAmount());
    }
}