package es.iesmz.tests;

public class DiasLLuvia {

    private boolean calendario[][]=new boolean[12][31];



    public boolean registroDia(int dia, int mes, boolean lluvia){
        //Comprueba el día es correcto
        if(dia>0 && dia<32){
            //Comprueba el mes es correcto
            if(mes>0 && mes<13){
                if(lluvia){
                    this.calendario [mes] [dia]=true;
                }else{
                    this.calendario[mes][dia]=false;
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
}
