package by.it.ithoitan.jd01_07;

class Scalar extends Var {
    private final double value;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(Scalar otherScalar) {
        value=otherScalar.value;
    }

    public Scalar(String stringValue) {
        value=Double.parseDouble(stringValue);
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
