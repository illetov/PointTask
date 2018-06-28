package com.company;

import static java.lang.Math.pow;

/*Created by inittey */

public class Point {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    Point(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Double getDistance() {
        return Math.sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }
}
