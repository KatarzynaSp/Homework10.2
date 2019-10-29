 class Product extends Shape {

    public Product() {
    }

    public Product(double lengthA, double lengthB, double heightH) {
        super(lengthA, lengthB, heightH);
    }

    public Product(double radiusR) {
        super(radiusR);
    }

    public double countCubeVolume(Product product) {
        return getLengthA() * getLengthB() * getHeightH();
    }

    public double countSphereVolume(Product product) {
        return (4 * 3.14 * Math.pow(getRadiusR(), 3)) / 3;
    }
}