public class Billet {
    private String nom;
    private String prenom;
    private String nDossier;
    private int nPlace;
    private Voiture voiture;


    public Billet(String nom, String prenom, String nDossier, int nPlace, Voiture voiture){
        this.nom = nom;
        this.prenom = prenom;
        this.nDossier = nDossier;
        this.nPlace = nPlace;
        this.voiture = voiture;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public String getNDossier(){
        return this.nDossier;
    }


    public int getNPlace(){
        return this.nPlace;
    }

    public Voiture getVoiture(){
        return this.voiture;
    }

    public void setNDossier(String n){
        this.nDossier = n;
    }


    public void setPrenom(String n){
        this.prenom = n;
    }

    public void setNom(String n){
        this.nom = n;
    }

    public void setNPlace(String n){
        this.prenom = n;
    }

    public void setVoiture(Voiture v){
        this.voiture = v;
    }
}


