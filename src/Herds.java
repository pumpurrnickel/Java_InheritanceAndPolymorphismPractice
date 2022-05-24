import java.util.ArrayList;

public class Herds implements Movable {

    private ArrayList<Movable> herd;

    public Herds() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    public String toString() {
        String list = "";
        for (Movable movable : this.herd) {
            list += movable.toString() + "\n";
        }
        return list;
    }
    
}