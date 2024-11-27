package Utilizator;

import Interfete.IRecenzieTraseu;
import Trasee.TraseuMontan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecenzieTraseu implements IRecenzieTraseu {
        private String recenzie;
        public int reiting;
        private TraseuMontan traseuSelectat;
        List<TraseuMontan> traseeDeAles;
        private ArrayList<RecenzieTraseu> recenzii = new ArrayList<>();
        private Utilizator utilizator;
        public RecenzieTraseu(String recenzie,int reiting,TraseuMontan traseuSelectat,List<TraseuMontan> traseeDeAles,Utilizator utilizator){
            this.recenzie=recenzie;
            this.reiting=reiting;
            this.traseuSelectat=traseuSelectat;
            this.traseeDeAles = traseeDeAles;
            this.recenzii = new ArrayList<>();
            this.utilizator=utilizator;
        }


        public String getRecenzie(){
            return recenzie;
        }
        public int getReiting(){
            return reiting;
        }
        public TraseuMontan getTraseuSelectat(){
            return traseuSelectat;
        }
        public void setRecenzie(String recenzie){
            this.recenzie=recenzie;
        }
        public void setReiting(int reiting){
            this.reiting=reiting;
        }

        public void lasaRecenzie (TraseuMontan traseuSelectat,Utilizator utilizator){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Alege traseul pentru care vrei sa lasi o recenzie: ");
            for (int i = 0; i < traseeDeAles.size(); i++) {
                System.out.println((i+1) + ". " + traseeDeAles.get(i).getTraseu());
            }
            int traseuAles = scanner.nextInt();
            if (traseuAles < 1 || traseuAles > traseeDeAles.size()) {
                System.out.println("Alegere invalidă. Te rog alege un număr corect.");
                return;
            }
            System.out.println("Introduceti o recenzie: ");
            String recenzie = scanner.next();
            System.out.println("Alege un rating de la 1 la 5: ");
            int reting = scanner.nextInt();
            RecenzieTraseu recenzieNoua = new RecenzieTraseu( recenzie, reting, traseuSelectat,traseeDeAles,utilizator);
            recenzii.add(recenzieNoua);
            System.out.println("Recenzia a fost adăugată cu succes!");

        }

        public List<RecenzieTraseu> getRecenziiPentruUtilizator(Utilizator utilizator) {
            List<RecenzieTraseu> recenziiUtilizator = new ArrayList<>();
            for (RecenzieTraseu recenzie : recenzii) {
                if (recenzie.utilizator != null && recenzie.utilizator.equals(utilizator)) {
                    recenziiUtilizator.add(recenzie);
                }
            }
            return recenziiUtilizator;}

        @Override
        public String toString() {
            return " Recenzie: " + recenzie + ", Rating: " + reiting + ", Utilizator: " + utilizator.getNume();
        }

}
