import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrej on 15.03.2016.
 */
public class Save {

    private static List<List<Player>> slots = new ArrayList<>();
    static { for(int i =0; i<5; i++)
            slots.add(new ArrayList<Player>());

    }

    static void save(ArrayList<Player> players, int numSlotForWrite){
        slots.get(numSlotForWrite).clear();
        for(Player p: players){
            try {
                slots.get(numSlotForWrite).add((Player) p.clone());
            }catch (Exception e){}
        }
    }

    static List<Player> read(int numSlotForRead){
        return slots.get(numSlotForRead);
    }

    static void cleanSlot(int numSlot){
        slots.get(numSlot).clear();
    }

    static void printTest(){
        System.out.println(slots);
    }
}
