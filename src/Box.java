 class Box extends Shape {


    public Box(double lengthA, double lengthB, double heightH) {
        super(lengthA, lengthB, heightH);
    }

    public Box(double heightH, double radiusR) {
        super(heightH, radiusR);
    }

    public double countSphereVolume(Box box) {
        return (4 * 3.14 * Math.pow(getRadiusR(), 3)) / 3;
    }

    public double countCylinderVolume(Box box) {
        return 3.14 * getRadiusR() * getRadiusR() * getHeightH();
    }
}