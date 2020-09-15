class Circle {

    double radius;

    public double getLength() {

        double length1 = 2 * Math.PI * radius;
        return length1;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

}