public class Length {
    private double value;
    private Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        Length length = (Length) o;
        return this.unit.baseValue(this.value) == length.unit.baseValue(length.value);
    }

    public Length add(Length m) {
        return new Length(this.unit.baseValue(this.value) + m.unit.baseValue(m.value), Unit.CM);
    }

    public Length minus(Length m) {
        return new Length(this.unit.baseValue(this.value) - m.unit.baseValue(m.value), Unit.CM);
    }

}
