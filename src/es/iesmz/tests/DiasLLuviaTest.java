package es.iesmz.tests;
import static org.junit.jupiter.api.Assertions.*;

class DiasLLuviaTest {

    @org.junit.jupiter.api.Test
    void registroDia1() {
        // Arrange
        DiasLLuvia l=new DiasLLuvia();
        int dia=03;
        int mes=04;
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
        int dia=18;
        int mes=13;
        boolean lluvia=false;
        //ACT
        boolean registro=l.registroDia(dia,mes,lluvia);
        //ASSERT
        assertFalse(registro);
    }




    @org.junit.jupiter.api.Test
    void consultarDia() {
    }

    @org.junit.jupiter.api.Test
    void contarDiasLluviosos() {
    }

    @org.junit.jupiter.api.Test
    void trimestreLluvioso() {
    }

    @org.junit.jupiter.api.Test
    void primerDiaLluvia() {
    }
}