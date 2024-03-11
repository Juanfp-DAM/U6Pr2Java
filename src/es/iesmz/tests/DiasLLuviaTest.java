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
        int mes=11;
        boolean lluvia=false;
        l0.registroDia(dia,mes,lluvia);

        //ACT
        boolean comprueba=l0.consultarDia(dia,mes);

        //ASSERT
        assertFalse(comprueba);
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