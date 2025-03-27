public class Locomotive {
    private double masseTract;
    private String id;

    public void setId(String n){this.id =n;}
    public void setMasseTract(double m){this.masseTract = m;}

    public String getId(){return this.id;}
    public double getMasseTract(){return this.masseTract;}

    public Locomotive(String id, double masseTract){
        this.masseTract=masseTract;
        this.id = id;
    }

    public Locomotive(){
        this("",0);
    }
}
