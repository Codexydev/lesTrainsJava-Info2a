public abstract class Wagon {
    private double masse;
    private String id;
    private String type;

    public Wagon(String num, String type, double masse){
        this.masse = masse;
        this.type=type;
        this.id = num;
    }

    public double getMasse(){
        return this.masse;
    }

/*    public double getMasseTotale(){
        if (this.type.equals("marchandise"))
            return this.masse+ marchandise.getMasseTotale();
        return this.masse;
    }*/

    public abstract double getMasseTotale();

    public String getId(){
        return this.id;
    }

    public void setMasse (double m){
        if (m<0)
            System.out.println("erreur");
        else
            this.masse = m;
    }

    public void setId (String n){
        this.id = n;
    }
}
