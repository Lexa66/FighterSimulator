
import java.util.List;
import java.util.Random;

public class Arena {

    public void fight(List<Fighter> fighters) {
        Random r = new Random();
        Boolean b = r.nextBoolean();
        Fighter first = (b == true ? fighters.get(0) : fighters.get(1));
        Fighter second = (b == false ? fighters.get(0) : fighters.get(1));

        while (true) {
            first.kick(second);
            if (second.getHealth() < 1) {
                fighters.remove(second);
                fighters.add(first);
                fighters.remove(first);
                System.out.println("Winner in this round is: " + first.getName());
                break;
            }
            second.kick(first);
            if (first.getHealth() < 1) {
                fighters.remove(first);
                fighters.add(second);
                fighters.remove(second);
                System.out.println("Winner in this round is : " + second.getName());
                break;
            }
        }
    }
}
