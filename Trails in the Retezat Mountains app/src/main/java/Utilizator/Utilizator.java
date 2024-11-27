package Utilizator;

public class Utilizator {
    private String nume;
    private String nivelDeExperienta;

    public Utilizator(String nume, String nivelDeExperienta) {
        this.nume = nume;
        this.nivelDeExperienta = nivelDeExperienta;
    }

    public String getNume() {
        return nume;
    }

    public String getNivelDeExperienta() {
        return nivelDeExperienta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNivelDeExperienta(String nivelDeExperienta) {
        this.nivelDeExperienta = nivelDeExperienta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Utilizator)) return false;
        Utilizator utilizator = (Utilizator) obj;
        return nume.equals(utilizator.nume);
    }

    public String afiseazaDetalii() {
        return "Utilizator: " + nume + ", Nivel de Experiență: " + nivelDeExperienta;
    }

    public static class UtilizatorNou extends Utilizator {
        public UtilizatorNou(String nume) {
            super(nume, "Incepator");
        }

        public void setNivelNouExperienta(String nivel) {

            setNivelDeExperienta(nivel);
        }

        @Override
        public String afiseazaDetalii() {
            return "Utilizator Nou: " + getNume() + ", Nivel de Experiență: " + getNivelDeExperienta();
        }
    }
}
