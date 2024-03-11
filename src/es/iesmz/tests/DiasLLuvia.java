package es.iesmz.tests;

public class DiasLLuvia {

    private boolean calendarioLluvia[][]=new boolean[12][31];

    public boolean registroDia(int dia, int mes, boolean lluvia){
        //Comprueba el día es correcto
        if(dia>0 && dia<32){
            //Comprueba el mes es correcto
            if(mes>0 && mes<13){
                if(lluvia){
                    this.calendarioLluvia [mes] [dia]=true;
                }else{
                    this.calendarioLluvia[mes][dia]=false;
                }
                return true;
            }else{
                System.err.println("Mes introducido es incorrecto.");
                return false;
            }
        }else{
            System.err.println("Dia introducido incrrecto.");
            return false;
        }
    }

    public boolean consultarDia(int dia, int mes) {
        return this.calendarioLluvia[mes][dia];
    }




}
