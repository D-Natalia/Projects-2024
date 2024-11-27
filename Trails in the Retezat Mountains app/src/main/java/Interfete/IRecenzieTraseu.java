package Interfete;

import Trasee.TraseuMontan;
import Utilizator.RecenzieTraseu;
import Utilizator.Utilizator;

import java.util.ArrayList;
import java.util.List;

public interface IRecenzieTraseu {
    public String getRecenzie();
    public int getReiting();
    public TraseuMontan getTraseuSelectat();
    public void setRecenzie(String recenzie);
    public void setReiting(int reiting);
    public void lasaRecenzie (TraseuMontan traseuSelectat, Utilizator utilizator);
    public List<RecenzieTraseu> getRecenziiPentruUtilizator(Utilizator utilizator);
    public String toString();
}
