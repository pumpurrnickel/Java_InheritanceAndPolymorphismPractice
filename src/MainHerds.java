public class MainHerds {

    public static void main(String[] args) {
        
        Herds herd = new Herds();
        herd.addToHerd(new Organism(33, 41));
        herd.addToHerd(new Organism(56, 85));
        herd.addToHerd(new Organism(21, 13));
        herd.addToHerd(new Organism(57, 68));
        System.out.println(herd);
        
        System.out.println("\n Moving...");
        herd.move(45, 57);
        System.out.println(herd);
        
    }
}