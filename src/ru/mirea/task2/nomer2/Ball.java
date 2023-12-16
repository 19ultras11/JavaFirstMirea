package ru.mirea.task2.nomer2;

public class Ball {
    private double posX = 0.0;
    private double posY = 0.0;

    public Ball(double x, double y) {
        this.posX = x;
        this.posY = y;
    }

    public Ball() {
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double x) {
        this.posX = x;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double y) {
        this.posY = y;
    }

    public void setPosXY(double x, double y){
        this.posX = x;
        this.posY = y;
    }

    public void move(double xDisp, double yDisp){
        posX += xDisp;
        posY += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}

class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.1, 2.2);
        System.out.println(b1);
        Ball b2 = new Ball();
        b2.setPosX(4.3);
        b2.setPosY(6.1);
        System.out.println(b2);
        b1.setPosXY(4.3, 8.9);
        System.out.println(b1);
        System.out.println("X pos: " + b2.getPosX() + ", Y pos: " + b2.getPosY());

        b2.move(10.10, 20.20);
        System.out.println(b2);
    }
}