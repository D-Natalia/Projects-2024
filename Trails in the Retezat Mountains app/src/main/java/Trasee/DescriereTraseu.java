package Trasee;

import Interfete.IDescrieteTraseu;

public class DescriereTraseu implements IDescrieteTraseu {
    private String detalii;
    private String dificultate;

    public DescriereTraseu(String dificultate,String detalii){
        this.detalii=detalii;
        this.dificultate=dificultate;
    }
    public String getDificultate(){
        return dificultate;
    }
    public String getDetalii(){
        return detalii;
    }

    public void afiseazaDetalii() {
        System.out.println("Descriere: " + detalii);
        System.out.println("Dificultate: " + dificultate);
}


    public static class DetaliiTraseuAvansat extends DescriereTraseu {
        private String echipamentNecesar;

        public DetaliiTraseuAvansat(String detalii, String dificultate, String echipamentNecesar) {
            super(detalii, dificultate);
            this.echipamentNecesar = echipamentNecesar;
        }

        @Override
        public void afiseazaDetalii() {
            super.afiseazaDetalii();
            System.out.println("Echipament necesar: " + echipamentNecesar);
        }
    }
}



