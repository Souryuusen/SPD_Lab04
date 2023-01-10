package edu.polsl.lab04;

public class Point {

    private int x, y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void incrementX() {
        this.x++;
    }

    public void incrementY() {
        this.y++;
    }

    public void increaseXBy(int value) {
        this.x += value;
    }

    public void increaseYBy(int value) {
        this.y += value;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
