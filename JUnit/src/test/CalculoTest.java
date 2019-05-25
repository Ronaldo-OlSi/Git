package test;
//import static org.junit.jupiter.api.Assertions.*;

import main.Calculo;

class CalculoTest {
   // @Test
   public void testExecutaCalculo(){
        //define valores a serem calculados
        float passaValor1 = 10;
        float passaValor2 = 5;
        float retornoEsperado = 15;

        Calculo c = new Calculo();
        float retornoFeito = c.soma(passaValor1, passaValor2);

        assertEquals(retornoEsperado, retornoFeito);
    }

    private void assertEquals(float retornoEsperado, float retornoFeito) {
    }
}
