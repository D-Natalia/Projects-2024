package Interfete;

import Utilizator.Utilizator;

public interface IUtilizator {
    public String getNume();
    public String getNivelDeExperienta();
    public void setNume(String nume);
    public void setNivelDeExperienta(String nivelDeExperienta);
    public boolean equals(Object obj);
    public String afiseazaDetalii();
    public void setNivelNouExperienta(String nivel);

}
