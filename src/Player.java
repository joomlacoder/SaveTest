/**
 * Created by Andrej on 15.03.2016.
 */
public class Player {
    String name;
    int lvl = 1;
    static int count = 0;
    Player(){
        name = "Pl " + count++;
    }

    private Player(String name, int lvl){
        this.name = name;
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        return name + " " + lvl;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Player(name, lvl);
    }
}
