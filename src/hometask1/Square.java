package hometask1;

import hometask1.Quadrangle;

class Square extends Quadrangle {

    private double a;

    public Square(double a) {
        this.a = a;
        this.setFigureName("hometask1.Square");

    }

    @Override
    double getPerimetr() {

        return a * 4;
    }

    @Override
    double getArea() {
        return a * a;
    }


}
