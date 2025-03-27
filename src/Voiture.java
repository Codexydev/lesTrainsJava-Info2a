import java.util.ArrayList;
public class Voiture extends Wagon{
    private int classe;
    private int capacitePlace;
/*    private lesBillets reservation;*/

    public Voiture(String num, String type, double masse) {
        super(num, type, masse);
    }

    public double getMasseTotale(){
        return super.getMasse();
    }

    // Setters
    public void setClasse(int classe) { this.classe = classe; }
    public void setCapacitePlace(int capacitePlace) { this.capacitePlace = capacitePlace; }

    // Getters
    public int getClasse() { return this.classe; }
    public int getCapacitePlace() { return this.capacitePlace; }

    public int getNombreReservation(){
        return 0;
    }
}