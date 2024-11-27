package Trasee;

import Interfete.ITraseeMontane;

public class TraseuMontan implements ITraseeMontane {
    private String traseu;
    private String marcaj;
    private String durataTraseu;
    private DescriereTraseu detalii;


    public TraseuMontan(String traseu, String marcaj, String durataTraseu,DescriereTraseu detalii) {
        this.traseu = traseu;
        this.marcaj = marcaj;
        this.durataTraseu = durataTraseu;
        this.detalii=detalii;

    }


    public String getTraseu() {
        return traseu;
    }

    public String getMarcaj() {
        return marcaj;
    }

    public String getDurataTraseu() {
        return durataTraseu;
    }
    public DescriereTraseu getDetaliiTraseu() {
        return detalii;
    }

    public void setMarcaj(String marcaj){
        this.marcaj=marcaj;
    }

    @Override
    public String toString() {
        return  "Traseu: "+getTraseu()+"\n"+
                "Marcaj: "+getMarcaj()+"\n"+
                "Durata: "+getDurataTraseu()+"\n"+
                "Dificultate: "+getDetaliiTraseu().getDificultate()+"\n"+
                "Descrierea traseului: "+getDetaliiTraseu().getDetalii()+"\n";

    }
}
