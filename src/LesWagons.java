import java.util.ArrayList;

public class LesWagons {
    private ArrayList<Wagon> lWagons;

    public void addWagon(Wagon w){
        this.lWagons.add(w);
    }

    public void removeWagon(){
        this.lWagons.remove(lWagons.size()-1);
    }

    public double getMasseTotale() {
        double n = 0;
        for (Wagon lWagon : lWagons) n += lWagon.getMasseTotale();
        return n;
    }
}