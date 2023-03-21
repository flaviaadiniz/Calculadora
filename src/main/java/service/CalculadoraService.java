/*
Parte 01 - Utilizando o código do link, você deve criar no mínimo 1 teste para cada método existente.

Parte 02 - Criar método para retornar a área do quadrado e do triângulo.

Parte 03 - Criar método trianguloDeMenorArea(...) que compara dois triângulos e retorna o de menor área
e quadradoDeMenorArea(...) que compara dois quadrados e retorna o de menor área.

Parte 04 - Criar testes dos novos métodos.

Extra: Utilizar o máximo de assertivas diferentes possível.
*/

package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {

    public int somar(int a, int b) {
        return a+b;
    }

    public int subtrair(int a, int b) {
        return a-b;
    }

    public int dividir(int a, int b) {
        return a/b;
    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

    public Double calcularAreaTriangulo(Triangulo triangulo) {
        if (triangulo != null) {
            return (triangulo.getBase() * triangulo.getAltura()) / 2;
        } else {
            System.out.println("Erro! Informe um triângulo válido!");
            return null;
        }
    }

    public Double calcularAreaQuadrado(Quadrado quadrado) {
        if (quadrado != null) {
            return quadrado.getLado() * quadrado.getLado();
        } else {
            System.out.println("Erro! Informe um quadrado válido!");
            return null;
        }

    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        if (calcularAreaTriangulo(triangulo1) < calcularAreaTriangulo(triangulo2)) {
            return triangulo1;
        } else if (calcularAreaTriangulo(triangulo2) < calcularAreaTriangulo(triangulo1)){
            return triangulo2;
        } else {
            return null;
        }
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        if (calcularAreaQuadrado(quadrado1) < calcularAreaQuadrado(quadrado2)) {
            return quadrado1;
        } else if (calcularAreaQuadrado(quadrado2) < calcularAreaQuadrado(quadrado1)) {
            return quadrado2;
        } else {
            return null;
        }
    }

}
