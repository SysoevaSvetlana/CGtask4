package org.example.Math;

public interface Vector {
    public double[] getArrValues(); //массив значений вектора
    public Vector subtraction( Vector vector); //вычитание
    public Vector  addition(Vector vector); //сложение
    public Vector scale(double a); //масштабирование
    public double length();
    public Vector normalization();
    public double scalarProduct(Vector vector); //скалярное произвдение
    public double cosAngleBetweenVectors(Vector vector); //косинус угла между текущим вектором и переданным
    public int getDimensional();
    public double getLength();
}
