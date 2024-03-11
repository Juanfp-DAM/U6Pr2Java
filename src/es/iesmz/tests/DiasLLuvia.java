package es.iesmz.tests;

public class DiasLLuvia {

    private boolean calendarioLluvia[][]=new boolean[13][32];

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

    public int contarDiasLluviosos(){
        int nDiasLlueve=0;
        for(int i=1; i<=12; i++){
            for(int j=1; j<=31; j++){
                if(this.calendarioLluvia [i] [j]){
                    nDiasLlueve++;
                }
            }
        }
        return nDiasLlueve;
    }


    public int trimestreLluvioso(){
        int trim1=0, trim2=0, trim3=0, trim4=0;
        for(int i=1; i<=12; i++){
            for(int j=1; j<=31; j++){
                if(i<3){
                    if(this.calendarioLluvia [i] [j]) {
                        trim1++;
                    }
                }else if(i>=3&&i<6){
                    if(this.calendarioLluvia [i] [j]) {
                        trim2++;
                    }
                }else if(i>=6&&i<9){
                    if(this.calendarioLluvia [i] [j]) {
                        trim3++;
                    }
                }else{
                    if(this.calendarioLluvia [i] [j]) {
                        trim4++;
                    }
                }
            }
        }
        if(trim1>trim2 && trim1>trim3 && trim1>trim4){
            return 1;
        }
        if(trim2>trim1 && trim2>trim3 && trim2>trim4){
            return 2;
        }
        if(trim3>trim1 && trim3>trim2 && trim3>trim4){
            return 3;
        }
        return 4;
    }


    public int primerDiaLluvia(){
        int dia=-1;
        for(int i=1; i<=12; i++){
            for(int j=1; j<=31; j++){
                if(this.calendarioLluvia [i] [j]){
                    dia=i*j;
                }
            }
        }
        return dia;
    }

}
