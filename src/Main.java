import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrej on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        for(int i = 0; i<5; i++)
            players.add(new Player());


        Save.save((ArrayList<Player>) players, 2);
        Save.save((ArrayList<Player>) Save.read(2), 1);
        players.get(0).lvl = 5;
        Save.save((ArrayList<Player>) players, 0);

        Save.printTest();

        players.clear();

        for(int i = 0; i<3; i++)
            players.add(new Player());

        Save.save((ArrayList<Player>) players, 4);
        Save.cleanSlot(0);

        Save.printTest();


    }
}
