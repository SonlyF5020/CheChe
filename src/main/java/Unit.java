enum Unit {
    M(100.0), CM(1.0);
    private double ratio;

    Unit(double ratio) {
        this.ratio = ratio;
    }

    public double baseValue(double value) {
        return ratio * value;
    }
}
