package hometask1;

import hometask1.Quadrangle;

class Rhombus extends Quadrangle {

    private double a;
    private double h;

    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
        this.setFigureName("hometask1.Rhombus");

    }

    double getPerimetr() {
        return this.a * 4;
    }

    @Override
    double getArea() {
        return this.a * this.h;

    }

}
