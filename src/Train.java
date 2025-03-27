import java.util.ArrayList;

public class Train {
    private String id;
    private int dateDepart;
    private int heureDepart;
    private ArrayList<String> ligne;
    private LesWagons wagons;
    private Locomotive loco;


    public void setId(String n) {this.id = n;}
    public void setDateDepart(int n) {this.dateDepart = n;}
    public void setHeureDepart(int n) {this.heureDepart = n;}
    public void addLigne(String l){this.ligne.add(l);}

    public String getId(){return this.id;}
    public int getDateDepart(){return this.dateDepart;}
    public int getHeureDepart(){return this.heureDepart;}


    public Train(String id, int dateDepart, int heureDepart, ArrayList<String> ligne, LesWagons wagons, Locomotive loco){
        this.id = id;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.ligne = ligne;
        this.wagons = wagons;
        this.loco = loco;
    }

    public void ajouteWagon(Wagon w){
        if (this.wagons.getMasseTotale() + w.getMasseTotale()<loco.getMasseTract())
            this.wagons.addWagon(w);
        else
            System.out.println("Impossible d'ajouter le wagon");
    }
}

