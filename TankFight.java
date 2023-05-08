class Tank {
    private double speed; // 声明double型变量speed,刻画速度
    private int bulletAmount; // 声明int型变量bulletAmount,刻画炮弹数量

    void speedUp(int s) {
        speed += s; // 将s+speed赋值给speed
    }

    void speedDown(int d) {
        if (speed - d >= 0)
            speed -= d; // 将speed-d赋值给speed
        else
            speed = 0;
    }

    void setBulletAmount(int m) {
        bulletAmount = m;
    }

    int getBulletAmount() {
        return bulletAmount;
    }

    double getSpeed() {
        return speed;
    }

    void fire() {
        if (bulletAmount >= 1) {
            bulletAmount -= 1; // 将bulletAmount-1赋值给bulletAmount
            System.out.println("打出一发炮弹");
        } else {
            System.out.println("没有炮弹了,无法开火");
        }
    }
}

public class TankFight {
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