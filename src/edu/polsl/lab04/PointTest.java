package edu.polsl.lab04;

public class PointTest {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2,5);

        System.out.println("Punkt 1: " + p1 + "\tPunkt 2: " + p2);

        p2.increaseXBy(5);
        System.out.println("Punkt 2: " + p2);
        p2.increaseYBy(-2);
        System.out.println("Punkt 2: " + p2);
        p2.incrementX();
        System.out.println("Punkt 2: " + p2);
        p2.incrementY();
        System.out.println("Punkt 2: " + p2);
    }

}
