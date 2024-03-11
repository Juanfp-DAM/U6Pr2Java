package es.iesmz.tests;
import static org.junit.jupiter.api.Assertions.*;

class DiasLLuviaTest {

    @org.junit.jupiter.api.Test
    void registroDia1() {
        // Arrange
        DiasLLuvia l=new DiasLLuvia();
        int dia=10;
        int mes=12;
        boolean lluvia=true;
        //ACT
        boolean registro=l.registroDia(dia,mes,lluvia);
        //ASSERT
        assertTrue(registro);
    }

    @org.junit.jupiter.api.Test
    void registroDia2() {
        // Arrange
        DiasLLuvia l=new DiasLLuvia();
        int dia=25;
        int mes=8;
        boolean lluvia=false;
        //ACT
        boolean registro=l.registroDia(dia,mes,lluvia);
        //ASSERT
        assertTrue(registro);
    }

    @org.junit.jupiter.api.Test
    void registroDia3() {
        // Arrange
        DiasLLuvia l=new DiasLLuvia();
        int dia=15;
        int mes=13;
        boolean lluvia=false;
        //ACT
        boolean registro=l.registroDia(dia,mes,lluvia);
        //ASSERT
        assertFalse(registro);
    }




    @org.junit.jupiter.api.Test
    void consultarDia1() {
        //ARRANGE
        DiasLLuvia ll=new DiasLLuvia();
        int dia=12;
        int mes=3;
        boolean lluvia=true;
        ll.registroDia(dia,mes,lluvia);

        //ACT
        boolean comprueba=ll.consultarDia(dia,mes);

        //ASSERT
        assertTrue(comprueba);
    }
    @org.junit.jupiter.api.Test
    void consultarDia2() {
        //ARRANGE
        DiasLLuvia ll=new DiasLLuvia();
        int dia=05;
        int mes=10;
        boolean lluvia=true;
        ll.registroDia(dia,mes,lluvia);

        //ACT
        boolean comprueba=ll.consultarDia(dia,mes);

        //ASSERT
        assertTrue(comprueba);
    }
    @org.junit.jupiter.api.Test
    void consultarDia3() {
        //ARRANGE
        DiasLLuvia l0=new DiasLLuvia();
        int dia=15;
        int mes=12;
        boolean lluvia=false;
        l0.registroDia(dia,mes,lluvia);

        //ACT
        boolean comprueba=l0.consultarDia(dia,mes);

        //ASSERT
        assertFalse(comprueba);
    }

    @org.junit.jupiter.api.Test
    void contarDiasLluviosos() {
        DiasLLuvia l =new DiasLLuvia();
        l.registroDia(1,12,true);
        l.registroDia(2,2,true);
        l.registroDia(3,2, false);
        l.registroDia(1,1,true);

        int comprueba=l.contarDiasLluviosos();

        assertEquals(3,comprueba);
    }
    @org.junit.jupiter.api.Test
    void contarDiasLluviosos2() {
        DiasLLuvia l =new DiasLLuvia();
        l.registroDia(5,7,false);
        l.registroDia(2,2,true);
        l.registroDia(4,4, true);
        l.registroDia(11,5,true);
        l.registroDia(17,12,true);

        int comprueba=l.contarDiasLluviosos();

        assertEquals(4,comprueba);
    }

    @org.junit.jupiter.api.Test
    void contarDiasLluviosos3() {
        //ARRANGE
        DiasLLuvia l =new DiasLLuvia();
        l.registroDia(5,7,false);
        l.registroDia(2,2,true);
        l.registroDia(4,4, true);
        l.registroDia(11,5,true);
        l.registroDia(17,12,true);
        //ACT
        int comprueba=l.contarDiasLluviosos();
        //ASSERT
        assertNotEquals(2,comprueba);
    }

    @org.junit.jupiter.api.Test
    void trimestreLluvioso() {
        // Arrange
        DiasLLuvia l = new DiasLLuvia();
        l.registroDia(1, 1, true);
        l.registroDia(2, 1, true);
        l.registroDia(1, 2, true);
        l.registroDia(1, 5, true);
        l.registroDia(1, 6, true);
        l.registroDia(1, 7, true);
        l.registroDia(1, 10, true);
        // Act
        int resultado = l.trimestreLluvioso();

        // Assert
        assertEquals(1, resultado);
    }

    @org.junit.jupiter.api.Test
    void trimestreLluvioso2() {
        // Arrange
        DiasLLuvia l = new DiasLLuvia();
        l.registroDia(2, 1, true);
        l.registroDia(20, 1, true);
        l.registroDia(18, 4, true);
        l.registroDia(6, 5, true);
        l.registroDia(10, 5, true);
        l.registroDia(1, 7, true);
        l.registroDia(12, 7, true);
        l.registroDia(25, 8, true);
        l.registroDia(20, 8, true);
        l.registroDia(12, 9, true);
        l.registroDia(1, 10, true);
        // Act
        int resultado = l.trimestreLluvioso();

        // Assert
        assertEquals(3, resultado);
    }

    @org.junit.jupiter.api.Test
    void trimestreLluvioso3() {
        // Arrange
        DiasLLuvia l = new DiasLLuvia();
        // Simular días lluviosos en diferentes trimestres
        l.registroDia(2, 1, true);
        l.registroDia(20, 1, true);
        l.registroDia(18, 4, true);
        l.registroDia(6, 5, true);
        l.registroDia(10, 5, true);
        l.registroDia(1, 7, true);
        l.registroDia(12, 7, true);
        l.registroDia(25, 8, true);
        l.registroDia(1, 10, true);
        // Act
        int resultado = l.trimestreLluvioso();

        // Assert
        assertNotEquals(3, resultado);
    }

    @org.junit.jupiter.api.Test
    void primerDiaLluvia() {
        DiasLLuvia l = new DiasLLuvia();
        //ARRANGE
        l.registroDia(2, 1, true);
        l.registroDia(20, 1, true);
        l.registroDia(18, 4, true);
        l.registroDia(6, 5, true);
        l.registroDia(10, 5, true);
        l.registroDia(1, 7, true);
        l.registroDia(12, 7, true);
        l.registroDia(25, 8, true);
        l.registroDia(20, 8, true);
        l.registroDia(12, 9, true);
        l.registroDia(1, 10, true);
        //ACT
        int primerDia = l.primerDiaLluvia();
        //ASSERT
        assertEquals(2,primerDia);
    }

    @org.junit.jupiter.api.Test
    void primerDiaLluvia2() {
        DiasLLuvia l = new DiasLLuvia();
        //ARRANGE
        l.registroDia(4, 3, true);
        l.registroDia(6, 5, true);
        l.registroDia(12, 7, true);
        l.registroDia(25, 8, true);
        l.registroDia(20, 8, true);
        l.registroDia(12, 9, true);
        l.registroDia(1, 10, true);
        //ACT
        int primerDia = l.primerDiaLluvia();
        //ASSERT
        assertEquals(66,primerDia);
    }

    @org.junit.jupiter.api.Test
    void primerDiaLluvia3() {
        DiasLLuvia l = new DiasLLuvia();
        //ARRANGE
        l.registroDia(15, 6, true);
        l.registroDia(25, 8, true);
        l.registroDia(20, 8, true);
        l.registroDia(12, 9, true);
        l.registroDia(1, 10, true);
        //ACT
        int primerDia = l.primerDiaLluvia();
        //ASSERT
        assertNotEquals(96,primerDia);
    }

}