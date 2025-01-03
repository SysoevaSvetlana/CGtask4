package org.example.Math.Vectors;


import java.util.Arrays;

public class FourDimensionalVector extends NDimensionalVector{
    final private double a;
    final private double b;
    final private double c;
    final private double d;
    public FourDimensionalVector(double a, double b, double c, double d){
        super(a,b,c,d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public static FourDimensionalVector subtraction(FourDimensionalVector vector1, FourDimensionalVector vector2){
        return new FourDimensionalVector(
                vector1.a - vector2.a,
                vector1.b - vector2.b,
                vector1.c - vector2.c,
                vector1.d - vector2.d
        );
    }
    public static FourDimensionalVector addition(FourDimensionalVector vector1, FourDimensionalVector vector2){
        return new FourDimensionalVector(
                vector1.a + vector2.a,
                vector1.b + vector2.b,
                vector1.c + vector2.c,
                vector1.d + vector2.d
        );
    }
    @Override
    public FourDimensionalVector scale(double a) {
        return new FourDimensionalVector(
                this.a * a,
                this.b * a,
                this.c * a,
                this.d * a
        );
    }

    @Override
    public double length() {
        return length;
    }

    @Override
    public FourDimensionalVector normalization() {
        return new FourDimensionalVector(this.a / length, this.b / length, this.c / length, this.d / length);
    }
    @Override
    public double[] getArrValues() {
        return new double[]{a,b,c,d};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NDimensionalVector that = (NDimensionalVector) o;
        return Arrays.equals(values, that.values);
    }
}
