package home.rxjavatest;


public class Gun {

    private String bullet;
    private int speedBullet;

    public Gun(String bullet, int speedBullet) {
        this.bullet = bullet;
        this.speedBullet = speedBullet;
    }

    public String getBullet() {
        return bullet;
    }

    public void setBullet(String bullet) {
        this.bullet = bullet;
    }

    public int getSpeedBullet() {
        return speedBullet;
    }

    public void setSpeedBullet(int speedBullet) {
        this.speedBullet = speedBullet;
    }
}
