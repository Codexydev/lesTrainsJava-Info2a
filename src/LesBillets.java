import java.util.ArrayList;
public class LesBillets {
    private ArrayList<Billet> lBillets;

    public LesBillets(){
        this.lBillets = new ArrayList<Billet>();
    }

    public int getNb(){
        return this.lBillets.size();
    }

    public int getNbBillet(){
        int n = 0;
        for (int i = 0;i<this.getNb();i++){
            if (lBillets.get(i) != null){
                n++;
            }
        }
        return n;
    }

    public boolean isVide(){
        return this.lBillets.isEmpty();
    }

    public void ajoute(Billet b){
        for (int i = 0;i<this.getNb();i++){
            if (lBillets.get(i) == null){
                lBillets.set(i,b);
                return;
            }
            lBillets.add(b);
        }
    }

    public void retire(Billet b){
        for (int i = 0;i<this.getNb();i++){
            if (lBillets.get(i) == b){
                lBillets.set(i,null);
                return;
            }
        }
    }

    public Billet getBillet(int i){
        return lBillets.get(i);
    }
}
