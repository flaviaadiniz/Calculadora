package model;

import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {
    @Test
    public void deveCriarUmTriangulo() {
        //WHEN: um novo triângulo com valor de base e altura é criado
        Triangulo triangulo = new Triangulo(3, 5);

        //THEN: Deve criar um objeto do tipo triângulo
        Assert.assertEquals(Triangulo.class, triangulo.getClass());
    }

}
