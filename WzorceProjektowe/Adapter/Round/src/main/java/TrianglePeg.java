class TrianglePeg {
private double sideA;
private double sideB;
private double sideC;

    public TrianglePeg(){}

    public TrianglePeg(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
