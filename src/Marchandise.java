public class Marchandise extends Wagon{
    private double masseMax;
    private double masseMarchandise;
    private String nature;

    public Marchandise(String nature, double masse, double capacite, double masseWagon, String id){
        super(id,"marchandise",masseWagon);
        this.nature = nature;
        this.masseMarchandise = masse;


    }
    // Setters
    public void setMasseMax(double masseMax) { this.masseMax = masseMax; }
    public void setMasseMarchandise(double m) { if (m>this.getMasseMax()) System.out.println("erreur");else this.masseMarchandise = m;}
    public void setNature(String nature) { this.nature = nature; }

    // Getters
    public double getMasseMax() { return this.masseMax; }
    public double getMasseMarchandise() { return this.masseMarchandise; }
    public String getNature() { return this.nature; }


    // methods
    public double getMasseTotale(){
        return masseMarchandise+super.getMasse();
    }

}