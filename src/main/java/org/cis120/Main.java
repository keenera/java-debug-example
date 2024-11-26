package org.cis120;

public class Main {

    public static void main(String[] args) {

        /* 1. */

        // make a circle
        Circle c1 = new Circle(10, 10, 4);

        // get area
        double area = c1.getArea();

        // print area of c1 - should be 4*4*3.14 = 50.26
        System.out.println("Should be ~50.26:");
        System.out.println(area + "\n");


        /* 2. */

        // make more circles
        Circle c2 = new Circle(10, 10, 3);
        Circle c3 = new Circle(10, 10, 5);
        // make a circle list
        Circle [] cList = new Circle[3];
        cList[0] = c1;
        cList[1] = c2;
        cList[2] = c3;

        // sum the areas of the circles with a for loop
        double sum = 0.0;
        for (int i = 0; i < cList.length; i++) {
            sum = cList[1].getArea();
        }

        // print the sum of areas - should be 157.08 (50 * pi)
        System.out.println("Should be ~157.08:");
        System.out.println(sum + "\n");

    }

}
