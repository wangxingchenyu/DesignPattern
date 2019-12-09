package main.java.DesignPatter.flyweightPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/4 13:41
 * @Version 1.0
 */
public class BulletPoll {
    List<Bullet> bullets = new ArrayList();

    /**
     * 池化思想，如数据库连接池，线程池
     */ {
        for (int i = 0; i < 10; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            if (!b.isLive) return b;
        }

        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPoll bulletPoll = new BulletPoll();
        List<Bullet> bullets = bulletPoll.bullets;

        while (true) {
            Random random = new Random();
            int i = random.nextInt(10);
            Bullet bullet = bullets.get(i);
            bullet.isLive = false;

            for (Bullet bullet1 : bullets) {
                System.out.println(bullet1 + "对象个数" + bullets.size());
            }
        }
    }

}


class Bullet {
    UUID uuid = UUID.randomUUID();
    boolean isLive;

    @Override
    public String toString() {
        return "Bullet{" +
                "uuid=" + uuid +
                ", isLive=" + isLive +
                '}';
    }
}
