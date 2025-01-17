package by.it.drankevich.jd01_09;

abstract class Var implements Operation {
    @Override
    public Var add(Var other) {
        System.out.printf("Operation %s + %s unsupported%n", this, other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Operation %s - %s unsupported%n", this, other);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Operation %s * %s unsupported%n", this, other);
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Operation %s / %s unsupported%n", this, other);
        return null;
    }

    @Override
    public String toString() {
        return "unknown variable (abstract stub)";
    }
}
