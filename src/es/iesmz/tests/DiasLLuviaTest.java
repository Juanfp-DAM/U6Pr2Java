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
    }

    @org.junit.jupiter.api.Test
    void primerDiaLluvia() {
    }
}