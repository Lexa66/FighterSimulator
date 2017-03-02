import java.util.LinkedList;
import java.util.List;

public class Main {
    static Arena arena = new Arena();

    static void action(List<Fighter> fighters) {
        while (true) {
            arena.fight(fighters);
            if (fighters.size() < 2) {
                System.out.println();
                System.out.println("Winner of tournament: " + fighters.get(0).getName());
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<Fighter> fighters = new LinkedList<Fighter>();
        for (int i = 0; i < 100; i++) {
            fighters.add(Fighter.createFighter("Fighter" + i));
        }
        action(fighters);
    }
}

