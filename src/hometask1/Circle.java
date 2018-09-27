package hometask1;

import hometask1.Figure;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private double d;


    public Circle(double d) {
        this.d = d;
    }


    double getPerimetr() {
        return this.d * PI;
    }

    @Override
    double getArea() {
        double r;
        r = this.d / 2;
        return r * r * PI;
    }

    public String toString() {
        return "hometask1.Circle length is equal to : " + getPerimetr() + "\n" + "hometask1.Circle area is equal to : " + getArea();
    }
}
