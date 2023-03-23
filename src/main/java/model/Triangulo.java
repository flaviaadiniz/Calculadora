package model;

import java.util.Objects;

public class Triangulo {

    private Double base;
    private Double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return Objects.equals(base, triangulo.base) && Objects.equals(altura, triangulo.altura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }
}
