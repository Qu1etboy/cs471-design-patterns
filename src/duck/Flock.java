package duck;

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();
    Quackable leader;

    public void add(Quackable quacker) {
        // If the list of quackers are empty that mean
        // this is the first quacker added to the list.
        // Which mean it a leader.
        if (quackers.isEmpty()) {
            leader = quacker;
        }
        quackers.add(quacker);
    }

    public void quack() {
        for (Quackable quacker : quackers) {
            if (quacker.equals(leader)) {
                // If it is a leader, then quack 3 times
                quacker.quack();
                quacker.quack();
                quacker.quack();
            } else {
                quacker.quack();
            }
        }
    }
}
