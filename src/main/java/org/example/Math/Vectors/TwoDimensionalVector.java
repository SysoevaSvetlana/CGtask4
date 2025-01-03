package org.example.Math.Vectors;

public class TwoDimensionalVector extends NDimensionalVector  {

    final private  double a;
    final private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public TwoDimensionalVector(double a, double b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }
    public static TwoDimensionalVector addition(TwoDimensionalVector a, TwoDimensionalVector b){
        return new TwoDimensionalVector(a.getA() + b.getA(), a.getB() + b.getB());
    }

    public static TwoDimensionalVector subtraction(TwoDimensionalVector a, TwoDimensionalVector b){
        return new TwoDimensionalVector(a.getA() - b.getA(), a.getB() - b.getB());
    }

    @Override
    public double[] getArrValues() {
        return new double[]{a,b};
    }
    public static TwoDimensionalVector scale(double a, TwoDimensionalVector vector) {
        return  new TwoDimensionalVector(vector.getA() * a, vector.getB() * a);
    }
    @Override
    public double length() {
        return this.length;
    }

    @Override
    public TwoDimensionalVector normalization() {
        return new TwoDimensionalVector(this.a / length, this.b / length);
    }
    public static double scalarProduct(TwoDimensionalVector vector1, TwoDimensionalVector vector2){
        return vector1.length * vector2.length * vector1.cosAngleBetweenVectors( vector2);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoDimensionalVector vector = (TwoDimensionalVector) o;
        return Double.compare(vector.a, a) == 0 && Double.compare(vector.b, b) == 0;
    }
}
