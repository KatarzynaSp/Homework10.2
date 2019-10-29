class Shape {
    private double lengthA;
    private double lengthB;
    private double heightH;
    private double radiusR;

    public Shape() {
    }

    public Shape(double lengthA, double lengthB, double heightH) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.heightH = heightH;
    }

    public Shape(double heightH, double radiusR) {
        this.heightH = heightH;
        this.radiusR = radiusR;
    }

    public Shape(double radiusR) {
        this.radiusR = radiusR;
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getHeightH() {
        return heightH;
    }

    public void setHeightH(double heightH) {
        this.heightH = heightH;
    }

    public double getRadiusR() {
        return radiusR;
    }

    public void setRadiusR(double radiusR) {
        this.radiusR = radiusR;
    }

}
